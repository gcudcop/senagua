/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senagua.logica.clases;

/**
 *
 * @author Geovanny
 */
public class Parroquia {

    private int codigoParoquia;
    private Canton codigoCanton;
    private String nombre;
    private Double poblacion;
    private String observaciones;

    public Parroquia() {
    }

    public Parroquia(int codigoParoquia, Canton codigoCanton, String nombre, Double poblacion, String observaciones) {
        this.codigoParoquia = codigoParoquia;
        this.codigoCanton = codigoCanton;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.observaciones = observaciones;
    }

    public int getCodigoParoquia() {
        return codigoParoquia;
    }

    public void setCodigoParoquia(int codigoParoquia) {
        this.codigoParoquia = codigoParoquia;
    }

    public Canton getCodigoCanton() {
        return codigoCanton;
    }

    public void setCodigoCanton(Canton codigoCanton) {
        this.codigoCanton = codigoCanton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Double poblacion) {
        this.poblacion = poblacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
