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
 * @author Usuario
 */
  @ManagedBean
@RequestScoped
public class Nodo1Controlador2 implements Serializable{
  
      private static final long serialVersionUID = 6401166601481931346L;
      
    private Nodo1 objNodo1;
    private ArrayList<Nodo1> lstNodo1;
    private ArrayList<Nodo1> lstNodoC;
    private Nodo1 nodo1Sel;
    private int estadoSel;
    private ArrayList<String> images;
    
     

    /**
     * Creates a new instance of Nodo1Controlador2
     */
    public Nodo1Controlador2() {
        this.nodo1Sel = new Nodo1();
        this.objNodo1 = new Nodo1();
        this.cargarNodo1();
        //this.graficar2();
        this.init();
        this.estadoSel = -1;
        this.images= new ArrayList<String>();
    }

    public void cargarNodo1() {
        try {
            //lstNodo1.clear();
            lstNodo1 = FNodo1.obtenerNodo1Ultimo();
        } catch (Exception e) {
            Util.addErrorMessage(e, " Error");
        }
    }



    public Nodo1 getObjNodo1() {
        return objNodo1;
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
    
    public ArrayList<Nodo1> getLstNodoC() {
        return lstNodoC;
    }

    public void setLstNodoC(ArrayList<Nodo1> lstNodoC) {
        this.lstNodoC = lstNodoC;
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
  
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 4; i++) {
            images.add("magap" + i + ".jpg");
        }
    }
 
    public ArrayList<String> getImages() {
        return images;
    }
}
