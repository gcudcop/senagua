/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.logica.servicios;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import graduados.logica.entidades.Colegiatura;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Geovanny
 */
public class ServiciosColegiatura {

    public static ArrayList<Colegiatura> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Colegiatura> lst = new ArrayList<Colegiatura>();
        Colegiatura colegiatura = null;
        try {
            while (rs.next()) {
                colegiatura = new Colegiatura(
                        rs.getInt("pcodigo"),
                        ServiciosGraduados.obtenerGraduadoDadoCodigo(rs.getInt("pcodigo_graduado")),
                        rs.getDate("pfecha"),
                        rs.getDate("pinicio_carrera"),
                        rs.getDate("pfin_carrera"),
                        rs.getDate("pinicio_tesis"),
                        rs.getDate("pfin_tesis"),
                        rs.getString("pvincular_proyecto"),
                        rs.getString("pauspicio_tesis"),
                        rs.getInt("ptiempo_tesis"),
                        rs.getInt("ptiempo_carrera"));
                lst.add(colegiatura);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    public static ArrayList<Colegiatura> obtenerColegiatura() throws Exception {
        ArrayList<Colegiatura> lst = new ArrayList<Colegiatura>();
        try {
            String sql = "select * from graduados.f_select_colegiatura()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Colegiatura> obtenerColegiaturaAuspicioTesis() throws Exception {
        ArrayList<Colegiatura> lst = new ArrayList<Colegiatura>();
        try {
            String sql = "select * from graduados.f_select_colegiatura_auspicio_tesis()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Colegiatura> obtenerColegiaturaDadoAuspicioTesis(String res) throws Exception {
        ArrayList<Colegiatura> lst = new ArrayList<Colegiatura>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_colegiatura_dado_auspicio_tesis(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Colegiatura> obtenerColegiaturaVinculoTesis() throws Exception {
        ArrayList<Colegiatura> lst = new ArrayList<Colegiatura>();
        try {
            String sql = "select * from graduados.f_select_colegiatura_vinculo_tesis()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Colegiatura> obtenerColegiaturaDadoVinculoTesis(String res) throws Exception {
        ArrayList<Colegiatura> lst = new ArrayList<Colegiatura>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_colegiatura_dado_vinculo_tesis(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Colegiatura> obtenerColegiaturaTiempoCarrera() throws Exception {
        ArrayList<Colegiatura> lst = new ArrayList<Colegiatura>();
        try {                          
            String sql = "select * from graduados.f_select_colegiatura_tiempo_carrera()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Colegiatura> obtenerColegiaturaDadoTiempoCarrera(int res) throws Exception {
        ArrayList<Colegiatura> lst = new ArrayList<Colegiatura>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_colegiatura_dado_tiempo_carrera(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Colegiatura> obtenerColegiaturaTiempoTesis() throws Exception {
        ArrayList<Colegiatura> lst = new ArrayList<Colegiatura>();
        try {
            String sql = "select * from graduados.f_select_colegiatura_tiempo_tesis()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Colegiatura> obtenerColegiaturaDadoTiempoTesis(int res) throws Exception {
        ArrayList<Colegiatura> lst = new ArrayList<Colegiatura>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_colegiatura_dado_tiempo_tesis(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
     public static ArrayList<Colegiatura> obtenerColegiaturaDadoAnioIncorporacion(int res) throws Exception {
        ArrayList<Colegiatura> lst = new ArrayList<Colegiatura>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_colegiatura_dado_anio(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }


}
