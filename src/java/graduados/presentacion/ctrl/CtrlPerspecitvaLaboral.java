/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.ctrl;

import graduados.logica.entidades.PerspectivaLaboral;
import graduados.logica.servicios.SrvcPerspectivaLaboral;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Geovanny
 */
@ManagedBean
@ViewScoped
public class CtrlPerspecitvaLaboral {

    private ArrayList<PerspectivaLaboral> lstSeccionDos;
    private PerspectivaLaboral detalles;

    public CtrlPerspecitvaLaboral() {
        this.init();
    }

    private void init() {
        this.lstSeccionDos = new ArrayList<PerspectivaLaboral>();
        this.obtenerDatos();
    }

    public void obtenerDatos() {
        try {
            this.lstSeccionDos = SrvcPerspectivaLaboral.obtenerSeccionDos();
        } catch (Exception e) {
        }
    }

    public ArrayList<PerspectivaLaboral> getLstSeccionDos() {
        return lstSeccionDos;
    }

    public void setLstSeccionDos(ArrayList<PerspectivaLaboral> lstSeccionDos) {
        this.lstSeccionDos = lstSeccionDos;
    }

    public PerspectivaLaboral getDetalles() {
        return detalles;
    }

    public void setDetalles(PerspectivaLaboral detalles) {
        this.detalles = detalles;
    }

}
