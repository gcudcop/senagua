/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

/**
 *
 * @author Geovanny
 */
public class LadoB {

    private int calificacion;
    private String valoracion;

    public LadoB() {
    }

    public LadoB(int calificacion, String valoracion) {
        this.calificacion = calificacion;
        this.valoracion = valoracion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

}
