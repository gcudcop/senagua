/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.ctrl;

import graduados.logica.servicios.ServiciosGraduados;
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
public class CtrlEstadoCivil {

    private CartesianChartModel lineModel;
    private PieChartModel pieModel;

    public CtrlEstadoCivil() {
        this.graficar();
    }

    @PostConstruct
    private void graficar() {
        lineModel = grafica();
        createPieModel();
    }

    private CartesianChartModel grafica() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries test = new ChartSeries();
            test.setLabel("Estado Civil");

            for (int i = 0; i < ServiciosGraduados.obtenerEstadoCivilGraduados().size(); i++) {
                test.set(ServiciosGraduados.obtenerEstadoCivilGraduados().get(i).getEstadoCivil(),
                        ServiciosGraduados.obtenerGrdauadosDadoEstadoCivil(ServiciosGraduados.obtenerEstadoCivilGraduados().get(i).getEstadoCivil()).size());
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
                pieModel.set(ServiciosGraduados.obtenerEstadoCivilGraduados().get(i).getEstadoCivil(),
                        ServiciosGraduados.obtenerGrdauadosDadoEstadoCivil(ServiciosGraduados.obtenerEstadoCivilGraduados().get(i).getEstadoCivil()).size());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }

    /*
     **** getters y setters
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
