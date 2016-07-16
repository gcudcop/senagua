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
public class Nodo2 {
    private String id;
    private String humedad3;
    private String humedad4;
    private Timestamp fecha;
    private String estado_valvula;
    private String modo;
    private String fecha1;

    public Nodo2() {
    }

    public Nodo2(String id, String humedad3, String humedad4, Timestamp fecha, String estado_valvula, String modo) {
        this.id = id;
        this.humedad3 = humedad3;
        this.humedad4 = humedad4;
        this.fecha = fecha;
        this.estado_valvula = estado_valvula;
        this.modo = modo;
    }

    public Nodo2(String id, String humedad3, String humedad4, Timestamp fecha) {
        this.id = id;
        this.humedad3 = humedad3;
        this.humedad4 = humedad4;
        this.fecha = fecha;
    }

    public Nodo2(String id, String humedad3, String humedad4, Timestamp fecha, String estado_valvula, String modo, String fecha1) {
        this.id = id;
        this.humedad3 = humedad3;
        this.humedad4 = humedad4;
        this.fecha = fecha;
        this.estado_valvula = estado_valvula;
        this.modo = modo;
        this.fecha1 = fecha1;
    }

    
    public String getId() {
        return id;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHumedad3() {
        return humedad3;
    }

    public void setHumedad3(String humedad3) {
        this.humedad3 = humedad3;
    }

    public String getHumedad4() {
        return humedad4;
    }

    public void setHumedad4(String humedad4) {
        this.humedad4 = humedad4;
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
    
    
}
