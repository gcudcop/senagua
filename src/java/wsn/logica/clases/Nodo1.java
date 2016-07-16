/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsn.logica.clases;

import java.sql.*;

/**
 *
 * @author gcudcop
 */
public class Nodo1 {
    private String id;
    private String humedad1;
    private String humedad2;
    private Timestamp fecha;
    private String estado_valvula;
    private String modo;
    private String comando;
    private int estado;
    private String fecha1;

    public Nodo1(String id, String humedad1, String humedad2, Timestamp fecha, String estado_valvula, String modo) {
        this.id = id;
        this.humedad1 = humedad1;
        this.humedad2 = humedad2;
        this.fecha = fecha;
        this.estado_valvula = estado_valvula;
        this.modo = modo;
    }
    
    public Nodo1(String id, String humedad1, String humedad2, Timestamp fecha) {
        this.id = id;
        this.humedad1 = humedad1;
        this.humedad2 = humedad2;
        this.fecha = fecha;
       
    }

   public Nodo1(String id, String humedad1, String humedad2, Timestamp fecha, String estado_valvula, String modo, String fecha1) {
        this.id = id;
        this.humedad1 = humedad1;
        this.humedad2 = humedad2;
        this.fecha = fecha;
        this.estado_valvula = estado_valvula;
        this.modo = modo;
        this.fecha1 = fecha1;
    }

    
   

   /* public Nodo1(String estado, String modo) {
        this.estado = estado;
        this.modo = modo;
    }*/

    public Nodo1() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHumedad1() {
        return humedad1;
    }

    public void setHumedad1(String humedad1) {
        this.humedad1 = humedad1;
    }

    public String getHumedad2() {
        return humedad2;
    }

    public void setHumedad2(String humedad2) {
        this.humedad2 = humedad2;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getEstado_valvula() {
        return estado_valvula;
    }

    public void setEstado_valvula(String estado_valvula) {
        this.estado_valvula = estado_valvula;
    }
    
 

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }
    
}
