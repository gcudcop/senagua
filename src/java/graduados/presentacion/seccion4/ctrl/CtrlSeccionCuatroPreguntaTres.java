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
public class CtrlSeccionCuatroPreguntaTres {

    private CartesianChartModel lineLiteralA;
    private CartesianChartModel lineLiteralB;
    private CartesianChartModel lineLiteralC;
    private CartesianChartModel lineLiteralD;
    private CartesianChartModel lineLiteralE;
    private CartesianChartModel lineLiteralF;
    private CartesianChartModel lineLiteralG;

    public CtrlSeccionCuatroPreguntaTres() {
        this.init();
    }

    private void init() {
        this.graficar();
    }

    @PostConstruct
    public void graficar() {
        lineLiteralA = literalA();
        lineLiteralB = literalB();
        this.lineLiteralC = literalC();
        this.lineLiteralD = literalD();
        this.lineLiteralE = literalE();
        this.lineLiteralF = literalF();
        this.lineLiteralG = literalG();

    }

    private CartesianChartModel literalA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries literalA = new ChartSeries();
            for (int i = 0; i < RespuestasSeccionCuatro.obtenerRespuestas().size(); i++) {
                literalA.set(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getValoracion(),
                        ServiciosGradoSatisfaccion.obtenerS4p3_a(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getCalificacion()).size());
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
            for (int i = 0; i < RespuestasSeccionCuatro.obtenerRespuestas().size(); i++) {
                literalA.set(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getValoracion(),
                        ServiciosGradoSatisfaccion.obtenerS4p3_b(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getCalificacion()).size());
            }

            model.addSeries(literalA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel literalC() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries literalA = new ChartSeries();
            for (int i = 0; i < RespuestasSeccionCuatro.obtenerRespuestas().size(); i++) {
                literalA.set(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getValoracion(),
                        ServiciosGradoSatisfaccion.obtenerS4p3_c(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getCalificacion()).size());
            }

            model.addSeries(literalA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel literalD() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries literalA = new ChartSeries();
            for (int i = 0; i < RespuestasSeccionCuatro.obtenerRespuestas().size(); i++) {
                literalA.set(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getValoracion(),
                        ServiciosGradoSatisfaccion.obtenerS4p3_d(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getCalificacion()).size());
            }

            model.addSeries(literalA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel literalE() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries literalA = new ChartSeries();
            for (int i = 0; i < RespuestasSeccionCuatro.obtenerRespuestas().size(); i++) {
                literalA.set(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getValoracion(),
                        ServiciosGradoSatisfaccion.obtenerS4p3_e(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getCalificacion()).size());
            }

            model.addSeries(literalA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel literalF() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries literalA = new ChartSeries();
            for (int i = 0; i < RespuestasSeccionCuatro.obtenerRespuestas().size(); i++) {
                literalA.set(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getValoracion(),
                        ServiciosGradoSatisfaccion.obtenerS4p3_f(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getCalificacion()).size());
            }

            model.addSeries(literalA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel literalG() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries literalA = new ChartSeries();
            for (int i = 0; i < RespuestasSeccionCuatro.obtenerRespuestas().size(); i++) {
                literalA.set(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getValoracion(),
                        ServiciosGradoSatisfaccion.obtenerS4p3_g(RespuestasSeccionCuatro.obtenerRespuestas().get(i).getCalificacion()).size());
            }

            model.addSeries(literalA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    /*
     ***** getters y setters
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

    public CartesianChartModel getLineLiteralC() {
        return lineLiteralC;
    }

    public void setLineLiteralC(CartesianChartModel lineLiteralC) {
        this.lineLiteralC = lineLiteralC;
    }

    public CartesianChartModel getLineLiteralD() {
        return lineLiteralD;
    }

    public void setLineLiteralD(CartesianChartModel lineLiteralD) {
        this.lineLiteralD = lineLiteralD;
    }

    public CartesianChartModel getLineLiteralE() {
        return lineLiteralE;
    }

    public void setLineLiteralE(CartesianChartModel lineLiteralE) {
        this.lineLiteralE = lineLiteralE;
    }

    public CartesianChartModel getLineLiteralF() {
        return lineLiteralF;
    }

    public void setLineLiteralF(CartesianChartModel lineLiteralF) {
        this.lineLiteralF = lineLiteralF;
    }

    public CartesianChartModel getLineLiteralG() {
        return lineLiteralG;
    }

    public void setLineLiteralG(CartesianChartModel lineLiteralG) {
        this.lineLiteralG = lineLiteralG;
    }

}
