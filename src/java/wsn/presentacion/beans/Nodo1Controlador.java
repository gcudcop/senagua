/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsn.presentacion.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.DateFormat;
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
public final class Nodo1Controlador implements Serializable {

    private static final long serialVersionUID = 6401166601481931346L;
    private CartesianChartModel lineModel1;
    //private CartesianChartModel lineModel2;
    Date date1 = new java.util.Date();
    // Date date2 = new java.util.Date();
    private Nodo1 objNodo1;
    private Nodo1 objNodo1Buscar;
    private ArrayList<Nodo1> lstNodo1;
    private ArrayList<Nodo1> lstNodoB;
    private ArrayList<Nodo1> lstNodoUltimo;
    private ArrayList<Nodo1> lstNodoBuscar;
    private String comando1;
    private String comando2;
    private String comando5;

    private Nodo1 nodo1Sel;
    private int estadoSel;
    private int estadoSel1;
    //private Date date1;
    // private Date date2;
    private String fecha1;
    private String modo1;
    private String estado_valvula;

    /**
     * Creates a new instance of Nodo1Controlador
     */
    public Nodo1Controlador() {
        this.reinit();

    }

    private void reinit() {
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        this.nodo1Sel = new Nodo1();
        this.objNodo1 = new Nodo1();
        this.objNodo1Buscar = new Nodo1();
        this.lstNodo1 = new ArrayList<Nodo1>();
        this.lstNodoB = new ArrayList<Nodo1>();
        this.lstNodoBuscar = new ArrayList<Nodo1>();
        this.estadoSel = -1;
        this.estadoSel1 = -1;
        this.comando1 = "rman";
        this.comando2 = "rmaf";
        this.comando5 = "uuyy";
        //this.cargarNodo1();
        this.obtenerNodo1DadoFecha();
        this.graficar();

        //fecha1 = sdf.format(date1);
    }

    public void cargarNodo1() {
        try {
            //lstNodo1.clear();
            lstNodo1 = FNodo1.obtenerTodos();

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");

        }
    }

    public String getModo1() {
        return modo1;
    }

    public void setModo1(String modo1) {
        this.modo1 = modo1;
    }

    public String getEstado_valvula() {
        return estado_valvula;
    }

    public void setEstado_valvula(String estado_valvula) {
        this.estado_valvula = estado_valvula;
    }

    public ArrayList<Nodo1> getLstNodoBuscar() {
        return lstNodoBuscar;
    }

    public void setLstNodoBuscar(ArrayList<Nodo1> lstNodoBuscar) {
        this.lstNodoBuscar = lstNodoBuscar;
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

    public Nodo1 getObjNodo1() {
        return objNodo1;
    }

    public String getComando1() {
        return comando1;
    }

    public Nodo1 getObjNodo1Buscar() {
        return objNodo1Buscar;
    }

    public void setObjNodo1Buscar(Nodo1 objNodo1Buscar) {
        this.objNodo1Buscar = objNodo1Buscar;
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

    @PostConstruct
    public void graficar() {

        lineModel1 = new CartesianChartModel();
        //lineModel2 = new CartesianChartModel();
        java.text.SimpleDateFormat sdf1 = new java.text.SimpleDateFormat("dd/MM/yyyy");
        fecha1 = sdf1.format(date1);
        try {
            //lstNodoB.clear();
            lstNodoBuscar = FNodo1.obtenerNodo1DadoFecha(fecha1);
            //lstNodoBuscar = FNodo1.obtenerTodos();
            final ChartSeries humedad1 = new ChartSeries("Humedad1");
            for (Nodo1 pr : lstNodoBuscar) {
                humedad1.set(pr.getFecha(), Double.parseDouble(pr.getHumedad1()));
            }
            final ChartSeries humedad2 = new ChartSeries("Humedad2");
            for (Nodo1 pr : lstNodoBuscar) {
                humedad2.set(pr.getFecha(), Double.parseDouble(pr.getHumedad2()));
            }
            lineModel1.addSeries(humedad1);
            lineModel1.addSeries(humedad2);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }

    }

    public CartesianChartModel getGrficar() {
        return lineModel1;
    }

    public void setLineModel1(CartesianChartModel lineModel1) {
        this.lineModel1 = lineModel1;
    }

    public void encender() {
        try {
            //comando1.setEstado(estadoSel1);

            if (FNodo1.emisorUdp(comando1) == true) {
                FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Petición Enviada");
                FacesContext.getCurrentInstance().addMessage(null, mensaje);
                DefaultRequestContext.getCurrentInstance().execute("dlgEncender.hide()");
                //this.comando1 = new comando1();
                estadoSel = -1;
            } else {
                FacesMessage mensajeError = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atención", "Petición no enviada");
                FacesContext.getCurrentInstance().addMessage(null, mensajeError);
            }
        } catch (Exception e) {
            FacesMessage mensajeErrorIngreso = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, mensajeErrorIngreso);
        }
    }

    public void apagar() {
        try {
            //comando1.setEstado(estadoSel1);

            if (FNodo1.emisorUdp(comando2) == true) {
                FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Petición Enviada");
                FacesContext.getCurrentInstance().addMessage(null, mensaje);
                DefaultRequestContext.getCurrentInstance().execute("dlgApagar.hide()");
                //this.comando1 = new comando1();
                estadoSel = -1;
            } else {
                FacesMessage mensajeError = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atención", "Petición no enviada");
                FacesContext.getCurrentInstance().addMessage(null, mensajeError);
            }
        } catch (Exception e) {
            FacesMessage mensajeErrorIngreso = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, mensajeErrorIngreso);
        }
    }

    public void automatico() {
        try {
            //comando1.setEstado(estadoSel1);

            if (FNodo1.emisorUdp(comando5) == true) {
                FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Petición Enviada");
                FacesContext.getCurrentInstance().addMessage(null, mensaje);
                DefaultRequestContext.getCurrentInstance().execute("dlgAutomatico.hide()");
                //this.comando1 = new comando1();
                estadoSel = -1;
            } else {
                FacesMessage mensajeError = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atención", "Petición no enviada");
                FacesContext.getCurrentInstance().addMessage(null, mensajeError);
            }
        } catch (Exception e) {
            FacesMessage mensajeErrorIngreso = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, mensajeErrorIngreso);
        }
    }

    public void manual() {
        try {
            //comando1.setEstado(estadoSel1);

            if (FNodo1.emisorUdp(comando5) == true) {
                FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Petición Enviada");
                FacesContext.getCurrentInstance().addMessage(null, mensaje);
                DefaultRequestContext.getCurrentInstance().execute("dlgManual.hide()");
                //this.comando1 = new comando1();
                estadoSel = -1;
            } else {
                FacesMessage mensajeError = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atención", "Petición no enviada");
                FacesContext.getCurrentInstance().addMessage(null, mensajeError);
            }
        } catch (Exception e) {
            FacesMessage mensajeErrorIngreso = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, mensajeErrorIngreso);
        }
    }

    public void obtenerNodo1DadoFecha() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        fecha1 = sdf.format(date1);

        try {

            //lstNodoB.clear();
            lstNodoB = FNodo1.obtenerNodo1DadoFecha(fecha1);

        } catch (Exception e) {
            Util.addErrorMessage("private void obtenerNodo1DadoFecha: " + e.getMessage());
            System.out.println("private void obtenerNodo1DadoFecha: " + e.getMessage());
        }

    }

}
