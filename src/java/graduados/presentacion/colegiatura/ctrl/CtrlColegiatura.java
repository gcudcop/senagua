/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.colegiatura.ctrl;

import graduados.logica.entidades.Colegiatura;
import graduados.logica.servicios.ServiciosColegiatura;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Geovanny
 */
@ManagedBean
@ViewScoped
public class CtrlColegiatura {

    private ArrayList<Colegiatura> lstCoelgiatura;

    public CtrlColegiatura() {
        this.init();
    }

    private void init() {
        this.lstCoelgiatura = new ArrayList<Colegiatura>();
        this.obtenerColegiatura();
    }

    public void obtenerColegiatura() {
        try {
            this.lstCoelgiatura = ServiciosColegiatura.obtenerColegiatura();
        } catch (Exception e) {
            System.out.println("obtenerColegiatura() dice: " + e.getMessage());
        }
    }

    public ArrayList<Colegiatura> getLstCoelgiatura() {
        return lstCoelgiatura;
    }

    public void setLstCoelgiatura(ArrayList<Colegiatura> lstCoelgiatura) {
        this.lstCoelgiatura = lstCoelgiatura;
    }

}
