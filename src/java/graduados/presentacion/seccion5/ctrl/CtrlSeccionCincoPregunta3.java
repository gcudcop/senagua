/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.seccion5.ctrl;

import graduados.logica.servicios.ServiciosPostgrado;
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
public class CtrlSeccionCincoPregunta3 {

    private CartesianChartModel lineModel;
    private PieChartModel pieModel;

    public CtrlSeccionCincoPregunta3() {
        this.init();
    }

    private void init() {
        this.graficar();
    }

    @PostConstruct
    public void graficar() {
        this.lineModel = lineChart();
        createPieModel2();
    }

    private CartesianChartModel lineChart() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries literalA = new ChartSeries();
            // literalA.setLabel("El avance planificado en lo que respecta a registro y aprobación de sus materias");
            for (int i = 0; i < ServiciosPostgrado.obtenerS5p3().size(); i++) {
                literalA.set(ServiciosPostgrado.obtenerS5p3().get(i).getS5p3(),
                        ServiciosPostgrado.obtenerS5p3DadoResp(ServiciosPostgrado.obtenerS5p3().get(i).getS5p3()).size());
            }
            model.addSeries(literalA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieModel2() {
        pieModel = new PieChartModel();
        try {
            for (int i = 0; i < ServiciosPostgrado.obtenerS5p3().size(); i++) {
                pieModel.set(ServiciosPostgrado.obtenerS5p3().get(i).getS5p3(),
                        ServiciosPostgrado.obtenerS5p3DadoResp(ServiciosPostgrado.obtenerS5p3().get(i).getS5p3()).size());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
