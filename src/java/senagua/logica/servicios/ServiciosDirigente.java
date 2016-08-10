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
import senagua.logica.clases.Dirigente;
import static senagua.logica.servicios.ServiciosDirigente.llenarDatos;


/**
 *
 * @author Danys
 */
public class ServiciosDirigente {
   public static ArrayList<Dirigente> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Dirigente> lst = new ArrayList<Dirigente>();
        Dirigente d = null;
        try {
            while (rs.next()) {
                d = new Dirigente(
                        rs.getInt("pcodigo_dirigente"),
                        rs.getString("pcedula"),
                        rs.getString("pnombres"),
                        rs.getString("papellidos"),
                        rs.getDate("pfecha_de_nacimiento"),
                        rs.getString("pgenero"),
                        rs.getDate("pfecha_ingreso"),
                        rs.getString("pobservaciones")
                );
                lst.add(d);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    } 
   public static ArrayList<Dirigente> obtenerDirigente() throws Exception {
        ArrayList<Dirigente> lst = new ArrayList<Dirigente>();
        try {
            String sql = "select * from senagua.f_select_dirigente()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
   public static boolean eliminarDirigente(int codigo) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_delete_dirigente(?)";
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
   public static Dirigente obtenerDirigenteDadoCodigo(int codigo) throws Exception {
        Dirigente lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_select_dirigente_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Dirigente();
            lst = llenarDatos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
   public static boolean insertarDirigente(Dirigente p) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_insert_dirigente(?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, p.getCedula()));
            lstP.add(new Parametro(2, p.getNombres()));
            lstP.add(new Parametro(3, p.getApellidos()));
            lstP.add(new Parametro(4, p.getFecha_de_nacimiento()));
            lstP.add(new Parametro(5, p.getGenero()));
            lstP.add(new Parametro(6, p.getFecha_ingreso()));
            lstP.add(new Parametro(7, p.getObservaciones()));

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
   public static boolean actualizarDirigente(Dirigente p) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_update_dirigente(?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, p.getCedula()));
            lstP.add(new Parametro(2, p.getNombres()));
            lstP.add(new Parametro(3, p.getApellidos()));
            lstP.add(new Parametro(4, p.getFecha_de_nacimiento()));
            lstP.add(new Parametro(5, p.getGenero()));
            lstP.add(new Parametro(6, p.getFecha_ingreso()));
            lstP.add(new Parametro(7, p.getObservaciones()));
            lstP.add(new Parametro(8, p.getCodigoDirigente()));
            
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
    static Dirigente obtenerDirigente(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
