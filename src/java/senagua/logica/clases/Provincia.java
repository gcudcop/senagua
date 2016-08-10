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
public class Provincia {

    private int codigoProvincia;
    private String nombreProvincia;
    private Double poblacion;
    private String observaciones;

    public Provincia() {
    }

    public Provincia(int codigoProvincia, String nombreProvincia, Double poblacion, String observaciones) {
        this.codigoProvincia = codigoProvincia;
        this.nombreProvincia = nombreProvincia;
        this.poblacion = poblacion;
        this.observaciones = observaciones;
    }
    
    public int getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(int codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
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
