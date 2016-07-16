/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsn.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.SQLException;
import java.util.ArrayList;
import wsn.logica.clases.Nodo2;

/**
 *
 * @author gcudcop
 */
public class FNodo2 {

    public static ArrayList<Nodo2> llenarNodo2(ConjuntoResultado rs) throws Exception {
        ArrayList<Nodo2> lst = new ArrayList<Nodo2>();
        Nodo2 nodo2 = null;
        try {
            while (rs.next()) {
                nodo2 = new Nodo2(rs.getString("pid"),
                        rs.getString("phumedad3"), rs.getString("phumedad4"), rs.getTimestamp("pfecha")
                );
                lst.add(nodo2);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Nodo2> llenarNodo2Ultimo(ConjuntoResultado rs) throws Exception {
        ArrayList<Nodo2> lst = new ArrayList<Nodo2>();
        Nodo2 nodo2 = null;
        try {
            while (rs.next()) {
                nodo2 = new Nodo2(rs.getString("pid"),
                        rs.getString("phumedad3"), rs.getString("phumedad4"), rs.getTimestamp("pfecha"),
                        rs.getString("pestado"), rs.getString("pmodo")
                );
                lst.add(nodo2);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
     public static ArrayList<Nodo2> llenarNodo2Calendario(ConjuntoResultado rs) throws Exception {
        ArrayList<Nodo2> lst = new ArrayList<Nodo2>();
        Nodo2 nodo2 = null;
        try {
            while (rs.next()) {
                nodo2 = new Nodo2(rs.getString("pid"),
                        rs.getString("phumedad3"), rs.getString("phumedad4"), rs.getTimestamp("pfecha"),
                        rs.getString("pestado"), rs.getString("pmodo"), rs.getString("pfecha1")
                                                    );
                lst.add(nodo2);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Nodo2> obtenerTodos() throws Exception {
        ArrayList<Nodo2> lst = new ArrayList<Nodo2>();
        try {
            String sql = "select * from wsn.f_select_nodo2()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarNodo2(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Nodo2> obtenerNodo2Ultimo() throws Exception {
        ArrayList<Nodo2> lst = new ArrayList<Nodo2>();
        try {
            String sql = "select * from wsn.f_select_ultimo_nodo2()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarNodo2Ultimo(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList <Nodo2> obtenerNodo2DadoFecha(String fecha1) throws Exception {
        ArrayList<Nodo2> lst = new ArrayList<Nodo2>();
           //Nodo1 lst= new Nodo1();
        try {
            String sql = "select * from wsn.f_select_nodo2_dado_fecha_string(?)";
            ArrayList<Parametro> lstP = new ArrayList<Parametro>(); 
            lstP .add(new Parametro(1,fecha1));
            //lstP .add(new Parametro(2,fecha2));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql,lstP);
            lst = llenarNodo2Calendario(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean emisorUdp(String comando) {
        boolean eje = false;
        InetAddress address;
        byte[] mensaje_bytes = new byte[256];
        String mensaje;
        DatagramPacket paquete;
        String ip = "192.168.1.5";
        try {
            address = InetAddress.getByName(ip);
            DatagramSocket socket1;
            socket1 = new DatagramSocket();
            mensaje = comando;
            mensaje_bytes = mensaje.getBytes();

            paquete = new DatagramPacket(mensaje_bytes, mensaje.length(), address, 8888);
            socket1.send(paquete);
            System.out.println(ip + " UDP Enviado Exitosamente");
            eje = true;
        } catch (IOException ex) {
            System.out.println(ex);
        }

        return eje;
    }
}
