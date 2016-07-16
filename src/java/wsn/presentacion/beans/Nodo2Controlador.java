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
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.DefaultRequestContext;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;
import wsn.logica.clases.Nodo1;
import wsn.logica.clases.Nodo2;
import wsn.logica.funciones.FNodo1;
import wsn.logica.funciones.FNodo2;

/**
 *
 * @author gcudcop
 */
@ManagedBean
@RequestScoped
public class Nodo2Controlador implements Serializable {

    private static final long serialVersionUID = 6401166601481931346L;
    private CartesianChartModel lineModel1;
    Date date1 = new java.util.Date();
    private Nodo2 objNodo2;
    private ArrayList<Nodo2> lstNodo2;
    private ArrayList<Nodo2> lstNodoBuscar;
    private ArrayList<Nodo2> lstNodoB;
    private Nodo2 nodo2Sel;
    private int estadoSel;
    private String comando3;
    private String comando4;
    private String comando6;
    private String fecha1;

    /**
     * Creates a new instance of Nodo2Controlador
     */
    public Nodo2Controlador() {
       this.reinit();

    }
    
    public void reinit(){
        this.nodo2Sel = new Nodo2();
        this.objNodo2 = new Nodo2();
        this.cargarNodo2();
        this.lstNodoB = new ArrayList<Nodo2>();
        this.estadoSel = -1;
        this.comando3 = "rmbn";
        this.comando4 = "rmbf";
        this.comando6 = "uuzz";
        this.obtenerNodo2DadoFecha();
        this.graficar();
    }

    public void cargarNodo2() {
        try {
            lstNodo2 = FNodo2.obtenerTodos();
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
    }

    public ArrayList<Nodo2> getLstNodoBuscar() {
        return lstNodoBuscar;
    }

    public void setLstNodoBuscar(ArrayList<Nodo2> lstNodoBuscar) {
        this.lstNodoBuscar = lstNodoBuscar;
    }

    public ArrayList<Nodo2> getLstNodoB() {
        return lstNodoB;
    }

    public void setLstNodoB(ArrayList<Nodo2> lstNodoB) {
        this.lstNodoB = lstNodoB;
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

    public String getComando3() {
        return comando3;
    }

    public void setComando3(String comando3) {
        this.comando3 = comando3;
    }

    public String getComando4() {
        return comando4;
    }

    public void setComando4(String comando4) {
        this.comando4 = comando4;
    }

    public String getComando6() {
        return comando6;
    }

    public void setComando6(String comando6) {
        this.comando6 = comando6;
    }

    @PostConstruct
    public void graficar() {
        lineModel1 = new CartesianChartModel();
        java.text.SimpleDateFormat sdf1 = new java.text.SimpleDateFormat("dd/MM/yyyy");
        fecha1 = sdf1.format(date1);
        try {
            lstNodoBuscar = FNodo2.obtenerNodo2DadoFecha(fecha1);
            final ChartSeries humedad3 = new ChartSeries("Humedad3");
            for (Nodo2 pr : lstNodoBuscar) {
                humedad3.set(pr.getFecha(), Double.parseDouble(pr.getHumedad3()));
            }
            final ChartSeries humedad4 = new ChartSeries("Humedad4");
            for (Nodo2 pr : lstNodoBuscar) {
                humedad4.set(pr.getFecha(), Double.parseDouble(pr.getHumedad4()));
            }
            lineModel1.addSeries(humedad3);
            lineModel1.addSeries(humedad4);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }

    }

    public CartesianChartModel getGrficar() {
        return lineModel1;
    }

    public void encender() {
        try {
           //comando1.setEstado(estadoSel1);

            if (FNodo1.emisorUdp(comando3) == true) {
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

            if (FNodo1.emisorUdp(comando4) == true) {
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

            if (FNodo1.emisorUdp(comando6) == true) {
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

            if (FNodo1.emisorUdp(comando6) == true) {
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
    
    public void obtenerNodo2DadoFecha() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        fecha1 = sdf.format(date1);
        
        try {

            //lstNodoB.clear();
            lstNodoB = FNodo2.obtenerNodo2DadoFecha(fecha1);
            
        } catch (Exception e) {
            Util.addErrorMessage("private void obtenerNodo2DadoFecha: " + e.getMessage());
            System.out.println("private void obtenerNodo2DadoFecha: " + e.getMessage());
        }
        
                    
    }
}
