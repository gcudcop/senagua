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
public class Postgrado {

    private int codigo;
    private Graduado codigo_graduado;
    private Date fecha;
    private String s5p1;
    private String s5p2;
    private String s5p3;
    private String s5p4;
    private String s5p5;

    public Postgrado() {
    }

    public Postgrado(int codigo, Graduado codigo_graduado, Date fecha, String s5p1, String s5p2, String s5p3, String s5p4, String s5p5) {
        this.codigo = codigo;
        this.codigo_graduado = codigo_graduado;
        this.fecha = fecha;
        this.s5p1 = s5p1;
        this.s5p2 = s5p2;
        this.s5p3 = s5p3;
        this.s5p4 = s5p4;
        this.s5p5 = s5p5;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Graduado getCodigo_graduado() {
        return codigo_graduado;
    }

    public void setCodigo_graduado(Graduado codigo_graduado) {
        this.codigo_graduado = codigo_graduado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getS5p1() {
        return s5p1;
    }

    public void setS5p1(String s5p1) {
        this.s5p1 = s5p1;
    }

    public String getS5p2() {
        return s5p2;
    }

    public void setS5p2(String s5p2) {
        this.s5p2 = s5p2;
    }

    public String getS5p3() {
        return s5p3;
    }

    public void setS5p3(String s5p3) {
        this.s5p3 = s5p3;
    }

    public String getS5p4() {
        return s5p4;
    }

    public void setS5p4(String s5p4) {
        this.s5p4 = s5p4;
    }

    public String getS5p5() {
        return s5p5;
    }

    public void setS5p5(String s5p5) {
        this.s5p5 = s5p5;
    }

}
