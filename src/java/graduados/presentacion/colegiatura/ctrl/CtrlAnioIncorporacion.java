/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.colegiatura.ctrl;

import graduados.logica.servicios.ServiciosColegiatura;
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
public class CtrlAnioIncorporacion {

    private ArrayList<Integer> anios;
    private CartesianChartModel lineModel;
    private PieChartModel pieModel;
    
    @PostConstruct
    public void graficar() {
        lineModel = grafica();
        createPieModel();
    }

    private CartesianChartModel grafica() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            anios = new ArrayList<Integer>();
            anios.add(2010);
            anios.add(2011);
            anios.add(2012);
            anios.add(2013);
            anios.add(2014);
            anios.add(2015);
            anios.add(2016);
            anios.add(2017);
            anios.add(2018);

            ChartSeries test = new ChartSeries();
            for (Integer anio : anios) {
                test.set("Año " + String.valueOf(anio), ServiciosColegiatura.obtenerColegiaturaDadoAnioIncorporacion(anio).size());
            }
            model.addSeries(test);
        } catch (Exception e) {
            System.out.println("private CartesianChartModel grafica() dice: " + e.getMessage());
        }
        return model;
    }
    
    private void createPieModel() {
        pieModel = new PieChartModel();
        try {
            anios = new ArrayList<Integer>();
            anios.add(2010);
            anios.add(2011);
            anios.add(2012);
            anios.add(2013);
            anios.add(2014);
            anios.add(2015);
            anios.add(2016);
            anios.add(2017);
            anios.add(2018);
            
            for (Integer anio : anios) {
                pieModel.set("Año " + String.valueOf(anio), ServiciosColegiatura.obtenerColegiaturaDadoAnioIncorporacion(anio).size());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }

    public ArrayList<Integer> getAnios() {
        return anios;
    }

    public void setAnios(ArrayList<Integer> anios) {
        this.anios = anios;
    }

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
