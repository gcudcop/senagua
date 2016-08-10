/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senagua.presentacion.controladores;

import java.util.ArrayList;
import javax.annotation.PostConstruct;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import senagua.logica.servicios.ServiciosJAguaPotable;
import senagua.logica.clases.JAguaPotable;

/**
 *
 * @author Enrique
 */
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
            lst = ServiciosJAguaPotable.obtenerjunta_agua_potableEstado();
            ChartSeries test = new ChartSeries();
            for (int i = 0; i < lst.size(); i++) {
                test.set(String.valueOf(ServiciosJAguaPotable.obtenerjunta_agua_potableEstado().get(i).getEstado())+" ESTADO",
                       ServiciosJAguaPotable.obtene(ServiciosColegiatura.obtenerColegiaturaTiempoCarrera().get(i).getTiempoCarrera()).size());

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
            lst = ServiciosJAguaPotable.obtenerjunta_agua_potableEstado();
            for (int i = 0; i < lst.size(); i++) {
                pieModel.set(String.valueOf(ServiciosJAguaPotable.obtenerjunta_agua_potableEstado().get(i).getEstado())+" ESTADO",
                        ServiciosJAguaPotable.obtenerjunta_agua_potableEstado(ServiciosJAguaPotable.obtenerjunta_agua_potableEstado().get(i).getEstado()).size());

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

    public ArrayList<Colegiatura> getLst() {
        return lst;
    }

    public void setLst(ArrayList<Colegiatura> lst) {
        this.lst = lst;
    }

}

