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
import senagua.logica.clases.Parroquia;
import senagua.logica.servicios.ServiciosParroquia;

/**
 *
 * @author Enrique
 */
@ManagedBean
@ViewScoped
public class ControladorParroquia {
    
  private ArrayList<Parroquia> listParroquias;
    private Parroquia parroquia;
    private Parroquia parroquiaSel;
    public ControladorParroquia() {
        this.init();
    }

    private void init() {
        this.parroquia = new Parroquia();
        this.parroquiaSel = new Parroquia();
        this.listParroquias = new ArrayList<Parroquia>();
        this.obtenerParroquia();
    }

    public void obtenerParroquia() {
        try {
            this.listParroquias= ServiciosParroquia.obtenerParroquia();
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerParroquia() dice: " + e.getMessage());
            System.out.println("public void obtenerParroquia() dice: " + e.getMessage());
        }
    }


    public void setListParroquias(ArrayList<Parroquia> listParroquias) {
        this.listParroquias = listParroquias;
    }

    public void setParroquia(Parroquia parroquia) {
        this.parroquia = parroquia;
    }

    /*
    getters y setters
     */
    public void setParroquiaSel(Parroquia parroquiaSel) {
        this.parroquiaSel = parroquiaSel;
    }

    public ArrayList<Parroquia> getListParroquias() {
        return listParroquias;
    }

    public Parroquia getParroquia() {
        return parroquia;
    }

    public Parroquia getParroquiaSel() {
        return parroquiaSel;
    }

    
}
