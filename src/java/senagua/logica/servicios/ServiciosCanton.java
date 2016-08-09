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
import senagua.logica.clases.Canton;
import static senagua.logica.servicios.ServiciosCanton.llenarDatos;

/**
 *
 * @author Geovanny
 */
public class ServiciosCanton {
    
     public static ArrayList<Canton> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Canton> lst = new ArrayList<Canton>();
        Canton c = null;
        try {
            while (rs.next()) {
                c = new Canton(
                        rs.getInt("pcodigo_canton"),
                        ServiciosProvincia.obtenerProvinciaDadoCodigo(rs.getInt("pcodigo_provincia")),
                        rs.getString("pnombre_canton"),
                        rs.getString("pobservaciones"),
                        rs.getDouble("ppoblacion")                        
                );
                lst.add(c);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
     
     
     public static ArrayList<Canton> obtenerCanton() throws Exception {
        ArrayList<Canton> lst = new ArrayList<Canton>();
        try {
            String sql = "select * from senagua.f_select_canton()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
     public static boolean eliminarCanton(int codigo) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_delete_canton(?)";
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
     
     
     public static Canton obtenerProvinciaDadoCodigo(int codigo) throws Exception {
        Canton lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_select_canton_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Canton();
            lst = llenarDatos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
     public static boolean insertarCanton(Canton p) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_insert_canton(?,?,?,?)";
            lstP.add(new Parametro(1, p.getCodigoProvincia().getCodigoProvincia()));
            lstP.add(new Parametro(2, p.getNombre()));
            lstP.add(new Parametro(3, p.getObservaciones()));
            lstP.add(new Parametro(4, p.getPoblacion()));

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
     
     public static boolean actualizarCanton(Canton p) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_update_canton(?,?,?,?,?)";
            lstP.add(new Parametro(1, p.getCodigoProvincia().getCodigoProvincia()));
            lstP.add(new Parametro(2, p.getNombre()));
            lstP.add(new Parametro(3, p.getObservaciones()));
            lstP.add(new Parametro(4, p.getPoblacion()));
            lstP.add(new Parametro(5, p.getCodigoCanton()));

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
