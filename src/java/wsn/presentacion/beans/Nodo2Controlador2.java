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
import wsn.logica.clases.Nodo2;
import wsn.logica.funciones.FNodo2;
/**
 *
 * @author Usuario
 */
  @ManagedBean
@RequestScoped
public class Nodo2Controlador2 implements Serializable{
  
      private static final long serialVersionUID = 6401166601481931346L;
    
    private Nodo2 objNodo2;
    private ArrayList<Nodo2> lstNodo2;
    private ArrayList<Nodo2> lstNodoC;
    private Nodo2 nodo2Sel;
    private int estadoSel;
    
     

    public Timestamp getFecha1() {
        return fecha1;
    }

    public void setFecha1(Timestamp fecha1) {
        this.fecha1 = fecha1;
    }

    public Timestamp getFecha2() {
        return fecha2;
    }

    public void setFecha2(Timestamp fecha2) {
        this.fecha2 = fecha2;
    }
    private Timestamp fecha1;
    private Timestamp fecha2;

    /**
     * Creates a new instance of Nodo2Controlador2
     */
    public Nodo2Controlador2() {
        this.nodo2Sel = new Nodo2();
        this.objNodo2 = new Nodo2();
        this.cargarNodo2();
        this.estadoSel = -1;
    }

    public void cargarNodo2() {
        try {
            lstNodo2 = FNodo2.obtenerNodo2Ultimo();
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
    }

   /* public void cargarNodo2DadoFecha() {
        try {
            lstNodoC = FNodo2.obtenerNodo2DadoFecha(this.fecha1);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
    }*/

    public Nodo2 getObjNodo2() {
        return objNodo2;
    }

    public void setObjNodo2(Nodo2 objNodo2) {
        this.objNodo2 = objNodo2;
    }

    public ArrayList<Nodo2> getLstNodo2() {
        return lstNodo2;
    }

    public void setLstNodo2(ArrayList<Nodo2> lstNodo2) {
        this.lstNodo2 = lstNodo2;
    }
    
    public ArrayList<Nodo2> getLstNodoC() {
        return lstNodoC;
    }

    public void setLstNodoC(ArrayList<Nodo2> lstNodoC) {
        this.lstNodoC = lstNodoC;
    }

    public Nodo2 getNodo2Sel() {
        return nodo2Sel;
    }

    public void setNodo2Sel(Nodo2 nodo2Sel) {
        this.nodo2Sel = nodo2Sel;
    }

    public int getEstadoSel() {
        return estadoSel;
    }

    public void setEstadoSel(int estadoSel) {
        this.estadoSel = estadoSel;
    }

   
}

