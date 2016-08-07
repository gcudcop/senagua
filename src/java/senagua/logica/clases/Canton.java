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
public class Canton {

    private int codigoCanton;
    private Provincia codigoProvincia;
    private String nombre;
    private String observaciones;
    private Double poblacion;

    public Canton() {
    }

    public Canton(int codigoCanton, Provincia codigoProvincia, String nombre, String observaciones, Double poblacion) {
        this.codigoCanton = codigoCanton;
        this.codigoProvincia = codigoProvincia;
        this.nombre = nombre;
        this.observaciones = observaciones;
        this.poblacion = poblacion;
    }

    public int getCodigoCanton() {
        return codigoCanton;
    }

    public void setCodigoCanton(int codigoCanton) {
        this.codigoCanton = codigoCanton;
    }

    public Provincia getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(Provincia codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Double poblacion) {
        this.poblacion = poblacion;
    }

}
