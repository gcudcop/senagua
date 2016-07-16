/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.logica.entidades;

import java.util.Date;

/**
 *
 * @author Geovanny
 */
public class Graduado {

    private int codigo;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String cedula;
    private String direccionDomiciliaria;
    private String telefono;
    private String celular;
    private String emailPrincipal;
    private String emailAlterno;
    private String direccionPadres;
    private String telefonoPadres;
    private String genero;
    private String estadoCivil;
    private String contrasenia;

    public Graduado() {
    }

    public Graduado(int codigo, String nombres, String apellidos, Date fechaNacimiento, String cedula, String direccionDomiciliaria, String telefono, String celular, String emailPrincipal, String emailAlterno, String direccionPadres, String telefonoPadres, String genero, String estadoCivil, String contrasenia) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.direccionDomiciliaria = direccionDomiciliaria;
        this.telefono = telefono;
        this.celular = celular;
        this.emailPrincipal = emailPrincipal;
        this.emailAlterno = emailAlterno;
        this.direccionPadres = direccionPadres;
        this.telefonoPadres = telefonoPadres;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.contrasenia = contrasenia;
    }

    /*
     *** Getters y Setters
     */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccionDomiciliaria() {
        return direccionDomiciliaria;
    }

    public void setDireccionDomiciliaria(String direccionDomiciliaria) {
        this.direccionDomiciliaria = direccionDomiciliaria;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmailPrincipal() {
        return emailPrincipal;
    }

    public void setEmailPrincipal(String emailPrincipal) {
        this.emailPrincipal = emailPrincipal;
    }

    public String getEmailAlterno() {
        return emailAlterno;
    }

    public void setEmailAlterno(String emailAlterno) {
        this.emailAlterno = emailAlterno;
    }

    public String getDireccionPadres() {
        return direccionPadres;
    }

    public void setDireccionPadres(String direccionPadres) {
        this.direccionPadres = direccionPadres;
    }

    public String getTelefonoPadres() {
        return telefonoPadres;
    }

    public void setTelefonoPadres(String telefonoPadres) {
        this.telefonoPadres = telefonoPadres;
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}
