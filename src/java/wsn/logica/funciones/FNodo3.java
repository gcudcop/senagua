/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsn.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import wsn.logica.clases.Nodo3;

/**
 *
 * @author gcudcop
 */
public class FNodo3 {
    public static ArrayList<Nodo3> llenarNodo3(ConjuntoResultado rs) throws Exception {
        ArrayList<Nodo3> lst = new ArrayList<Nodo3>();
        Nodo3 nodo3 = null;
        try {
            while (rs.next()) {
                nodo3= new Nodo3(rs.getString("pid"),
                        rs.getString("ptemperatura"), rs.getString("ph_ambiente"), rs.getTimestamp("pfecha")
                            );
                lst.add(nodo3);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Nodo3> llenarNodo3Calendario(ConjuntoResultado rs) throws Exception {
        ArrayList<Nodo3> lst = new ArrayList<Nodo3>();
        Nodo3 nodo3 = null;
        try {
            while (rs.next()) {
                nodo3 = new Nodo3(rs.getString("pid"),
                        rs.getString("ptemperatura"), rs.getString("ph_ambiente"), rs.getTimestamp("pfecha"),
                         rs.getString("pfecha1")
                                                    );
                lst.add(nodo3);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    public static ArrayList<Nodo3> obtenerTodos() throws Exception {
        ArrayList<Nodo3> lst = new ArrayList<Nodo3>();
        try {
            String sql = "select * from wsn.f_select_nodo3()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarNodo3(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList <Nodo3> obtenerNodo3DadoFecha(String fecha1) throws Exception {
        ArrayList<Nodo3> lst = new ArrayList<Nodo3>();
           //Nodo1 lst= new Nodo1();
        try {
            String sql = "select * from wsn.f_select_nodo3_dado_fecha_string(?)";
            ArrayList<Parametro> lstP = new ArrayList<Parametro>(); 
            lstP .add(new Parametro(1,fecha1));
            //lstP .add(new Parametro(2,fecha2));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql,lstP);
            lst = llenarNodo3Calendario(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
}
