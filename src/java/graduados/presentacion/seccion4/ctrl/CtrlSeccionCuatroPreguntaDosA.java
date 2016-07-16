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
import recursos.RespuestasSeccionCuatro;

/**
 *
 * @author Geovanny
 */
@ManagedBean
@ViewScoped
public class CtrlSeccionCuatroPreguntaDosA {

    private CartesianChartModel lineLiteralA;
    private CartesianChartModel lineLiteralB;

    public CtrlSeccionCuatroPreguntaDosA() {
        this.init();

    }

    private void init() {
        this.graficar();
    }

    @PostConstruct
    public void graficar() {
        lineLiteralA = literalA();
        lineLiteralB = literalB();
    }

    private CartesianChartModel literalA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries literalA = new ChartSeries();
            literalA.setLabel("El avance planificado en lo que respecta a registro y aprobación de sus materias");
            for (int i = 0; i < RespuestasSeccionCuatro.obtenerRespuestas().size(); i++) {
                literalA.set(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getValoracion(),
                        ServiciosGradoSatisfaccion.obtenerS4p2_a(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getCalificacion()).size());
            }

            model.addSeries(literalA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel literalB() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries literalA = new ChartSeries();
            literalA.setLabel("Asesoramiento en cuanto a opciones profesionales futuras");
            for (int i = 0; i < RespuestasSeccionCuatro.obtenerRespuestas().size(); i++) {
                literalA.set(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getValoracion(),
                        ServiciosGradoSatisfaccion.obtenerS4p2_b(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getCalificacion()).size());
            }

            model.addSeries(literalA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    /*
     **** getters y setters
     */
    public CartesianChartModel getLineLiteralA() {
        return lineLiteralA;
    }

    public void setLineLiteralA(CartesianChartModel lineLiteralA) {
        this.lineLiteralA = lineLiteralA;
    }

    public CartesianChartModel getLineLiteralB() {
        return lineLiteralB;
    }

    public void setLineLiteralB(CartesianChartModel lineLiteralB) {
        this.lineLiteralB = lineLiteralB;
    }

}
