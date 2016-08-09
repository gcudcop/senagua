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

}
