/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.logica.servicios;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import graduados.logica.entidades.Graduado;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Geovanny
 */
public class ServiciosGraduados {

    public static ArrayList<Graduado> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Graduado> lst = new ArrayList<Graduado>();
        Graduado graduado = null;
        try {
            while (rs.next()) {
                graduado = new Graduado(rs.getInt("pcodigo"),
                        rs.getString("pnombres"),
                        rs.getString("papellidos"),
                        rs.getDate("pfecha_nacimiento"),
                        rs.getString("pcedula"),
                        rs.getString("pdireccion_domiciliaria"),
                        rs.getString("ptelefono"),
                        rs.getString("pcelular"),
                        rs.getString("pemail_principal"),
                        rs.getString("pemail_alterno"),
                        rs.getString("pdireccion_padres"),
                        rs.getString("ptelefono_padres"),
                        rs.getString("pgenero"),
                        rs.getString("pestado_civil"),
                        rs.getString("pcontrasenia")
                );
                lst.add(graduado);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Graduado> obtenerGraduados() throws Exception {
        ArrayList<Graduado> lst = new ArrayList<Graduado>();
        try {
            String sql = "select * from graduados.f_select_graduado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean insertarGraduado(Graduado graduado) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_insert_graduado(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, graduado.getNombres()));
            lstP.add(new Parametro(2, graduado.getApellidos()));
            lstP.add(new Parametro(3, graduado.getFechaNacimiento()));
            lstP.add(new Parametro(4, graduado.getCedula()));
            lstP.add(new Parametro(5, graduado.getDireccionDomiciliaria()));
            lstP.add(new Parametro(6, graduado.getTelefono()));
            lstP.add(new Parametro(7, graduado.getCelular()));
            lstP.add(new Parametro(8, graduado.getEmailPrincipal()));
            lstP.add(new Parametro(9, graduado.getEmailAlterno()));
            lstP.add(new Parametro(10, graduado.getDireccionPadres()));
            lstP.add(new Parametro(11, graduado.getTelefonoPadres()));
            lstP.add(new Parametro(12, graduado.getGenero()));
            lstP.add(new Parametro(13, graduado.getEstadoCivil()));
            lstP.add(new Parametro(14, graduado.getContrasenia()));

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

    public static boolean actualizarGraduado(Graduado graduado) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_update_graduado(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, graduado.getNombres()));
            lstP.add(new Parametro(2, graduado.getApellidos()));
            lstP.add(new Parametro(3, graduado.getFechaNacimiento()));
            lstP.add(new Parametro(4, graduado.getCedula()));
            lstP.add(new Parametro(5, graduado.getDireccionDomiciliaria()));
            lstP.add(new Parametro(6, graduado.getTelefono()));
            lstP.add(new Parametro(7, graduado.getCelular()));
            lstP.add(new Parametro(8, graduado.getEmailPrincipal()));
            lstP.add(new Parametro(9, graduado.getEmailAlterno()));
            lstP.add(new Parametro(10, graduado.getDireccionPadres()));
            lstP.add(new Parametro(11, graduado.getTelefonoPadres()));
            lstP.add(new Parametro(12, graduado.getGenero()));
            lstP.add(new Parametro(13, graduado.getEstadoCivil()));
            lstP.add(new Parametro(14, graduado.getContrasenia()));
            lstP.add(new Parametro(15, graduado.getCodigo()));
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

    public static boolean eliminarGraduado(int codigo) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_delete_graduado(?)";
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

    public static Graduado obtenerGraduadoDadoCodigo(int codigo) throws Exception {
        Graduado lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_graduado_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Graduado();
            lst = llenarDatos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Graduado iniciarSesion(String cedula, String contrasenia) throws Exception {
        Graduado lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_graduado_dado_cedula_contrasenia(?,?)";
            lstP.add(new Parametro(1, cedula));
            lstP.add(new Parametro(2, contrasenia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Graduado();
            lst = llenarDatos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Graduado> obtenerEstadoCivilGraduados() throws Exception {
        ArrayList<Graduado> lst = new ArrayList<Graduado>();
        try {
            String sql = "select * from graduados.f_select_estado_civil_graduado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Graduado> obtenerGrdauadosDadoEstadoCivil(String res) throws Exception {
        ArrayList<Graduado> lst = new ArrayList<Graduado>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_graduado_dado_estado_civil(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Graduado> obtenerGeneroGraduados() throws Exception {
        ArrayList<Graduado> lst = new ArrayList<Graduado>();
        try {
            String sql = "select * from graduados.f_select_genero_graduado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Graduado> obtenerGrdauadosDadoGenero(String res) throws Exception {
        ArrayList<Graduado> lst = new ArrayList<Graduado>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_graduado_dado_genero(?)";
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
