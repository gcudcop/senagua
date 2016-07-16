/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.ctrl;

import graduados.logica.entidades.Graduado;
import graduados.logica.servicios.ServiciosGraduados;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;
import recursos.StringToDate;
import recursos.Util;

/**
 *
 * @author Geovanny
 */
@ManagedBean
@ViewScoped
public class CtrlGraduado {

    private Graduado graduado;
    private Graduado graduadoSel;
    private ArrayList<Graduado> lstGraduados;
    private Date fechaNacimiento;
    private String genero;
    private String estadoCivil;

    public CtrlGraduado() {
        this.init();
    }

    private void init() {
        this.graduado = new Graduado();
        this.graduadoSel = new Graduado();
        this.lstGraduados = new ArrayList<Graduado>();
        this.genero = null;
        this.obtenerGraduados();

    }

    public void obtenerGraduados() {
        try {
            this.lstGraduados = ServiciosGraduados.obtenerGraduados();
            System.out.println("test graduados: " + lstGraduados.get(0).getApellidos());
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerGraduados() dice: " + e.getMessage());
            System.out.println("public void obtenerGraduados() dice: " + e.getMessage());
        }
    }

    public void insertarGraduado() {
        try {
            graduado.setFechaNacimiento(StringToDate.devolverFecha(fechaNacimiento));
            graduado.setGenero(genero);
            graduado.setEstadoCivil(estadoCivil);
            if (ServiciosGraduados.insertarGraduado(graduado)) {
                this.init();
                DefaultRequestContext.getCurrentInstance().execute("wdlgNuevoGraduado.hide()");
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

    public void eliminarGraduado() {
        try {
            if (ServiciosGraduados.eliminarGraduado((int) graduadoSel.getCodigo())) {
                this.init();
                DefaultRequestContext.getCurrentInstance().execute("wdlgEliminarGraduado.hide()");
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

    /*
     *** getters y setters
     */
    public Graduado getGraduado() {
        return graduado;
    }

    public void setGraduado(Graduado graduado) {
        this.graduado = graduado;
    }

    public Graduado getGraduadoSel() {
        return graduadoSel;
    }

    public void setGraduadoSel(Graduado graduadoSel) {
        this.graduadoSel = graduadoSel;
    }

    public ArrayList<Graduado> getLstGraduados() {
        return lstGraduados;
    }

    public void setLstGraduados(ArrayList<Graduado> lstGraduados) {
        this.lstGraduados = lstGraduados;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

}
