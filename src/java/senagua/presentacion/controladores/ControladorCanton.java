/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senagua.presentacion.controladores;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import recursos.Util;
import senagua.logica.clases.Canton;
import senagua.logica.servicios.ServiciosCanton;

/**
 *
 * @author Enrique
 */
@ManagedBean
@ViewScoped
public class ControladorCanton {
    
 private ArrayList<Canton> listCantones;
    private Canton canton;
    private Canton cantonSel;

 
    public ControladorCanton(){
        this.init();
    }

    private void init() {
        this.canton = new Canton();
        this.cantonSel= new Canton();
        this.listCantones= new ArrayList<Canton>();
        this.obtenerCanton();
    }

    public void obtenerCanton() {
        try {
            this.listCantones = ServiciosCanton.obtenerCanton();
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerCanton() dice: " + e.getMessage());
            System.out.println("public void obtenerCanton() dice: " + e.getMessage());
        }
    }

    public ArrayList<Canton> getListCantones() {
        return listCantones;
    }

    public void setListCantones(ArrayList<Canton> listCantones) {
        this.listCantones = listCantones;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

    public Canton getCantonSel() {
        return cantonSel;
    }

    public void setCantonSel(Canton cantonSel) {
        this.cantonSel = cantonSel;
    }
    
    
}
