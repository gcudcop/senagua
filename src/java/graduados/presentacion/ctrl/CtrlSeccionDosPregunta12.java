/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.ctrl;

import graduados.logica.servicios.SrvcPerspectivaLaboral;
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
public class CtrlSeccionDosPregunta12 {

    private CartesianChartModel pregunta;
    private PieChartModel pieModel;

    @PostConstruct
    public void graficar() {
        pregunta = grafica();
        createPieModel2();
    }

    private CartesianChartModel grafica() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries test = new ChartSeries();
            test.setLabel("Trabaja para:");
            for (int i = 0; i < SrvcPerspectivaLaboral.obtenerSeccionDosPregunta12().size(); i++) {
                test.set(String.valueOf(SrvcPerspectivaLaboral.obtenerSeccionDosPregunta12().get(i).getS2p12()),
                        SrvcPerspectivaLaboral.obtenerSeccionDosDadoPregunta12(SrvcPerspectivaLaboral.obtenerSeccionDosPregunta12().get(i).getS2p12()).size());
            }

            model.addSeries(test);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieModel2() {
        pieModel = new PieChartModel();
        try {
            for (int i = 0; i < SrvcPerspectivaLaboral.obtenerSeccionDosPregunta12().size(); i++) {
                pieModel.set(String.valueOf(SrvcPerspectivaLaboral.obtenerSeccionDosPregunta12().get(i).getS2p12()),
                        SrvcPerspectivaLaboral.obtenerSeccionDosDadoPregunta12(SrvcPerspectivaLaboral.obtenerSeccionDosPregunta12().get(i).getS2p12()).size());
            }
        } catch (Exception e) {
        }

    }

    public CartesianChartModel getPregunta() {
        return pregunta;
    }

    public void setPregunta(CartesianChartModel pregunta) {
        this.pregunta = pregunta;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

    /**
     * getters y setters
     */
}
