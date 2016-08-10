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
import senagua.logica.clases.Provincia;
import senagua.logica.servicios.ServiciosProvincia;

@ManagedBean
@ViewScoped
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
            Util.addErrorMessage("public void obtenerProvincias() dice: " + e.getMessage());
            System.out.println("public void obtenerProvincias() dice: " + e.getMessage());
        }
    }
    public void insertarProvincia(){
         try {
             
             if (ServiciosProvincia.insertarProvincia(provincia)) {
                DefaultRequestContext.getCurrentInstance().execute("wdlgNuevaProvincia.hide()");
                Util.addSuccessMessage("Información guardada con éxito");
                System.out.println("public void insertarProvincia() dice: Error al guardar la información");
            } else {
                Util.addSuccessMessage("Error al guardar la información");
                System.out.println("public void insertarProvincia() dice: Error al guardar la información");
            }
         } catch (Exception e) {
             Util.addErrorMessage("public void insertarProvincia() dice: " + e.getMessage());
            System.out.println("public void insertarProvincia() dice: " + e.getMessage());
         }
     }
    public void editarProvincia(){
         try {
             if (ServiciosProvincia.actualizarProvincia(provinciaSel)) {
                this.init();
                provinciaSel=new Provincia();
                DefaultRequestContext.getCurrentInstance().execute("wdlgEditarProvincia.hide()");
                Util.addSuccessMessage("Información guardada con éxito");
                System.out.println("public void EditarProvincia() dice: Error al guardar la información");
            } else {
                Util.addSuccessMessage("Error al guardar la información");
                System.out.println("public void EditarProvincia() dice: Error al guardar la información");
            }
         } catch (Exception e) {
             Util.addErrorMessage("public void EditarProvincia() dice: " + e.getMessage());
            System.out.println("public void EditarProvincia() dice: " + e.getMessage());
         }
     }
    public void eliminarProvincia() {
        try {
            //if (ServiciosGraduados.eliminarGraduado((int) graduadoSel.getCodigo())) {
            if(ServiciosProvincia.eliminarProvincia((int)provinciaSel.getCodigoProvincia())){
                this.init();
                DefaultRequestContext.getCurrentInstance().execute("wdlgEliminarProvincia.hide()");
                Util.addSuccessMessage("Información eliminada.");
                System.out.println("public void eliminarProvincia() dice: Información eliminada.");
            } else {
                Util.addErrorMessage("Error al eliminar la información.");
                System.out.println("public void eliminarProvincia() dice: Error al eliminar la información");
            }
        } catch (Exception e) {
            Util.addErrorMessage("public void eliminarProvincia() dice: " + e.getMessage());
            System.out.println("public void eliminarProvincia() dice: " + e.getMessage());
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
