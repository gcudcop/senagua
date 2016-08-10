package senagua.presentacion.controladores;

import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;
import recursos.StringToDate;
import recursos.Util;
import senagua.logica.clases.Canton;
import senagua.logica.clases.Dirigente;
import senagua.logica.clases.JAguaPotable;
import senagua.logica.clases.Parroquia;
import senagua.logica.clases.Provincia;
import senagua.logica.servicios.ServiciosCanton;
import senagua.logica.servicios.ServiciosDirigente;
import senagua.logica.servicios.ServiciosJAguaPotable;
import senagua.logica.servicios.ServiciosParroquia;
import senagua.logica.servicios.ServiciosProvincia;

@ManagedBean
@ViewScoped
public class CtrlJAguaPotable {

    private ArrayList<JAguaPotable> listJuntas;
    private ArrayList<Provincia> provincias;
    private ArrayList<Canton> cantones;
    private ArrayList<Parroquia> parroquias;
    private ArrayList<Dirigente> dirigentes;
    private JAguaPotable junta;
    private JAguaPotable juntaSel;
    private int codigoProvincia;
    private int codigoCanton;
    private int codigoParroquia;
    private int codigoDirigente;
    private Date fechaRegistro;

    public CtrlJAguaPotable() {
        this.init();
    }

    private void init() {
        this.junta = new JAguaPotable();
        this.juntaSel = new JAguaPotable();
        this.listJuntas = new ArrayList<JAguaPotable>();
        this.cantones = new ArrayList<Canton>();
        this.parroquias = new ArrayList<Parroquia>();
        this.provincias = new ArrayList<Provincia>();
        this.dirigentes = new ArrayList<Dirigente>();
        this.obtenerJuntas();
        this.obtenerProvincias();
        this.obtenerDirigentes();
    }

    public void insertarJunta() {
        try {
            Parroquia p = new Parroquia();
            p.setCodigoParoquia(codigoParroquia);
            junta.setCodigoParroquia(p);

            Dirigente d = new Dirigente();
            d.setCodigoDirigente(codigoDirigente);
            junta.setCodigoDirigente(d);

            junta.setFecha_registro(StringToDate.devolverFecha(fechaRegistro));
            if (ServiciosJAguaPotable.insertarJunta(junta)) {
                this.init();
                junta=new JAguaPotable();
                codigoCanton = 0;
                DefaultRequestContext.getCurrentInstance().execute("wdlgNuevaJunta.hide()");
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

    
    public void eliminarJunta() {
        try {            
            if(ServiciosJAguaPotable.eliminarJunta((int)juntaSel.getCodigo())){
                this.init();
                DefaultRequestContext.getCurrentInstance().execute("wdlgEliminarJunta.hide()");
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
    
    
    public void obtenerJuntas() {
        try {
            this.listJuntas = ServiciosJAguaPotable.obtenerJuntas();
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerJuntas() dice: " + e.getMessage());
            System.out.println("public void obtenerJuntas() dice: " + e.getMessage());
        }
    }
    
     public void obtenerJuntasDadoCodigoProvincia() {
        try {
            this.listJuntas = ServiciosJAguaPotable.obtenerJuntasDadoCodigoProvincia(codigoProvincia);
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerJuntas() dice: " + e.getMessage());
            System.out.println("public void obtenerJuntas() dice: " + e.getMessage());
        }
    }

     public void obtenerJuntasDadoCodigoCanton() {
        try {
            this.listJuntas = ServiciosJAguaPotable.obtenerJuntasDadoCodigoCanton(codigoCanton);
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerJuntas() dice: " + e.getMessage());
            System.out.println("public void obtenerJuntas() dice: " + e.getMessage());
        }
    }
    public void obtenerProvincias() {
        try {
            this.provincias = ServiciosProvincia.obtenerProvincias();
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerJuntas() dice: " + e.getMessage());
            System.out.println("public void obtenerJuntas() dice: " + e.getMessage());
        }
    }

    public void obtenerDirigentes() {
        try {
            this.dirigentes = ServiciosDirigente.obtenerDirigente();
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerJuntas() dice: " + e.getMessage());
            System.out.println("public void obtenerJuntas() dice: " + e.getMessage());
        }
    }

    public void obtenerCantonesDadoProvincia() {
        try {
            this.cantones = ServiciosCanton.obtenerCantonesDadoCodigoProvincia(codigoProvincia);
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerJuntas() dice: " + e.getMessage());
            System.out.println("public void obtenerJuntas() dice: " + e.getMessage());
        }
    }
    
    

    public void obtenerParroquiasDadoCanton() {
        try {
            this.parroquias = ServiciosParroquia.obtenerParroquiaDadoCodigoCanton(codigoCanton);
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

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public ArrayList<Canton> getCantones() {
        return cantones;
    }

    public void setCantones(ArrayList<Canton> cantones) {
        this.cantones = cantones;
    }

    public ArrayList<Parroquia> getParroquias() {
        return parroquias;
    }

    public void setParroquias(ArrayList<Parroquia> parroquias) {
        this.parroquias = parroquias;
    }

    public int getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(int codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public int getCodigoCanton() {
        return codigoCanton;
    }

    public void setCodigoCanton(int codigoCanton) {
        this.codigoCanton = codigoCanton;
    }

    public int getCodigoParroquia() {
        return codigoParroquia;
    }

    public void setCodigoParroquia(int codigoParroquia) {
        this.codigoParroquia = codigoParroquia;
    }

    public int getCodigoDirigente() {
        return codigoDirigente;
    }

    public void setCodigoDirigente(int codigoDirigente) {
        this.codigoDirigente = codigoDirigente;
    }

    public ArrayList<Dirigente> getDirigentes() {
        return dirigentes;
    }

    public void setDirigentes(ArrayList<Dirigente> dirigentes) {
        this.dirigentes = dirigentes;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
