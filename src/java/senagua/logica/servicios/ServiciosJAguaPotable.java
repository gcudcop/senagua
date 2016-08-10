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
import senagua.logica.clases.JAguaPotable;

/**
 *
 * @author Geovanny
 */
public class ServiciosJAguaPotable {

    public static ArrayList<JAguaPotable> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<JAguaPotable> lst = new ArrayList<JAguaPotable>();
        JAguaPotable ja = null;
        try {
            while (rs.next()) {
                ja = new JAguaPotable(
                        rs.getInt("pcod_junta"),
                        rs.getString("pnombre_junta"),
                        rs.getString("pestado"),
                        ServiciosParroquia.obtenerParroquiaDadoCodigo(rs.getInt("pcodigo_parroquia")),
                        rs.getString("pdirector"),
                        ServiciosDirigente.obtenerDirigenteDadoCodigo(rs.getInt("pcodigo_dirigente")),
                        rs.getString("pcorreo_electronico"),
                        rs.getString("ptelefono1"),
                        rs.getString("ptelefono2"),
                        rs.getString("pn_autorizacion"),
                        rs.getString("pn_resolucion"),
                        rs.getDate("pfecha_registro"),
                        rs.getString("pruc"),
                        rs.getDouble("pcaudal_aforado"),
                        rs.getDouble("pcaudal_autorizado"),
                        rs.getDouble("pn_consumidores"),
                        rs.getDouble("pejex"),
                        rs.getDouble("pejey"),
                        rs.getDouble("pejez"),
                        rs.getString("pobservaciones1"),
                        rs.getString("pobservaciones2")
                );
                lst.add(ja);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<JAguaPotable> obtenerJuntas() throws Exception {
        ArrayList<JAguaPotable> lst = new ArrayList<JAguaPotable>();
        try {
            String sql = "select * from senagua.f_select_junta_agua_potable2()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean insertarJunta(JAguaPotable p) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_insert_junta_agua_potable(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";           
            lstP.add(new Parametro(1, p.getNombreJunta()));
            lstP.add(new Parametro(2, p.getEstado()));
            lstP.add(new Parametro(3, p.getCodigoParroquia().getCodigoParoquia()));
            lstP.add(new Parametro(4, p.getDirector()));
            lstP.add(new Parametro(5,p.getCodigoDirigente().getCodigoDirigente()));
            lstP.add(new Parametro(6,p.getCorreoElectronico()));
            lstP.add(new Parametro(7,p.getTelefono1()));
            lstP.add(new Parametro(8,p.getTelefono2()));
            lstP.add(new Parametro(9,p.getNumeroAutorizacion()));
            lstP.add(new Parametro(10,p.getNumeroResolucion()));
            lstP.add(new Parametro(11,p.getFecha_registro()));
            lstP.add(new Parametro(12,p.getRuc()));
            lstP.add(new Parametro(13,p.getCaudalAforado()));
            lstP.add(new Parametro(14,p.getCaudalAutorizado()));
            lstP.add(new Parametro(15,p.getNumeroConsumidores()));
            lstP.add(new Parametro(16,p.getEjeX()));
            lstP.add(new Parametro(17,p.getEjeY()));
            lstP.add(new Parametro(18,p.getEjeZ()));
            lstP.add(new Parametro(19,p.getObservaciones1()));
            lstP.add(new Parametro(20,p.getObservaciones2()));
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
    
    public static boolean actualizarJunta(JAguaPotable p) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_update_junta_agua_potable(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";           
            lstP.add(new Parametro(1, p.getNombreJunta()));
            lstP.add(new Parametro(2, p.getEstado()));
            lstP.add(new Parametro(3, p.getCodigoParroquia().getCodigoParoquia()));
            lstP.add(new Parametro(4, p.getDirector()));
            lstP.add(new Parametro(5,p.getCodigoDirigente().getCodigoDirigente()));
            lstP.add(new Parametro(6,p.getCorreoElectronico()));
            lstP.add(new Parametro(7,p.getTelefono1()));
            lstP.add(new Parametro(8,p.getTelefono2()));
            lstP.add(new Parametro(9,p.getNumeroAutorizacion()));
            lstP.add(new Parametro(10,p.getNumeroResolucion()));
            lstP.add(new Parametro(11,p.getFecha_registro()));
            lstP.add(new Parametro(12,p.getRuc()));
            lstP.add(new Parametro(13,p.getCaudalAforado()));
            lstP.add(new Parametro(14,p.getCaudalAutorizado()));
            lstP.add(new Parametro(15,p.getNumeroConsumidores()));
            lstP.add(new Parametro(16,p.getEjeX()));
            lstP.add(new Parametro(17,p.getEjeY()));
            lstP.add(new Parametro(18,p.getEjeZ()));
            lstP.add(new Parametro(19,p.getObservaciones1()));
            lstP.add(new Parametro(20,p.getObservaciones2()));
            lstP.add(new Parametro(21,p.getCodigo()));
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

    public static boolean eliminarJunta(int codigo) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_delete_junta_agua_potable(?)";
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

    
    public static ArrayList<JAguaPotable> obtenerJuntasDadoCodigoProvincia(int codigo) throws Exception {
        ArrayList<JAguaPotable> lst = new ArrayList<JAguaPotable>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_select_junta_dado_provinciainnerjoin(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
     public static ArrayList<JAguaPotable> obtenerJuntasDadoCodigoCanton(int codigo) throws Exception {
        ArrayList<JAguaPotable> lst = new ArrayList<JAguaPotable>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from senagua.f_select_junta_dado_parroquia(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
    
}
