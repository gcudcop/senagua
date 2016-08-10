package senagua.logica.servicios;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import senagua.logica.clases.Provincia;

public class ServiciosProvincia {

    public static ArrayList<Provincia> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Provincia> lst = new ArrayList<Provincia>();
        Provincia p = null;
        try {
            while (rs.next()) {
                p = new Provincia(
                        rs.getInt("pcodigo_provincia"),
                        rs.getString("pnombre_provincia"),
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

    public static ArrayList<Provincia> obtenerProvincias() throws Exception {
        ArrayList<Provincia> lst = new ArrayList<Provincia>();
        try {
            String sql = "select * from senagua.f_select_provincias()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean eliminarProvincia(int codigo) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_delete_provincia(?)";
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

    public static Provincia obtenerProvinciaDadoCodigo(int codigo) throws Exception {
        Provincia lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_select_provincia_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Provincia();
            lst = llenarDatos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean insertarProvincia(Provincia p) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_insert_provincia(?,?,?)";
            lstP.add(new Parametro(1, p.getNombreProvincia()));
            lstP.add(new Parametro(2, p.getPoblacion()));
            lstP.add(new Parametro(3, p.getObservaciones()));

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

    public static boolean actualizarProvincia(Provincia p) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_update_provincia(?,?,?,?)";
            lstP.add(new Parametro(1, p.getNombreProvincia()));
            lstP.add(new Parametro(2, p.getPoblacion()));
            lstP.add(new Parametro(3, p.getObservaciones()));
            lstP.add(new Parametro(4, p.getCodigoProvincia()));

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

    static Provincia obtenerProvincias(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
