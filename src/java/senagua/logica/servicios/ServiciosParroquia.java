/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senagua.logica.servicios;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import senagua.logica.clases.Parroquia;

/**
 *
 * @author Enrique
 */
public class ServiciosParroquia {

    public static ArrayList<Parroquia> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Parroquia> lst = new ArrayList<Parroquia>();
        Parroquia p = null;
        try {
            while (rs.next()) {
                p = new Parroquia(
                        rs.getInt("pcodigo_parroquia"),
                        ServiciosCanton.obtenerProvinciaDadoCodigo(rs.getInt("codigo_canton")),
                        rs.getString("pnombre"),
                        rs.getDouble("ppoblacion"),
                        rs.getString("pobservaciones")
                );
                lst.add(p);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Parroquia> obtenerParroquia() throws Exception {
        ArrayList<Parroquia> lst = new ArrayList<Parroquia>();
        try {
            String sql = "select * from senagua.f_select_parroquia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean eliminarParroquia(int codigo) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_delete_parroquia(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                band = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return band;
    }

    public static Parroquia obtenerParroquiaDadoCodigo(int codigo) throws Exception {
        Parroquia lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_select_parroquia_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Parroquia();
            lst = llenarDatos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean insertarParroquia(Parroquia p) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_insert_parroquia(?,?,?,?)";

            lstP.add(new Parametro(1, p.getCodigoCanton().getCodigoCanton()));
            lstP.add(new Parametro(2, p.getNombre()));
            lstP.add(new Parametro(3, p.getPoblacion()));
            lstP.add(new Parametro(4, p.getObservaciones()));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                band = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return band;
    }

     public static boolean actualizarParroquia(Parroquia p) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_insert_parroquia(?,?,?,?,?)";
            lstP.add(new Parametro(1, p.getCodigoCanton().getCodigoCanton()));
            lstP.add(new Parametro(2, p.getNombre()));
            lstP.add(new Parametro(3, p.getPoblacion()));
            lstP.add(new Parametro(4, p.getObservaciones()));
            lstP.add(new Parametro(5, p.getCodigoParoquia()));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                band = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return band;
    }
    
}
