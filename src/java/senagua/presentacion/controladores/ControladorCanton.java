/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senagua.presentacion.controladores;

import java.time.Clock;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;
import recursos.Util;
import senagua.logica.clases.Canton;
import senagua.logica.clases.Provincia;
import senagua.logica.servicios.ServiciosCanton;
import senagua.logica.servicios.ServiciosProvincia;

/**
 *
 * @author Enrique
 */
@ManagedBean
@ViewScoped
public class ControladorCanton {

    private ArrayList<Canton> listCantones;
    private ArrayList<Provincia> listProvincia;
    private Canton canton;
    private Canton cantonSel;
    private int codigoProvincia;

    public ControladorCanton() {
        this.init();
    }

    private void init() {
        this.canton = new Canton();
        this.cantonSel = new Canton();
        this.listCantones = new ArrayList<Canton>();
        this.listProvincia = new ArrayList<Provincia>();
        this.obtenerCanton();
        this.obtenerProvincia();
    }

    public void obtenerCanton() {
        try {
            this.listCantones = ServiciosCanton.obtenerCanton();
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerCanton() dice: " + e.getMessage());
            System.out.println("public void obtenerCanton() dice: " + e.getMessage());
        }
    }

    public void obtenerProvincia() {
        try {
            this.listProvincia = ServiciosProvincia.obtenerProvincias();
            //System.out.println("prueba obtener provincia" + listProvincia.get(0).getNombreProvincia());
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerProvincia() dice: " + e.getMessage());
            System.out.println("public void obtenerProvincia() dice: " + e.getMessage());
        }
    }

    public void insertarCanton() {
        try {
            Provincia p = new Provincia();
            p.setCodigoProvincia(codigoProvincia);
            canton.setCodigoProvincia(p);
            //FUsuario.Insertar(usuario, persona.getCodigo_persona());
            if (ServiciosCanton.insertarCanton(canton)==1) {
                this.init();
                canton = new Canton();
                codigoProvincia=0;
                DefaultRequestContext.getCurrentInstance().execute("wdlgNuevoCanton.hide()");
                Util.addSuccessMessage("Datos Insertados");
                this.obtenerCanton();
            } else {
              System.out.println("falló la funcion");
            }

        } catch (Exception e) {
            Util.addErrorMessage("public void insertarCanton() dice: " + e.getMessage());
            System.out.println("public void insertarCanton() dice: " + e.getMessage());
        }
    }
    public void editarCanton(){      
         try {
             Provincia p = new Provincia();
            p.setCodigoProvincia(codigoProvincia);
            cantonSel.setCodigoProvincia(p);
             if (ServiciosCanton.actualizarCanton(cantonSel)) {
                this.init();
                cantonSel=new Canton();
                codigoProvincia=0;
                DefaultRequestContext.getCurrentInstance().execute("wdlgEditarCanton.hide()");
                Util.addSuccessMessage("Información guardada con éxito");
                System.out.println("public void EditarCanton() dice: Error al guardar la información");
            } else {
                Util.addSuccessMessage("Error al guardar la información");
                System.out.println("public void EditarCanton() dice: Error al guardar la información");
            }
         } catch (Exception e) {
             Util.addErrorMessage("public void EditarCanton() dice: " + e.getMessage());
            System.out.println("public void EditarCanton() dice: " + e.getMessage());
         }
     }
    
    public void eliminarCanton() {
        try {
            //if (ServiciosGraduados.eliminarGraduado((int) graduadoSel.getCodigo())) {
            if(ServiciosCanton.eliminarCanton((int)cantonSel.getCodigoCanton())){
                this.init();
                DefaultRequestContext.getCurrentInstance().execute("wdlgEliminarCanton.hide()");
                Util.addSuccessMessage("Información eliminada.");
                System.out.println("public void eliminarCanton() dice: Información eliminada.");
            } else {
                Util.addErrorMessage("Error al eliminar la información.");
                System.out.println("public void eliminarCanton() dice: Error al eliminar la información");
            }
        } catch (Exception e) {
            Util.addErrorMessage("public void eliminarCanton() dice: " + e.getMessage());
            System.out.println("public void eliminarCanton() dice: " + e.getMessage());
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

    public int getCodigoProvincia() {
        return codigoProvincia;
    }
    
     public void setCodigoProvincia(int codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }
    public ArrayList<Provincia> getListProvincia() {
        return listProvincia;
    }

    public void setListProvincia(ArrayList<Provincia> listProvincia) {
        this.listProvincia = listProvincia;
    }

}
