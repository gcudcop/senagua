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
public class CtrlS3P8LA {

    private CartesianChartModel lineModelLadoA;
    private PieChartModel pieLadoA;
    private CartesianChartModel lineModelLadoB;
    private PieChartModel pieLadoB;

    private CartesianChartModel lineLiteralBLadoA;
    private CartesianChartModel lineLiteralBLadoB;
    private PieChartModel pieLiteralBLadoA;
    private PieChartModel pieLiteralBLadoB;

    private CartesianChartModel lineLiteralCLadoA;
    private CartesianChartModel lineLiteralCLadoB;
    private PieChartModel pieLiteralCLadoA;
    private PieChartModel pieLiteralCLadoB;

    private CartesianChartModel lineLiteralDLadoA;
    private CartesianChartModel lineLiteralDLadoB;
    private PieChartModel pieLiteralDLadoA;
    private PieChartModel pieLiteralDLadoB;

    private CartesianChartModel lineLiteralELadoA;
    private CartesianChartModel lineLiteralELadoB;
    private PieChartModel pieLiteralELadoA;
    private PieChartModel pieLiteralELadoB;

    public CtrlS3P8LA() {
        this.graficar();

    }

    @PostConstruct
    private void graficar() {
        this.lineModelLadoA = graficaA();
        this.lineModelLadoB = graficaB();
        this.lineLiteralBLadoA = graficaLiteralBLadoA();
        this.lineLiteralBLadoB = graficaLiteralBLadoB();
        this.lineLiteralCLadoA = graficaLiteralCLadoA();
        this.lineLiteralCLadoB = graficaLiteralCLadoB();
        this.lineLiteralDLadoA = graficaLiteralDLadoA();
        this.lineLiteralDLadoB = graficaLiteralDLadoB();
        this.lineLiteralELadoA = graficaLiteralELadoA();
        this.lineLiteralELadoB = graficaLiteralELadoB();
        createPieModelLaboB();
        createPieModelLadoA();
        createPieLiteralBLadoA();
        createPieLiteralBLaboB();
        createPieLiteralCLadoA();
        createPieLiteralCLaboB();
        createPieLiteralDLadoA();
        createPieLiteralDLaboB();
        createPieLiteralELadoA();
        createPieLiteralELaboB();

    }

    /*
     ¨**** LITERAL A
     */
    private CartesianChartModel graficaA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoA = new ChartSeries();
            ladoA.setLabel("Lado A:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                ladoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8ALadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
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
                        SrvcCumplimientoPerfil.obtenerS3P8ALadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
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
                        SrvcCumplimientoPerfil.obtenerS3P8ALadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    private void createPieModelLaboB() {
        pieLadoB = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                pieLadoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8ALadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
            System.out.println("graficar dice: " + e.getMessage());
        }

    }
    /*
     *** LITERAL B
     */

    private CartesianChartModel graficaLiteralBLadoA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoA = new ChartSeries();
            ladoA.setLabel("Lado A:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                ladoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8BLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficaLiteralBLadoB() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoB = new ChartSeries();
            ladoB.setLabel("Lado B:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                ladoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8BLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoB);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieLiteralBLadoA() {
        pieLiteralBLadoA = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                pieLiteralBLadoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8BLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    private void createPieLiteralBLaboB() {
        pieLiteralBLadoB = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                pieLiteralBLadoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8BLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
            System.out.println("graficar dice: " + e.getMessage());
        }

    }

    /*
     * 
     * Literal C 
     */
    private CartesianChartModel graficaLiteralCLadoA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoA = new ChartSeries();
            ladoA.setLabel("Lado A:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                ladoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8CLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficaLiteralCLadoB() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoB = new ChartSeries();
            ladoB.setLabel("Lado B:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                ladoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8CLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoB);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieLiteralCLadoA() {
        pieLiteralCLadoA= new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                pieLiteralCLadoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8CLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    private void createPieLiteralCLaboB() {
        pieLiteralCLadoB = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                pieLiteralCLadoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8CLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
            System.out.println("graficar dice: " + e.getMessage());
        }

    }
    /*
     * 
     *LITERAL D
     */

    private CartesianChartModel graficaLiteralDLadoA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoA = new ChartSeries();
            ladoA.setLabel("Lado A:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                ladoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8DLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficaLiteralDLadoB() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoB = new ChartSeries();
            ladoB.setLabel("Lado B:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                ladoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8DLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoB);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieLiteralDLadoA() {
        pieLiteralDLadoA = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                pieLiteralDLadoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8DLadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    private void createPieLiteralDLaboB() {
        pieLiteralDLadoB = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                pieLiteralDLadoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8DLadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
            System.out.println("graficar dice: " + e.getMessage());
        }

    }
    /*
     **** LITERAL E
     */

    private CartesianChartModel graficaLiteralELadoA() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoA = new ChartSeries();
            ladoA.setLabel("Lado A:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                ladoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8ELadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficaLiteralELadoB() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries ladoB = new ChartSeries();
            ladoB.setLabel("Lado B:");
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                ladoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8ELadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }

            model.addSeries(ladoB);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieLiteralELadoA() {
        pieLiteralELadoA = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoA().size(); i++) {
                pieLiteralELadoA.set(RespuestasSeccionTres.obtenerLadoA().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8ELadoA(RespuestasSeccionTres.obtenerLadoA().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
        }

    }

    private void createPieLiteralELaboB() {
        pieLiteralELadoB = new PieChartModel();
        try {
            for (int i = 0; i < RespuestasSeccionTres.obtenerLadoB().size(); i++) {
                pieLiteralELadoB.set(RespuestasSeccionTres.obtenerLadoB().get(i).getValoracion(),
                        SrvcCumplimientoPerfil.obtenerS3P8ELadoB(RespuestasSeccionTres.obtenerLadoB().get(i).getCalificacion()).size());
            }
        } catch (Exception e) {
            System.out.println("graficar dice: " + e.getMessage());
        }

    }

    /*
     GETTERS Y SETTERS
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

    public CartesianChartModel getLineLiteralBLadoA() {
        return lineLiteralBLadoA;
    }

    public void setLineLiteralBLadoA(CartesianChartModel lineLiteralBLadoA) {
        this.lineLiteralBLadoA = lineLiteralBLadoA;
    }

    public CartesianChartModel getLineLiteralBLadoB() {
        return lineLiteralBLadoB;
    }

    public void setLineLiteralBLadoB(CartesianChartModel lineLiteralBLadoB) {
        this.lineLiteralBLadoB = lineLiteralBLadoB;
    }

    public PieChartModel getPieLiteralBLadoA() {
        return pieLiteralBLadoA;
    }

    public void setPieLiteralBLadoA(PieChartModel pieLiteralBLadoA) {
        this.pieLiteralBLadoA = pieLiteralBLadoA;
    }

    public PieChartModel getPieLiteralBLadoB() {
        return pieLiteralBLadoB;
    }

    public void setPieLiteralBLadoB(PieChartModel pieLiteralBLadoB) {
        this.pieLiteralBLadoB = pieLiteralBLadoB;
    }

    public CartesianChartModel getLineLiteralCLadoA() {
        return lineLiteralCLadoA;
    }

    public void setLineLiteralCLadoA(CartesianChartModel lineLiteralCLadoA) {
        this.lineLiteralCLadoA = lineLiteralCLadoA;
    }

    public CartesianChartModel getLineLiteralCLadoB() {
        return lineLiteralCLadoB;
    }

    public void setLineLiteralCLadoB(CartesianChartModel lineLiteralCLadoB) {
        this.lineLiteralCLadoB = lineLiteralCLadoB;
    }

    public PieChartModel getPieLiteralCLadoA() {
        return pieLiteralCLadoA;
    }

    public void setPieLiteralCLadoA(PieChartModel pieLiteralCLadoA) {
        this.pieLiteralCLadoA = pieLiteralCLadoA;
    }

    public PieChartModel getPieLiteralCLadoB() {
        return pieLiteralCLadoB;
    }

    public void setPieLiteralCLadoB(PieChartModel pieLiteralCLadoB) {
        this.pieLiteralCLadoB = pieLiteralCLadoB;
    }

    public CartesianChartModel getLineLiteralDLadoA() {
        return lineLiteralDLadoA;
    }

    public void setLineLiteralDLadoA(CartesianChartModel lineLiteralDLadoA) {
        this.lineLiteralDLadoA = lineLiteralDLadoA;
    }

    public CartesianChartModel getLineLiteralDLadoB() {
        return lineLiteralDLadoB;
    }

    public void setLineLiteralDLadoB(CartesianChartModel lineLiteralDLadoB) {
        this.lineLiteralDLadoB = lineLiteralDLadoB;
    }

    public PieChartModel getPieLiteralDLadoA() {
        return pieLiteralDLadoA;
    }

    public void setPieLiteralDLadoA(PieChartModel pieLiteralDLadoA) {
        this.pieLiteralDLadoA = pieLiteralDLadoA;
    }

    public PieChartModel getPieLiteralDLadoB() {
        return pieLiteralDLadoB;
    }

    public void setPieLiteralDLadoB(PieChartModel pieLiteralDLadoB) {
        this.pieLiteralDLadoB = pieLiteralDLadoB;
    }

    public CartesianChartModel getLineLiteralELadoA() {
        return lineLiteralELadoA;
    }

    public void setLineLiteralELadoA(CartesianChartModel lineLiteralELadoA) {
        this.lineLiteralELadoA = lineLiteralELadoA;
    }

    public CartesianChartModel getLineLiteralELadoB() {
        return lineLiteralELadoB;
    }

    public void setLineLiteralELadoB(CartesianChartModel lineLiteralELadoB) {
        this.lineLiteralELadoB = lineLiteralELadoB;
    }

    public PieChartModel getPieLiteralELadoA() {
        return pieLiteralELadoA;
    }

    public void setPieLiteralELadoA(PieChartModel pieLiteralELadoA) {
        this.pieLiteralELadoA = pieLiteralELadoA;
    }

    public PieChartModel getPieLiteralELadoB() {
        return pieLiteralELadoB;
    }

    public void setPieLiteralELadoB(PieChartModel pieLiteralELadoB) {
        this.pieLiteralELadoB = pieLiteralELadoB;
    }

}
