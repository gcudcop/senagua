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
public class Colegiatura {

    private int codigo;
    private Graduado codigoGraduado;
    private Date fecha;
    private Date inicioCarrera;
    private Date finCarrera;
    private Date inicioTesis;
    private Date finTesis;
    private String vinculoTesis;
    private String auspicioTesis;
    private int tiempoTesis;
    private int tiempoCarrera;

    public Colegiatura(int codigo, Graduado codigoGraduado, Date fecha, Date inicioCarrera, Date finCarrera, Date inicioTesis, Date finTesis, String vinculoTesis, String auspicioTesis, int tiempoTesis, int tiempoCarrera) {
        this.codigo = codigo;
        this.codigoGraduado = codigoGraduado;
        this.fecha = fecha;
        this.inicioCarrera = inicioCarrera;
        this.finCarrera = finCarrera;
        this.inicioTesis = inicioTesis;
        this.finTesis = finTesis;
        this.vinculoTesis = vinculoTesis;
        this.auspicioTesis = auspicioTesis;
        this.tiempoTesis = tiempoTesis;
        this.tiempoCarrera = tiempoCarrera;
    }

    public Colegiatura() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Graduado getCodigoGraduado() {
        return codigoGraduado;
    }

    public void setCodigoGraduado(Graduado codigoGraduado) {
        this.codigoGraduado = codigoGraduado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getInicioCarrera() {
        return inicioCarrera;
    }

    public void setInicioCarrera(Date inicioCarrera) {
        this.inicioCarrera = inicioCarrera;
    }

    public Date getFinCarrera() {
        return finCarrera;
    }

    public void setFinCarrera(Date finCarrera) {
        this.finCarrera = finCarrera;
    }

    public Date getInicioTesis() {
        return inicioTesis;
    }

    public void setInicioTesis(Date inicioTesis) {
        this.inicioTesis = inicioTesis;
    }

    public Date getFinTesis() {
        return finTesis;
    }

    public void setFinTesis(Date finTesis) {
        this.finTesis = finTesis;
    }

    public String getVinculoTesis() {
        return vinculoTesis;
    }

    public void setVinculoTesis(String vinculoTesis) {
        this.vinculoTesis = vinculoTesis;
    }

    public String getAuspicioTesis() {
        return auspicioTesis;
    }

    public void setAuspicioTesis(String auspicioTesis) {
        this.auspicioTesis = auspicioTesis;
    }

    public int getTiempoTesis() {
        return tiempoTesis;
    }

    public void setTiempoTesis(int tiempoTesis) {
        this.tiempoTesis = tiempoTesis;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

}
