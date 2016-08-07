/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senagua.logica.clases;

import java.util.Date;

/**
 *
 * @author Geovanny
 */
public class Dirigente {

    private int codigoDirigente;
    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fecha_de_nacimiento;
    private String genero;
    private Date fecha_ingreso;
    private String observaciones;

    public Dirigente() {
    }

    public Dirigente(int codigoDirigente, String cedula, String nombres, String apellidos, Date fecha_de_nacimiento, String genero, Date fecha_ingreso, String observaciones) {
        this.codigoDirigente = codigoDirigente;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.genero = genero;
        this.fecha_ingreso = fecha_ingreso;
        this.observaciones = observaciones;
    }

    public int getCodigoDirigente() {
        return codigoDirigente;
    }

    public void setCodigoDirigente(int codigoDirigente) {
        this.codigoDirigente = codigoDirigente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(Date fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
