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
import java.sql.Timestamp;
import java.util.ArrayList;
import wsn.logica.clases.Nodo1;

/**
 *
 * @author gcudcop
 */
public class FNodo1 {

    public static ArrayList<Nodo1> llenarNodo1(ConjuntoResultado rs) throws Exception {
        ArrayList<Nodo1> lst = new ArrayList<Nodo1>();
        Nodo1 nodo1 = null;
        try {
            while (rs.next()) {
                nodo1 = new Nodo1(rs.getString("pid"),
                        rs.getString("phumedad1"), rs.getString("phumedad2"), rs.getTimestamp("pfecha")
                );
                lst.add(nodo1);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Nodo1> llenarNodo1Ultimo(ConjuntoResultado rs) throws Exception {
        ArrayList<Nodo1> lst = new ArrayList<Nodo1>();
        Nodo1 nodo1 = null;
        try {
            while (rs.next()) {
                nodo1 = new Nodo1(rs.getString("pid"),
                        rs.getString("phumedad1"), rs.getString("phumedad2"), rs.getTimestamp("pfecha"),
                        rs.getString("pestado"), rs.getString("pmodo")
                );
                lst.add(nodo1);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Nodo1> llenarNodo1Calendario(ConjuntoResultado rs) throws Exception {
        ArrayList<Nodo1> lst = new ArrayList<Nodo1>();
        Nodo1 nodo1 = null;
        try {
            while (rs.next()) {
                nodo1 = new Nodo1(rs.getString("pid"),
                        rs.getString("phumedad1"), rs.getString("phumedad2"), rs.getTimestamp("pfecha"),
                        rs.getString("pestado"), rs.getString("pmodo"), rs.getString("pfecha1")
                );
                lst.add(nodo1);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Nodo1> obtenerTodos() throws Exception {
        ArrayList<Nodo1> lst = new ArrayList<Nodo1>();
        try {
            String sql = "select * from wsn.f_select_nodo1()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarNodo1(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    /*public static ArrayList<Nodo1> obtenerTodosActual() throws Exception {
     ArrayList<Nodo1> lst = new ArrayList<Nodo1>();
     try {
     String sql = "select * from wsn.f_select_nodo1_actual()";
     ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
     lst = llenarNodo1Actual(rs);
     rs = null;
     } catch (SQLException exConec) {
     throw new Exception(exConec.getMessage());
     }
     return lst;
     }*/

    public static ArrayList<Nodo1> obtenerNodo1Ultimo() throws Exception {
        ArrayList<Nodo1> lst = new ArrayList<Nodo1>();
        try {
            String sql = "select * from wsn.f_select_ultimo_nodo1()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarNodo1Ultimo(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Nodo1 obtenerNodo1DadoFecha1(String codigo) throws Exception {
        //ArrayList<Nodo1> lst = new ArrayList<Nodo1>();
        Nodo1 lst;
        try {
            String sql = "select * from wsn.f_select_nodo1_dado_fecha_string(?)";
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarNodo1Calendario(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Nodo1> obtenerNodo1DadoFecha(String fecha1) throws Exception {
        ArrayList<Nodo1> lst = new ArrayList<Nodo1>();
        //Nodo1 lst= new Nodo1();
        try {
            String sql = "select * from wsn.f_select_nodo1_dado_fecha_string(?)";
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            lstP.add(new Parametro(1, fecha1));
            //lstP .add(new Parametro(2,fecha2));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarNodo1Calendario(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Nodo1> obtenerNodo1DadoFecha2(String fecha2) throws Exception {
        ArrayList<Nodo1> lst = new ArrayList<Nodo1>();
        //Nodo1 lst= new Nodo1();
        try {
            String sql = "select * from wsn.f_select_nodo1_dado_fecha_string(?)";
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            lstP.add(new Parametro(1, fecha2));
            //lstP .add(new Parametro(2,fecha2));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarNodo1Calendario(rs);
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
