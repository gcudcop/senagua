/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.colegiatura.ctrl;

import graduados.logica.entidades.Colegiatura;
import graduados.logica.servicios.ServiciosColegiatura;
import java.io.Serializable;
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
public class CtrlTiempoCarrera implements Serializable {

    private CartesianChartModel lineModel;
    private PieChartModel pieModel;
    private ArrayList<Colegiatura> lst;

    public CtrlTiempoCarrera() {
        this.init();
    }

    private void init() {
        this.lst = new ArrayList<Colegiatura>();
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
            lst = ServiciosColegiatura.obtenerColegiaturaTiempoCarrera();
            ChartSeries test = new ChartSeries();
            for (int i = 0; i < lst.size(); i++) {
                test.set(String.valueOf(ServiciosColegiatura.obtenerColegiaturaTiempoCarrera().get(i).getTiempoCarrera())+" Años",
                        ServiciosColegiatura.obtenerColegiaturaDadoTiempoCarrera(ServiciosColegiatura.obtenerColegiaturaTiempoCarrera().get(i).getTiempoCarrera()).size());

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
            lst = ServiciosColegiatura.obtenerColegiaturaTiempoCarrera();
            for (int i = 0; i < lst.size(); i++) {
                pieModel.set(String.valueOf(ServiciosColegiatura.obtenerColegiaturaTiempoCarrera().get(i).getTiempoCarrera())+" Años",
                        ServiciosColegiatura.obtenerColegiaturaDadoTiempoCarrera(ServiciosColegiatura.obtenerColegiaturaTiempoCarrera().get(i).getTiempoCarrera()).size());

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
