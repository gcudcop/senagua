/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senagua.logica.servicios;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import java.sql.SQLException;
import java.util.ArrayList;
import senagua.logica.clases.JAguaPotable;
import senagua.logica.clases.Parroquia;

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
                        
                                               
                );
                lst.add(ja);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
     
     public static ArrayList<JAguaPotable> obtenerProvincias() throws Exception {
        ArrayList<JAguaPotable> lst = new ArrayList<JAguaPotable>();
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
    
}
