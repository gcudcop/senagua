/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senagua.presentacion.controladores;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import senagua.logica.servicios.ServiciosJAguaPotable;
import senagua.logica.clases.JAguaPotable;

@ManagedBean
@ViewScoped
public class ControladorJAguaPotableEstado {

    private CartesianChartModel lineModel;
    private PieChartModel pieModel;
    private ArrayList<JAguaPotable> lst;

    public ControladorJAguaPotableEstado() {
        this.init();
    }

    private void init() {
        this.lst = new ArrayList<JAguaPotable>();
        this.graficar();
    }

    @PostConstruct
    public void graficar() {
        lineModel = grafica();     
        createPieModel();
    }

    private CartesianChartModel grafica() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lst = ServiciosJAguaPotable.obtenerEstadosJuntas();
            ChartSeries test = new ChartSeries();
            for (int i = 0; i < lst.size(); i++) {
               test.set(lst.get(i).getEstado(), ServiciosJAguaPotable.obtenerJuntasDadoEstado(lst.get(i).getEstado()).size());

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
            lst = ServiciosJAguaPotable.obtenerEstadosJuntas();
            for (int i = 0; i < lst.size(); i++) {
                pieModel.set(lst.get(i).getEstado(), ServiciosJAguaPotable.obtenerJuntasDadoEstado(lst.get(i).getEstado()).size());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

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
