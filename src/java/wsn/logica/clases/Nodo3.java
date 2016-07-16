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
public class Nodo3 {
    private String id;
    private String temperatura;
    private String h_ambiente;
    private Timestamp fecha;
    private String fecha1;

    public Nodo3() {
    }

    public Nodo3(String id, String temperatura, String h_ambiente, Timestamp fecha) {
        this.id = id;
        this.temperatura = temperatura;
        this.h_ambiente = h_ambiente;
        this.fecha = fecha;
    }

    public Nodo3(String id, String temperatura, String h_ambiente, Timestamp fecha, String fecha1) {
        this.id = id;
        this.temperatura = temperatura;
        this.h_ambiente = h_ambiente;
        this.fecha = fecha;
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

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getH_ambiente() {
        return h_ambiente;
    }

    public void setH_ambiente(String h_ambiente) {
        this.h_ambiente = h_ambiente;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
    
}
