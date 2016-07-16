/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsn.presentacion.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;
import wsn.logica.clases.Nodo2;
import wsn.logica.clases.Nodo3;
import wsn.logica.funciones.FNodo2;
import wsn.logica.funciones.FNodo3;

/**
 *
 * @author gcudcop
 */
@ManagedBean
@RequestScoped
public class Nodo3Controlador implements Serializable {

    private static final long serialVersionUID = 6401166601481931346L;
    private CartesianChartModel lineModel1;
    Date date1 = new java.util.Date();
    private Nodo3 objNodo3;
    private ArrayList<Nodo3> lstNodo3;
    private Nodo3 nodo3Sel;
    private int estadoSel;
    private ArrayList<Nodo3> lstNodoBuscar;
    private ArrayList<Nodo3> lstNodoB;
    private String fecha1;

    /**
     * Creates a new instance of Nodo2Controlador
     */
    public Nodo3Controlador() {
        this.reinit();
    }

    public void reinit() {
        this.nodo3Sel = new Nodo3();
        this.objNodo3 = new Nodo3();
        this.cargarNodo3();
        this.estadoSel = -1;
        this.lstNodoB = new ArrayList<Nodo3>();
        this.lstNodoBuscar=new ArrayList<Nodo3>();
        this.lstNodo3 = new ArrayList<Nodo3>();
        this.obtenerNodo3DadoFecha();
    }

    public void cargarNodo3() {
        try {
            lstNodo3 = FNodo3.obtenerTodos();
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
    }

    public ArrayList<Nodo3> getLstNodoBuscar() {
        return lstNodoBuscar;
    }

    public void setLstNodoBuscar(ArrayList<Nodo3> lstNodoBuscar) {
        this.lstNodoBuscar = lstNodoBuscar;
    }

    public ArrayList<Nodo3> getLstNodoB() {
        return lstNodoB;
    }

    public void setLstNodoB(ArrayList<Nodo3> lstNodoB) {
        this.lstNodoB = lstNodoB;
    }

    public Nodo3 getObjNodo3() {
        return objNodo3;
    }

    public void setObjNodo3(Nodo3 objNodo3) {
        this.objNodo3 = objNodo3;
    }

    public ArrayList<Nodo3> getLstNodo3() {
        return lstNodo3;
    }

    public void setLstNodo3(ArrayList<Nodo3> lstNodo3) {
        this.lstNodo3 = lstNodo3;
    }

    public Nodo3 getNodo3Sel() {
        return nodo3Sel;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public void setNodo3Sel(Nodo3 nodo3Sel) {
        this.nodo3Sel = nodo3Sel;
    }

    public int getEstadoSel() {
        return estadoSel;
    }

    public void setEstadoSel(int estadoSel) {
        this.estadoSel = estadoSel;
    }

    @PostConstruct
    public void graficar() {
        lineModel1 = new CartesianChartModel();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        fecha1 = sdf.format(date1);
        try {
            lstNodoBuscar = FNodo3.obtenerNodo3DadoFecha(fecha1);
            final ChartSeries temperatura = new ChartSeries("Temperatura");
            for (Nodo3 pr : lstNodoBuscar) {
                temperatura.set(pr.getFecha(), Double.parseDouble(pr.getTemperatura()));
            }
            final ChartSeries h_ambiente = new ChartSeries("H_ambiente");
            for (Nodo3 pr : lstNodoBuscar) {
                h_ambiente.set(pr.getFecha(), Double.parseDouble(pr.getH_ambiente()));
            }
            lineModel1.addSeries(temperatura);
            lineModel1.addSeries(h_ambiente);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
    }

    public CartesianChartModel getGrficar() {
        return lineModel1;
    }

    public void obtenerNodo3DadoFecha() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        fecha1 = sdf.format(date1);

        try {

            //lstNodoB.clear();
            lstNodoB = FNodo3.obtenerNodo3DadoFecha(fecha1);

        } catch (Exception e) {
            Util.addErrorMessage("private void obtenerNodo2DadoFecha: " + e.getMessage());
            System.out.println("private void obtenerNodo2DadoFecha: " + e.getMessage());
        }

    }
}
