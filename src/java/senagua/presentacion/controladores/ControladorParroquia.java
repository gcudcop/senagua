/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senagua.presentacion.controladores;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;
import recursos.Util;
import senagua.logica.clases.Canton;
import senagua.logica.clases.Parroquia;
import senagua.logica.servicios.ServiciosCanton;
import senagua.logica.servicios.ServiciosParroquia;

@ManagedBean
@ViewScoped
public class ControladorParroquia {
    private ArrayList<Parroquia> listParroquia;
    private ArrayList<Canton> listCanton;
    private Parroquia parroquia;
    private Parroquia parroquiaSel;
    private int codigoCanton;

 
    public ControladorParroquia(){
        this.init();
    }

    private void init() {
        this.parroquia = new Parroquia();
        this.parroquiaSel = new Parroquia();
        this.listParroquia = new ArrayList<Parroquia>();
        this.obtenerParroquia();
        this.obtenerCantones();
    }

    public void obtenerParroquia(){
        try {
            this.listCanton=ServiciosCanton.obtenerCanton();
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerParroquia() dice: " + e.getMessage());
            System.out.println("public void obtenerParroquia() dice: " + e.getMessage());
        }
    }
    
     public void obtenerCantones(){
        try {
            this.listParroquia = ServiciosParroquia.obtenerParroquia();
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerParroquia() dice: " + e.getMessage());
            System.out.println("public void obtenerParroquia() dice: " + e.getMessage());
        }
    }

     public void insertarParroquia(){
         try {
             Canton c=new Canton();
             c.setCodigoCanton(codigoCanton);
             parroquia.setCodigoCanton(c);
             if (ServiciosParroquia.insertarParroquia(parroquia)) {
                this.init();
                parroquia=new Parroquia();
                codigoCanton=0;
                DefaultRequestContext.getCurrentInstance().execute("wdlgNuevaParroquia.hide()");
                Util.addSuccessMessage("Información guardada con éxito");
                System.out.println("public void insertarGraduado() dice: Error al guardar la información");
            } else {
                Util.addSuccessMessage("Error al guardar la información");
                System.out.println("public void insertarGraduado() dice: Error al guardar la información");
            }
         } catch (Exception e) {
             Util.addErrorMessage("public void insertarGraduado() dice: " + e.getMessage());
            System.out.println("public void insertarGraduado() dice: " + e.getMessage());
         }
     }
     
     public void editarParroquia(){
         try {
             Canton c=new Canton();
             c.setCodigoCanton(codigoCanton);
             parroquiaSel.setCodigoCanton(c);
             if (ServiciosParroquia.actualizarParroquia(parroquiaSel)) {
                this.init();
                parroquiaSel=new Parroquia();
                codigoCanton=0;
                DefaultRequestContext.getCurrentInstance().execute("wdlgEditarParroquia.hide()");
                Util.addSuccessMessage("Información guardada con éxito");
                System.out.println("public void insertarGraduado() dice: Error al guardar la información");
            } else {
                Util.addSuccessMessage("Error al guardar la información");
                System.out.println("public void insertarGraduado() dice: Error al guardar la información");
            }
         } catch (Exception e) {
             Util.addErrorMessage("public void insertarGraduado() dice: " + e.getMessage());
            System.out.println("public void insertarGraduado() dice: " + e.getMessage());
         }
     }
     
     public void eliminarParroquia() {
        try {
            //if (ServiciosGraduados.eliminarGraduado((int) graduadoSel.getCodigo())) {
            if(ServiciosParroquia.eliminarParroquia((int)parroquiaSel.getCodigoParoquia())){
                this.init();
                DefaultRequestContext.getCurrentInstance().execute("wdlgEliminarParroquia.hide()");
                Util.addSuccessMessage("Información eliminada.");
                System.out.println("public void eliminarGraduado() dice: Información eliminada.");
            } else {
                Util.addErrorMessage("Error al eliminar la información.");
                System.out.println("public void eliminarGraduado() dice: Error al eliminar la información");
            }
        } catch (Exception e) {
            Util.addErrorMessage("public void eliminarGraduado() dice: " + e.getMessage());
            System.out.println("public void eliminarGraduado() dice: " + e.getMessage());
        }

    }
     
    public ArrayList<Parroquia> getListParroquia() {
        return listParroquia;
    }

    public void setListParroquia(ArrayList<Parroquia> listParroquia) {
        this.listParroquia = listParroquia;
    }

    public Parroquia getParroquia() {
        return parroquia;
    }

    public void setParroquia(Parroquia parroquia) {
        this.parroquia = parroquia;
    }

    public Parroquia getParroquiaSel() {
        return parroquiaSel;
    }

    public void setParroquiaSel(Parroquia parroquiaSel) {
        this.parroquiaSel = parroquiaSel;
    }

    public int getCodigoCanton() {
        return codigoCanton;
    }

    public void setCodigoCanton(int codigoCanton) {
        this.codigoCanton = codigoCanton;
    }

    public ArrayList<Canton> getListCanton() {
        return listCanton;
    }

    public void setListCanton(ArrayList<Canton> listCanton) {
        this.listCanton = listCanton;
    }

    

    
}
