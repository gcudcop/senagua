/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.seccion4.ctrl;

import graduados.logica.servicios.ServiciosGradoSatisfaccion;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import recursos.RespuestasSeccionCuatro;

/**
 *
 * @author Geovanny
 */
@ManagedBean
@ViewScoped
public class CtrlSeccionCuatroPreguntaNueve {

    private CartesianChartModel lineModel;
    private PieChartModel pieModel;

    public CtrlSeccionCuatroPreguntaNueve() {
        this.init();
    }

    private void init() {
        this.graficar();
    }

    @PostConstruct
    public void graficar() {
        this.lineModel = literalA();
        createPieModel2();
    }

    private CartesianChartModel literalA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries literalA = new ChartSeries();
            literalA.setLabel("El avance planificado en lo que respecta a registro y aprobación de sus materias");
            for (int i = 0; i < RespuestasSeccionCuatro.obtenerRespuestas().size(); i++) {
                literalA.set(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getValoracion(),
                        ServiciosGradoSatisfaccion.obtenerS4p9dadoRespuesta(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getCalificacion()).size());
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
            for (int i = 0; i < RespuestasSeccionCuatro.obtenerRespuestas().size(); i++) {
                pieModel.set(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getValoracion(),
                        ServiciosGradoSatisfaccion.obtenerS4p9dadoRespuesta(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
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
