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
import senagua.logica.clases.Dirigente;
import senagua.logica.servicios.ServiciosDirigente;
@ManagedBean
@ViewScoped
public class ControladorDirigente {
 private ArrayList<Dirigente> listDirigentes;
    private Dirigente dirigente;
    private Dirigente dirigenteSel;

 
    public ControladorDirigente(){
        this.init();
    }

    private void init() {
        this.dirigente = new Dirigente();
        this.dirigenteSel= new Dirigente();
        this.listDirigentes = new ArrayList<Dirigente>();
        this.obtenerDirigente();
    }

    public void obtenerDirigente() {
        try {
            this.listDirigentes = ServiciosDirigente.obtenerDirigente();
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerDirigente() dice: " + e.getMessage());
            System.out.println("public void obtenerDirigente() dice: " + e.getMessage());
        }
    }

    public ArrayList<Dirigente> getListDirigentes() {
        return listDirigentes;
    }

    public Dirigente getDirigente() {
        return dirigente;
    }

    public Dirigente getDirigenteSel() {
        return dirigenteSel;
    }

    public void setListDirigentes(ArrayList<Dirigente> listDirigentes) {
        this.listDirigentes = listDirigentes;
    }

    public void setDirigente(Dirigente dirigente) {
        this.dirigente = dirigente;
    }

    public void setDirigenteSel(Dirigente dirigenteSel) {
        this.dirigenteSel = dirigenteSel;
    }
    
}
