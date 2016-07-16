/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.seccion3.ctrl;

import graduados.logica.servicios.SrvcCumplimientoPerfil;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import recursos.RespuestasSeccionTres;

/**
 *
 * @author Geovanny
 */
@ManagedBean
@ViewScoped
public class CtrlS3P7LB {
    private CartesianChartModel lineModelLadoA;
    private PieChartModel pieLadoA;
    private CartesianChartModel lineModelLadoB;
    private PieChartModel pieLadoB;

    public CtrlS3P7LB() {
        this.graficar();

    }

    @PostConstruct
    private void graficar() {
        this.lineModelLadoA = graficaA();
        this.lineModelLadoB = graficaB();
        createPieModelLaboB();
        createPieModelLadoA();

    }

    private CartesianChartModel graficaA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoA = new ChartSeries();
            ladoA.setLabel("Lado A:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                ladoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P7BLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficaB() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoB = new ChartSeries();
            ladoB.setLabel("Lado B:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                ladoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P7BLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoB);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieModelLadoA() {
        pieLadoA = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                pieLadoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P7BLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    private void createPieModelLaboB() {
        pieLadoB = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                pieLadoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P7BLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
            System.out.println("graficar dice: " + e.getMessage());
        }

    }


    /*
     **** getters y setters
     */
    public CartesianChartModel getLineModelLadoA() {
        return lineModelLadoA;
    }

    public void setLineModelLadoA(CartesianChartModel lineModelLadoA) {
        this.lineModelLadoA = lineModelLadoA;
    }

    public PieChartModel getPieLadoA() {
        return pieLadoA;
    }

    public void setPieLadoA(PieChartModel pieLadoA) {
        this.pieLadoA = pieLadoA;
    }

    public CartesianChartModel getLineModelLadoB() {
        return lineModelLadoB;
    }

    public void setLineModelLadoB(CartesianChartModel lineModelLadoB) {
        this.lineModelLadoB = lineModelLadoB;
    }

    public PieChartModel getPieLadoB() {
        return pieLadoB;
    }

    public void setPieLadoB(PieChartModel pieLadoB) {
        this.pieLadoB = pieLadoB;
    }
}
