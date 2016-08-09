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
import senagua.logica.clases.Provincia;
import senagua.logica.servicios.ServiciosProvincia;

@ManagedBean
@ViewScoped


/**
 *
 * @author Enrique
 */
public class ControladorProvincia {
   
    private ArrayList<Provincia> listProvincia;
    private Provincia provincia;
    private Provincia provinciaSel;

 
    public ControladorProvincia(){
        this.init();
    }

    private void init() {
        this.provincia = new Provincia();
        this.provinciaSel = new Provincia();
        this.listProvincia = new ArrayList<Provincia>();
        this.obtenerProvincia();
    }

    public void obtenerProvincia() {
        try {
            this.listProvincia = ServiciosProvincia.obtenerProvincias();
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerProvincia() dice: " + e.getMessage());
            System.out.println("public void obtenerProvincia() dice: " + e.getMessage());
        }
    }

    public ArrayList<Provincia> getListProvincia() {
        return listProvincia;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public Provincia getProvinciaSel() {
        return provinciaSel;
    }

    public void setListProvincia(ArrayList<Provincia> listProvincia) {
        this.listProvincia = listProvincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public void setProvinciaSel(Provincia provinciaSel) {
        this.provinciaSel = provinciaSel;
    }
    
	
}
