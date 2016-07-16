/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsn.presentacion.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.DefaultRequestContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartSeries;
import recursos.Util;
import wsn.logica.clases.Nodo1;
import wsn.logica.funciones.FNodo1;

/**
 *
 * @author gcudcop
 */
@ManagedBean
@RequestScoped
public final class ControladorCalendario implements Serializable {

    private static final long serialVersionUID = 6401166601481931346L;
   
    private Nodo1 objNodo1;
    private ArrayList<Nodo1> lstNodo1;
    private ArrayList<Nodo1> lstNodoB;
    private ArrayList<Nodo1> lstNodoUltimo;
    private String comando1;
    private String comando2;
    private String comando5;

    private Nodo1 nodo1Sel;
    private int estadoSel;
    private int estadoSel1;
    private String fecha1;
    
   

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

      /**
     * Creates a new instance of Nodo1Controlador
     */
    public ControladorCalendario() {
       this.reinit();
        

    }
    
    private void reinit(){
       this.nodo1Sel = new Nodo1();
        this.lstNodo1 = new ArrayList<Nodo1>();
        this.calendario();
        this.estadoSel = -1;
        this.estadoSel1 = -1;  
    }

    public Nodo1 getObjNodo1() {
        return objNodo1;
    }

    public String getComando1() {
        return comando1;
    }

    public void setComando1(String comando1) {
        this.comando1 = comando1;
    }

    public void setObjNodo1(Nodo1 objNodo1) {
        this.objNodo1 = objNodo1;
    }

    public ArrayList<Nodo1> getLstNodo1() {
        return lstNodo1;
    }

    public void setLstNodo1(ArrayList<Nodo1> lstNodo1) {
        this.lstNodo1 = lstNodo1;
    }

    public ArrayList<Nodo1> getLstNodoUltimo() {
        return lstNodoUltimo;
    }

    public void setLstNodoUltimo(ArrayList<Nodo1> lstNodoUltimo) {
        this.lstNodoUltimo = lstNodoUltimo;
    }

    public ArrayList<Nodo1> getLstNodoB() {
        return lstNodoB;
    }

    public void setLstNodoB(ArrayList<Nodo1> lstNodoB) {
        this.lstNodoB = lstNodoB;
    }

    public Nodo1 getNodo1Sel() {
        return nodo1Sel;
    }

    public void setNodo1Sel(Nodo1 nodo1Sel) {
        this.nodo1Sel = nodo1Sel;
    }

    public int getEstadoSel() {
        return estadoSel;
    }

    public void setEstadoSel(int estadoSel) {
        this.estadoSel = estadoSel;
    }

    public int getEstadoSel1() {
        return estadoSel1;
    }

    public void setEstadoSel1(int estadoSel1) {
        this.estadoSel1 = estadoSel1;
    }

    public String getComando2() {
        return comando2;
    }

    public void setComando2(String comando2) {
        this.comando2 = comando2;
    }

    public String getComando5() {
        return comando5;
    }

    public void setComando5(String comando5) {
        this.comando5 = comando5;
    }

 public void calendario() {
                
        try {
            lstNodo1.clear();
            lstNodo1 = FNodo1.obtenerNodo1DadoFecha(fecha1);
            
            
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
    }
}
