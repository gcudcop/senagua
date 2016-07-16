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
public class CtrlSeccionTresPreguntaUno {

    private CartesianChartModel pregunta;
    private PieChartModel pieModel;
    private CartesianChartModel preguntaB;
    private PieChartModel pieModelB;
    private CartesianChartModel lineModel1bLadoA;
    private CartesianChartModel lineModel1bLadoB;
    private CartesianChartModel lineModelcLadoA;
    private CartesianChartModel lineModel1cLadoB;
    private CartesianChartModel lineModel1dLadoA;
    private CartesianChartModel lineModel1dLadoB;
    private CartesianChartModel lineModel1eLadoA;
    private CartesianChartModel lineModel1eLadoB;
    private PieChartModel pieModel1bLadoA;
    private PieChartModel pieModel1bLadoB;
    private PieChartModel pieModel1cLadoA;
    private PieChartModel pieModel1cLadoB;
    private PieChartModel pieModel1dLadoA;
    private PieChartModel pieModel1dLadoB;
    private PieChartModel pieModel1eLadoA;
    private PieChartModel pieModel1eLadoB;

    public CtrlSeccionTresPreguntaUno() {
        this.init();
    }

    private void init() {
        this.graficar();
    }

    @PostConstruct
    public void graficar() {
        pregunta = grafica();
        preguntaB = graficaB();
        lineModel1bLadoA = literal1bLadoA();
        lineModel1bLadoB = literal1bLadoB();
        lineModelcLadoA = literal1cLadoB();
        lineModel1cLadoB = literal1cLadoB();
        lineModel1dLadoA = literal1dLadoA();
        lineModel1dLadoB = literal1dLadoB();
        lineModel1eLadoA = literal1eLadoA();
        lineModel1eLadoB = literal1eLadoB();
        createPieModel2();
        createPieModelLaboB();
        createPieModel1bLadoA();
        createPieModel1bLadoB();
        createPieModel1cLadoA();
        createPieModel1cLadoB();
        createPieModel1dLadoA();
        createPieModel1dLadoB();
        createPieModel1eLadoA();
        createPieModel1eLadoB();
    }

    /*
     **** Literal A
     */
    private CartesianChartModel grafica() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoA = new ChartSeries();
            ladoA.setLabel("Lado A:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                ladoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1LadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
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
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1LadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoB);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieModel2() {
        pieModel = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                pieModel.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1LadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    private void createPieModelLaboB() {
        pieModelB = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                pieModelB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1LadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    /*
     **** Literal B
     */
    private CartesianChartModel literal1bLadoA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoA = new ChartSeries();
            ladoA.setLabel("Lado A:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                ladoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1bLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel literal1bLadoB() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoB = new ChartSeries();
            ladoB.setLabel("Lado B:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                ladoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1bLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoB);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieModel1bLadoA() {
        pieModel = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                pieModel1bLadoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1bLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    private void createPieModel1bLadoB() {
        pieModelB = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                pieModel1bLadoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1bLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    /*
     **** Literal C    
     */
    private CartesianChartModel literal1cLadoA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoA = new ChartSeries();
            ladoA.setLabel("Lado A:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                ladoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1cLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel literal1cLadoB() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoB = new ChartSeries();
            ladoB.setLabel("Lado B:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                ladoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1cLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoB);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieModel1cLadoA() {
        pieModel = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                pieModel1cLadoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1cLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    private void createPieModel1cLadoB() {
        pieModelB = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                pieModel1cLadoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1cLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    /*
     **** Literal D
     */
    private CartesianChartModel literal1dLadoA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoA = new ChartSeries();
            ladoA.setLabel("Lado A:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                ladoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1dLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel literal1dLadoB() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoB = new ChartSeries();
            ladoB.setLabel("Lado B:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                ladoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1dLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoB);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieModel1dLadoA() {
        pieModel = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                pieModel1dLadoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1dLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    private void createPieModel1dLadoB() {
        pieModelB = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                pieModel1dLadoA.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1dLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    /*
     ****** LITERAL E
     */
    private CartesianChartModel literal1eLadoA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoA = new ChartSeries();
            ladoA.setLabel("Lado A:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                ladoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1eLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel literal1eLadoB() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoB = new ChartSeries();
            ladoB.setLabel("Lado B:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                ladoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1eLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoB);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieModel1eLadoA() {
        pieModel = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                pieModel1eLadoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1eLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    private void createPieModel1eLadoB() {
        pieModelB = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                pieModel1eLadoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerSeccionTresDadoPreg1eLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    /*
     **** getters y setters
     */
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

    public CartesianChartModel getPreguntaB() {
        return preguntaB;
    }

    public void setPreguntaB(CartesianChartModel preguntaB) {
        this.preguntaB = preguntaB;
    }

    public PieChartModel getPieModelB() {
        return pieModelB;
    }

    public void setPieModelB(PieChartModel pieModelB) {
        this.pieModelB = pieModelB;
    }

    public CartesianChartModel getLineModel1bLadoA() {
        return lineModel1bLadoA;
    }

    public void setLineModel1bLadoA(CartesianChartModel lineModel1bLadoA) {
        this.lineModel1bLadoA = lineModel1bLadoA;
    }

    public CartesianChartModel getLineModel1bLadoB() {
        return lineModel1bLadoB;
    }

    public void setLineModel1bLadoB(CartesianChartModel lineModel1bLadoB) {
        this.lineModel1bLadoB = lineModel1bLadoB;
    }

    public CartesianChartModel getLineModelcLadoA() {
        return lineModelcLadoA;
    }

    public void setLineModelcLadoA(CartesianChartModel lineModelcLadoA) {
        this.lineModelcLadoA = lineModelcLadoA;
    }

    public CartesianChartModel getLineModel1cLadoB() {
        return lineModel1cLadoB;
    }

    public void setLineModel1cLadoB(CartesianChartModel lineModel1cLadoB) {
        this.lineModel1cLadoB = lineModel1cLadoB;
    }

    public CartesianChartModel getLineModel1dLadoA() {
        return lineModel1dLadoA;
    }

    public void setLineModel1dLadoA(CartesianChartModel lineModel1dLadoA) {
        this.lineModel1dLadoA = lineModel1dLadoA;
    }

    public CartesianChartModel getLineModel1dLadoB() {
        return lineModel1dLadoB;
    }

    public void setLineModel1dLadoB(CartesianChartModel lineModel1dLadoB) {
        this.lineModel1dLadoB = lineModel1dLadoB;
    }

    public CartesianChartModel getLineModel1eLadoA() {
        return lineModel1eLadoA;
    }

    public void setLineModel1eLadoA(CartesianChartModel lineModel1eLadoA) {
        this.lineModel1eLadoA = lineModel1eLadoA;
    }

    public CartesianChartModel getLineModel1eLadoB() {
        return lineModel1eLadoB;
    }

    public void setLineModel1eLadoB(CartesianChartModel lineModel1eLadoB) {
        this.lineModel1eLadoB = lineModel1eLadoB;
    }

    public PieChartModel getPieModel1bLadoA() {
        return pieModel1bLadoA;
    }

    public void setPieModel1bLadoA(PieChartModel pieModel1bLadoA) {
        this.pieModel1bLadoA = pieModel1bLadoA;
    }

    public PieChartModel getPieModel1bLadoB() {
        return pieModel1bLadoB;
    }

    public void setPieModel1bLadoB(PieChartModel pieModel1bLadoB) {
        this.pieModel1bLadoB = pieModel1bLadoB;
    }

    public PieChartModel getPieModel1cLadoA() {
        return pieModel1cLadoA;
    }

    public void setPieModel1cLadoA(PieChartModel pieModel1cLadoA) {
        this.pieModel1cLadoA = pieModel1cLadoA;
    }

    public PieChartModel getPieModel1cLadoB() {
        return pieModel1cLadoB;
    }

    public void setPieModel1cLadoB(PieChartModel pieModel1cLadoB) {
        this.pieModel1cLadoB = pieModel1cLadoB;
    }

    public PieChartModel getPieModel1dLadoA() {
        return pieModel1dLadoA;
    }

    public void setPieModel1dLadoA(PieChartModel pieModel1dLadoA) {
        this.pieModel1dLadoA = pieModel1dLadoA;
    }

    public PieChartModel getPieModel1dLadoB() {
        return pieModel1dLadoB;
    }

    public void setPieModel1dLadoB(PieChartModel pieModel1dLadoB) {
        this.pieModel1dLadoB = pieModel1dLadoB;
    }

    public PieChartModel getPieModel1eLadoA() {
        return pieModel1eLadoA;
    }

    public void setPieModel1eLadoA(PieChartModel pieModel1eLadoA) {
        this.pieModel1eLadoA = pieModel1eLadoA;
    }

    public PieChartModel getPieModel1eLadoB() {
        return pieModel1eLadoB;
    }

    public void setPieModel1eLadoB(PieChartModel pieModel1eLadoB) {
        this.pieModel1eLadoB = pieModel1eLadoB;
    }

}
