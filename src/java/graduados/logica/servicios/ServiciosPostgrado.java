/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.logica.servicios;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import graduados.logica.entidades.Postgrado;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Geovanny
 */
public class ServiciosPostgrado {

    public static ArrayList<Postgrado> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Postgrado> lst = new ArrayList<Postgrado>();
        Postgrado postgrado = null;
        try {
            while (rs.next()) {
                postgrado = new Postgrado(
                        rs.getInt("pcodigo"),
                        ServiciosGraduados.obtenerGraduadoDadoCodigo(rs.getInt("pcodigo_graduado")),
                        rs.getDate("pfecha"),
                        rs.getString("ps5p1"),
                        rs.getString("ps5p2"),
                        rs.getString("ps5p3"),
                        rs.getString("ps5p4"),
                        rs.getString("ps5p5")
                );
                lst.add(postgrado);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Postgrado> obtenerS5p1() throws Exception {
        ArrayList<Postgrado> lst = new ArrayList<Postgrado>();
        try {
            String sql = "select * from graduados.f_select_s5p1()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Postgrado> obtenerS5p2() throws Exception {
        ArrayList<Postgrado> lst = new ArrayList<Postgrado>();
        try {
            String sql = "select * from graduados.f_select_s5p2()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Postgrado> obtenerS5p3() throws Exception {
        ArrayList<Postgrado> lst = new ArrayList<Postgrado>();
        try {
            String sql = "select * from graduados.f_select_s5p3()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Postgrado> obtenerS5p4() throws Exception {
        ArrayList<Postgrado> lst = new ArrayList<Postgrado>();
        try {
            String sql = "select * from graduados.f_select_s5p4()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Postgrado> obtenerS5p5() throws Exception {
        ArrayList<Postgrado> lst = new ArrayList<Postgrado>();
        try {
            String sql = "select * from graduados.f_select_s5p5()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Postgrado> obtenerS5p1DadoResp(String res) throws Exception {
        ArrayList<Postgrado> lst = new ArrayList<Postgrado>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s5p1_dado_respuesta(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<Postgrado> obtenerS5p2DadoResp(String res) throws Exception {
        ArrayList<Postgrado> lst = new ArrayList<Postgrado>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s5p2_dado_respuesta(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<Postgrado> obtenerS5p3DadoResp(String res) throws Exception {
        ArrayList<Postgrado> lst = new ArrayList<Postgrado>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s5p3_dado_respuesta(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<Postgrado> obtenerS5p4DadoResp(String res) throws Exception {
        ArrayList<Postgrado> lst = new ArrayList<Postgrado>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s5p4_dado_respuesta(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<Postgrado> obtenerS5p5DadoResp(String res) throws Exception {
        ArrayList<Postgrado> lst = new ArrayList<Postgrado>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s5p5_dado_respuesta(?)";
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
