/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senagua.presentacion.controladores;

import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;
import recursos.StringToDate;
import recursos.Util;
import senagua.logica.clases.Dirigente;
import senagua.logica.servicios.ServiciosDirigente;

@ManagedBean
@ViewScoped
public class ControladorDirigente {
 private ArrayList<Dirigente> listDirigentes;
    private Dirigente dirigente;
    private Dirigente dirigenteSel;
    private Date fechanacimiento;
    private Date fechaingreso;

 
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
      public void insertarDirigente(){
         try {
             dirigente.setFecha_de_nacimiento(StringToDate.devolverFecha(fechanacimiento));
             dirigente.setFecha_ingreso(StringToDate.devolverFecha(fechaingreso));
             if (ServiciosDirigente.insertarDirigente(dirigente)) {
                this.init();
                dirigente=new Dirigente();
                DefaultRequestContext.getCurrentInstance().execute("wdlgNuevoDirigente.hide()");
                Util.addSuccessMessage("Información guardada con éxito");
                System.out.println("public void insertarDirigente() dice: Error al guardar la información");
            } else {
                Util.addSuccessMessage("Error al guardar la información");
                System.out.println("public void insertarDirigente() dice: Error al guardar la información");
            }
         } catch (Exception e) {
             Util.addErrorMessage("public void insertarDirigente dice: " + e.getMessage());
            System.out.println("public void insertarDirigente dice: " + e.getMessage());
         }
     }
     
     public void editarDirigente(){
         try {
         dirigente.setFecha_de_nacimiento(StringToDate.devolverFecha(fechanacimiento));
             dirigente.setFecha_ingreso(StringToDate.devolverFecha(fechaingreso));
             if (ServiciosDirigente.actualizarDirigente(dirigente)) {
                this.init();
                dirigenteSel=new Dirigente();
                DefaultRequestContext.getCurrentInstance().execute("wdlgEditarDirigente.hide()");
                Util.addSuccessMessage("Información guardada con éxito");
                System.out.println("public void editarDirigente() dice: Error al guardar la información");
            } else {
                Util.addSuccessMessage("Error al guardar la información");
                System.out.println("public void editarDirigente() dice: Error al guardar la información");
            }
         } catch (Exception e) {
             Util.addErrorMessage("public void editarDirigente() dice: " + e.getMessage());
            System.out.println("public void editarDirigente() dice: " + e.getMessage());
         }
     }
     
     public void eliminarDirigente() {
        try {
            //if (ServiciosGraduados.eliminarGraduado((int) graduadoSel.getCodigo())) {
            if(ServiciosDirigente.eliminarDirigente((int)dirigenteSel.getCodigoDirigente())){
                this.init();
                DefaultRequestContext.getCurrentInstance().execute("wdlgEliminarDirigente.hide()");
                Util.addSuccessMessage("Información eliminada.");
                System.out.println("public void eliminarDirigente() dice: Información eliminada.");
            } else {
                Util.addErrorMessage("Error al eliminar la información.");
                System.out.println("public void eliminarDirigente() dice: Error al eliminar la información");
            }
        } catch (Exception e) {
            Util.addErrorMessage("public void eliminarDirigente() dice: " + e.getMessage());
            System.out.println("public void eliminarDirigente() dice: " + e.getMessage());
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

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }
    
}
