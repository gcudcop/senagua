/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.ctrl;

import graduados.logica.servicios.ServiciosGraduados;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author Geovanny
 */
@ManagedBean
@ViewScoped
public class CtrlGraduadoGenero implements Serializable{

    private CartesianChartModel lineModel;
    private PieChartModel pieModel;

    public CtrlGraduadoGenero() {
        this.graficar();
    }

    @PostConstruct
    public void graficar() {
        lineModel = grafica();
        createPieModel();
    }

    private CartesianChartModel grafica() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries test = new ChartSeries();
            test.setLabel("Genero");
            /*for (int i = 0; i < SrvcPerspectivaLaboral.obtenerSeccionDosPregunta10().size(); i++) {
             test.set(String.valueOf(SrvcPerspectivaLaboral.obtenerSeccionDosPregunta10().get(i).getS2p10()),
             SrvcPerspectivaLaboral.obtenerSeccionDosDadoPregunta10(SrvcPerspectivaLaboral.obtenerSeccionDosPregunta10().get(i).getS2p10()).size());
             }*/

            for (int i = 0; i < ServiciosGraduados.obtenerGeneroGraduados().size(); i++) {
                test.set(ServiciosGraduados.obtenerGeneroGraduados().get(i).getGenero(),
                        ServiciosGraduados.obtenerGrdauadosDadoGenero(ServiciosGraduados.obtenerGeneroGraduados().get(i).getGenero()).size());
            }

            model.addSeries(test);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieModel() {
        pieModel = new PieChartModel();
        try {
            for (int i = 0; i < ServiciosGraduados.obtenerGeneroGraduados().size(); i++) {
                pieModel.set(ServiciosGraduados.obtenerGeneroGraduados().get(i).getGenero(),
                        ServiciosGraduados.obtenerGrdauadosDadoGenero(ServiciosGraduados.obtenerGeneroGraduados().get(i).getGenero()).size());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }

    /*
     *** getters y setters
     */
    public CartesianChartModel getLineModel() {
        return lineModel;
    }

    public void setLineModel(CartesianChartModel lineModel) {
        this.lineModel = lineModel;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

}
