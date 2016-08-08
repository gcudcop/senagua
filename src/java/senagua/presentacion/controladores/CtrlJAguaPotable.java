package senagua.presentacion.controladores;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import recursos.Util;
import senagua.logica.clases.JAguaPotable;
import senagua.logica.servicios.ServiciosJAguaPotable;

@ManagedBean
@ViewScoped
public class CtrlJAguaPotable {

    private ArrayList<JAguaPotable> listJuntas;
    private JAguaPotable junta;
    private JAguaPotable juntaSel;

    public CtrlJAguaPotable() {
        this.init();
    }

    private void init() {
        this.junta = new JAguaPotable();
        this.juntaSel = new JAguaPotable();
        this.listJuntas = new ArrayList<JAguaPotable>();
        this.obtenerJuntas();
    }

    public void obtenerJuntas() {
        try {
            this.listJuntas = ServiciosJAguaPotable.obtenerJuntas();
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerJuntas() dice: " + e.getMessage());
            System.out.println("public void obtenerJuntas() dice: " + e.getMessage());
        }
    }

    /*
     getters y setters
     */
    public ArrayList<JAguaPotable> getListJuntas() {
        return listJuntas;
    }

    public void setListJuntas(ArrayList<JAguaPotable> listJuntas) {
        this.listJuntas = listJuntas;
    }

    public JAguaPotable getJunta() {
        return junta;
    }

    public void setJunta(JAguaPotable junta) {
        this.junta = junta;
    }

    public JAguaPotable getJuntaSel() {
        return juntaSel;
    }

    public void setJuntaSel(JAguaPotable juntaSel) {
        this.juntaSel = juntaSel;
    }

}
