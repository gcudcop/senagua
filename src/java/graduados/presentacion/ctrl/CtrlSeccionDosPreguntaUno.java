/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.ctrl;

import graduados.logica.entidades.PerspectivaLaboral;
import graduados.logica.servicios.SrvcPerspectivaLaboral;
import java.util.ArrayList;
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
public class CtrlSeccionDosPreguntaUno {

    private CartesianChartModel pregunta;
    private ArrayList<PerspectivaLaboral> lstRespuestas;
    private PieChartModel pieModel;

    public CtrlSeccionDosPreguntaUno() {
        this.reinit();
    }

    private void reinit() {
        this.graficar();
    }

    @PostConstruct
    public void graficar() {
        pregunta = grafica();
        createPieModel2();
    }

    private CartesianChartModel grafica() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries test = new ChartSeries();
            test.setLabel("SI");
            test.set("SI", SrvcPerspectivaLaboral.obtenerPreguntaUno("SI").size());

            ChartSeries no = new ChartSeries();
            no.setLabel("NO");
            no.set("NO", SrvcPerspectivaLaboral.obtenerPreguntaUno("NO").size());

            model.addSeries(test);
            model.addSeries(no);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieModel2() {
        pieModel = new PieChartModel();

        try {
            pieModel.set("SI", SrvcPerspectivaLaboral.obtenerPreguntaUno("SI").size());
            pieModel.set("NO", SrvcPerspectivaLaboral.obtenerPreguntaUno("NO").size());
        } catch (Exception e) {
        }

    }

    public CartesianChartModel getPregunta() {
        return pregunta;
    }

    public void setPregunta(CartesianChartModel pregunta) {
        this.pregunta = pregunta;
    }

    public ArrayList<PerspectivaLaboral> getLstRespuestas() {
        return lstRespuestas;
    }

    public void setLstRespuestas(ArrayList<PerspectivaLaboral> lstRespuestas) {
        this.lstRespuestas = lstRespuestas;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }
    
    

}
