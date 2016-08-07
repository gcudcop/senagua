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
public class JAguaPotable {

    private int codigo;
    private String nombreJunta;
    private String estado;
    private Parroquia codigoParroquia;
    private String director;
    private Dirigente codigoDirigente;
    private String correoElectronico;
    private String telefono1;
    private String telefono2;
    private String numeroAutorizacion;
    private String numeroResolucion;
    private Date fecha_registro;
    private String ruc;
    private double caudalAforado;
    private double caudalAutorizado;
    private double numeroConsumidores;
    private double ejeX;
    private double ejeY;
    private double ejeZ;
    private String observaciones1;
    private String observaciones2;

    public JAguaPotable() {
    }

    public JAguaPotable(int codigo, String nombreJunta, String estado, Parroquia codigoParroquia, String director, Dirigente codigoDirigente, String correoElectronico, String telefono1, String telefono2, String numeroAutorizacion, String numeroResolucion, Date fecha_registro, String ruc, double caudalAforado, double caudalAutorizado, double numeroConsumidores, double ejeX, double ejeY, double ejeZ, String observaciones1, String observaciones2) {
        this.codigo = codigo;
        this.nombreJunta = nombreJunta;
        this.estado = estado;
        this.codigoParroquia = codigoParroquia;
        this.director = director;
        this.codigoDirigente = codigoDirigente;
        this.correoElectronico = correoElectronico;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.numeroAutorizacion = numeroAutorizacion;
        this.numeroResolucion = numeroResolucion;
        this.fecha_registro = fecha_registro;
        this.ruc = ruc;
        this.caudalAforado = caudalAforado;
        this.caudalAutorizado = caudalAutorizado;
        this.numeroConsumidores = numeroConsumidores;
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.ejeZ = ejeZ;
        this.observaciones1 = observaciones1;
        this.observaciones2 = observaciones2;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreJunta() {
        return nombreJunta;
    }

    public void setNombreJunta(String nombreJunta) {
        this.nombreJunta = nombreJunta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Parroquia getCodigoParroquia() {
        return codigoParroquia;
    }

    public void setCodigoParroquia(Parroquia codigoParroquia) {
        this.codigoParroquia = codigoParroquia;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Dirigente getCodigoDirigente() {
        return codigoDirigente;
    }

    public void setCodigoDirigente(Dirigente codigoDirigente) {
        this.codigoDirigente = codigoDirigente;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    public void setNumeroAutorizacion(String numeroAutorizacion) {
        this.numeroAutorizacion = numeroAutorizacion;
    }

    public String getNumeroResolucion() {
        return numeroResolucion;
    }

    public void setNumeroResolucion(String numeroResolucion) {
        this.numeroResolucion = numeroResolucion;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public double getCaudalAforado() {
        return caudalAforado;
    }

    public void setCaudalAforado(double caudalAforado) {
        this.caudalAforado = caudalAforado;
    }

    public double getCaudalAutorizado() {
        return caudalAutorizado;
    }

    public void setCaudalAutorizado(double caudalAutorizado) {
        this.caudalAutorizado = caudalAutorizado;
    }

    public double getNumeroConsumidores() {
        return numeroConsumidores;
    }

    public void setNumeroConsumidores(double numeroConsumidores) {
        this.numeroConsumidores = numeroConsumidores;
    }

    public double getEjeX() {
        return ejeX;
    }

    public void setEjeX(double ejeX) {
        this.ejeX = ejeX;
    }

    public double getEjeY() {
        return ejeY;
    }

    public void setEjeY(double ejeY) {
        this.ejeY = ejeY;
    }

    public double getEjeZ() {
        return ejeZ;
    }

    public void setEjeZ(double ejeZ) {
        this.ejeZ = ejeZ;
    }

    public String getObservaciones1() {
        return observaciones1;
    }

    public void setObservaciones1(String observaciones1) {
        this.observaciones1 = observaciones1;
    }

    public String getObservaciones2() {
        return observaciones2;
    }

    public void setObservaciones2(String observaciones2) {
        this.observaciones2 = observaciones2;
    }

}
