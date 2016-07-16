/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.colegiatura.ctrl;

import graduados.logica.entidades.Colegiatura;
import graduados.logica.servicios.ServiciosColegiatura;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.BarChartSeries;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author Geovanny
 */
@ManagedBean
@ViewScoped
public class CtrlTiempoTesis {

    private CartesianChartModel lineModel;
    private PieChartModel pieModel;
    private ArrayList<Colegiatura> lst;
    private CartesianChartModel lineVinculoTesis;
    private CartesianChartModel lineAuspicioTesis;
    private PieChartModel pieVinculoTesis;
    private PieChartModel pieAuspicioTesis;

    public CtrlTiempoTesis() {
        this.init();
    }

    private void init() {
        this.lst = new ArrayList<Colegiatura>();
        this.graficar();
    }

    @PostConstruct
    public void graficar() {
        lineModel = grafica();
        lineAuspicioTesis = graficaAuspicioTesis();
        lineVinculoTesis = graficaVinculoTesis();
        createPieModel();
        crearPieAuspicioTesis();
        crearPieVinculoTesis();
    }

    private CartesianChartModel grafica() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lst = ServiciosColegiatura.obtenerColegiaturaTiempoTesis();
            ChartSeries test = new ChartSeries();
            for (int i = 0; i < lst.size(); i++) {
                test.set(String.valueOf(ServiciosColegiatura.obtenerColegiaturaTiempoTesis().get(i).getTiempoTesis()) + " Meses",
                        ServiciosColegiatura.obtenerColegiaturaDadoTiempoTesis(ServiciosColegiatura.obtenerColegiaturaTiempoTesis().get(i).getTiempoTesis()).size());

            }
            model.addSeries(test);
        } catch (Exception e) {
            System.out.println("private CartesianChartModel grafica() dice: " + e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficaVinculoTesis() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries line = new ChartSeries();
            for (int i = 0; i < ServiciosColegiatura.obtenerColegiaturaVinculoTesis().size(); i++) {
                line.set(ServiciosColegiatura.obtenerColegiaturaVinculoTesis().get(i).getVinculoTesis(),
                        ServiciosColegiatura.obtenerColegiaturaDadoVinculoTesis(ServiciosColegiatura.obtenerColegiaturaVinculoTesis().get(i).getVinculoTesis()).size());
            }
            model.addSeries(line);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private CartesianChartModel graficaAuspicioTesis() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            ChartSeries serie = new ChartSeries();
            for (int i = 0; i < ServiciosColegiatura.obtenerColegiaturaAuspicioTesis().size(); i++) {
                serie.set(ServiciosColegiatura.obtenerColegiaturaAuspicioTesis().get(i).getAuspicioTesis(),
                        ServiciosColegiatura.obtenerColegiaturaDadoAuspicioTesis(ServiciosColegiatura.obtenerColegiaturaAuspicioTesis().get(i).getAuspicioTesis()).size());
            }
            model.addSeries(serie);
        } catch (Exception e) {
        }
        return model;
    }

    private void createPieModel() {
        pieModel = new PieChartModel();
        try {
            lst = ServiciosColegiatura.obtenerColegiaturaTiempoTesis();
            for (int i = 0; i < lst.size(); i++) {
                pieModel.set(String.valueOf(ServiciosColegiatura.obtenerColegiaturaTiempoTesis().get(i).getTiempoTesis()) + " Meses",
                        ServiciosColegiatura.obtenerColegiaturaDadoTiempoTesis(ServiciosColegiatura.obtenerColegiaturaTiempoTesis().get(i).getTiempoTesis()).size());

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }

    private void crearPieVinculoTesis() {
        pieVinculoTesis = new PieChartModel();
        try {
            for (int i = 0; i < ServiciosColegiatura.obtenerColegiaturaVinculoTesis().size(); i++) {
                pieVinculoTesis.set(ServiciosColegiatura.obtenerColegiaturaVinculoTesis().get(i).getVinculoTesis(),
                        ServiciosColegiatura.obtenerColegiaturaDadoVinculoTesis(ServiciosColegiatura.obtenerColegiaturaVinculoTesis().get(i).getVinculoTesis()).size());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void crearPieAuspicioTesis() {
        pieAuspicioTesis = new PieChartModel();
        try {
            for (int i = 0; i < ServiciosColegiatura.obtenerColegiaturaAuspicioTesis().size(); i++) {
                pieAuspicioTesis.set(ServiciosColegiatura.obtenerColegiaturaAuspicioTesis().get(i).getAuspicioTesis(),
                        ServiciosColegiatura.obtenerColegiaturaDadoAuspicioTesis(ServiciosColegiatura.obtenerColegiaturaAuspicioTesis().get(i).getAuspicioTesis()).size());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
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

    public CartesianChartModel getLineVinculoTesis() {
        return lineVinculoTesis;
    }

    public void setLineVinculoTesis(CartesianChartModel lineVinculoTesis) {
        this.lineVinculoTesis = lineVinculoTesis;
    }

    public CartesianChartModel getLineAuspicioTesis() {
        return lineAuspicioTesis;
    }

    public void setLineAuspicioTesis(CartesianChartModel lineAuspicioTesis) {
        this.lineAuspicioTesis = lineAuspicioTesis;
    }

    public PieChartModel getPieVinculoTesis() {
        return pieVinculoTesis;
    }

    public void setPieVinculoTesis(PieChartModel pieVinculoTesis) {
        this.pieVinculoTesis = pieVinculoTesis;
    }

    public PieChartModel getPieAuspicioTesis() {
        return pieAuspicioTesis;
    }

    public void setPieAuspicioTesis(PieChartModel pieAuspicioTesis) {
        this.pieAuspicioTesis = pieAuspicioTesis;
    }

}
