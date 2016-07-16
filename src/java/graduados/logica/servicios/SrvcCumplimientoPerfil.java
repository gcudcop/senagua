/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.logica.servicios;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import graduados.logica.entidades.CumplimientoPerfil;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Geovanny
 */
public class SrvcCumplimientoPerfil {

    public static ArrayList<CumplimientoPerfil> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        CumplimientoPerfil pl = null;
        try {
            while (rs.next()) {
                pl = new CumplimientoPerfil(rs.getInt("pcodigo"),
                        ServiciosGraduados.obtenerGraduadoDadoCodigo(rs.getInt("pcodigo_graduado")),
                        rs.getDate("pfecha"),
                        rs.getInt("ps3p1a_la"),
                        rs.getInt("ps3p1a_lb"),
                        rs.getInt("ps3p1b_la"),
                        rs.getInt("ps3p1b_lb"),
                        rs.getInt("ps3p1c_la"),
                        rs.getInt("ps3p1c_lb"),
                        rs.getInt("ps3p1d_la"),
                        rs.getInt("ps3p1d_lb"),
                        rs.getInt("ps3p1e_la"),
                        rs.getInt("ps3p1e_lb"),
                        rs.getInt("ps3p2a_la"),
                        rs.getInt("ps3p2a_lb"),
                        rs.getInt("ps3p2b_la"),
                        rs.getInt("ps3p2b_lb"),
                        rs.getInt("ps3p2c_la"),
                        rs.getInt("ps3p2c_lb"),
                        rs.getInt("ps3p2d_la"),
                        rs.getInt("ps3p2d_lb"),
                        rs.getInt("ps3p2e_la"),
                        rs.getInt("ps3p2e_lb"),
                        rs.getInt("ps3p3a_la"),
                        rs.getInt("ps3p3a_lb"),
                        rs.getInt("ps3p3b_la"),
                        rs.getInt("ps3p3b_lb"),
                        rs.getInt("ps3p3c_la"),
                        rs.getInt("ps3p3c_lb"),
                        rs.getInt("ps3p3d_la"),
                        rs.getInt("ps3p3d_lb"),
                        rs.getInt("ps3p4a_la"),
                        rs.getInt("ps3p4a_lb"),
                        rs.getInt("ps3p4b_la"),
                        rs.getInt("ps3p4b_lb"),
                        rs.getInt("ps3p4c_la"),
                        rs.getInt("ps3p4c_lb"),
                        rs.getInt("ps3p5a_la"),
                        rs.getInt("ps3p5a_lb"),
                        rs.getInt("ps3p5b_la"),
                        rs.getInt("ps3p5b_lb"),
                        rs.getInt("ps3p5c_la"),
                        rs.getInt("ps3p5c_lb"),
                        rs.getInt("ps3p5d_la"),
                        rs.getInt("ps3p5d_lb"),
                        rs.getInt("ps3p5e_la"),
                        rs.getInt("ps3p5e_lb"),
                        rs.getInt("ps3p5f_la"),
                        rs.getInt("ps3p5f_lb"),
                        rs.getInt("ps3p5g_la"),
                        rs.getInt("ps3p5g_lb"),
                        rs.getInt("ps3p5h_la"),
                        rs.getInt("ps3p5h_lb"),
                        rs.getInt("ps3p5i_la"),
                        rs.getInt("ps3p5i_lb"),
                        rs.getInt("ps3p5j_la"),
                        rs.getInt("ps3p5j_lb"),
                        rs.getInt("ps3p5k_la"),
                        rs.getInt("ps3p5k_lb"),
                        rs.getInt("ps3p5l_la"),
                        rs.getInt("ps3p5l_lb"),
                        rs.getInt("ps3p5m_la"),
                        rs.getInt("ps3p5m_lb"),
                        rs.getInt("ps3p5n_la"),
                        rs.getInt("ps3p5n_lb"),
                        rs.getInt("ps3p5o_la"),
                        rs.getInt("ps3p5o_lb"),
                        rs.getInt("ps3p6a_la"),
                        rs.getInt("ps3p6a_lb"),
                        rs.getInt("ps3p6b_la"),
                        rs.getInt("ps3p6b_lb"),
                        rs.getInt("ps3p6c_la"),
                        rs.getInt("ps3p6c_lb"),
                        rs.getInt("ps3p6d_la"),
                        rs.getInt("ps3p6d_lb"),
                        rs.getInt("ps3p6e_la"),
                        rs.getInt("ps3p6e_lb"),
                        rs.getInt("ps3p7a_la"),
                        rs.getInt("ps3p7a_lb"),
                        rs.getInt("ps3p7b_la"),
                        rs.getInt("ps3p7b_lb"),
                        rs.getInt("ps3p7c_la"),
                        rs.getInt("ps3p7c_lb"),
                        rs.getInt("ps3p8a_la"),
                        rs.getInt("ps3p8a_lb"),
                        rs.getInt("ps3p8b_la"),
                        rs.getInt("ps3p8b_lb"),
                        rs.getInt("ps3p8c_la"),
                        rs.getInt("ps3p8c_lb"),
                        rs.getInt("ps3p8d_la"),
                        rs.getInt("ps3p8d_lb"),
                        rs.getInt("ps3p8e_la"),
                        rs.getInt("ps3p8e_lb"),
                        rs.getInt("ps3p9a_la"),
                        rs.getInt("ps3p9a_lb"),
                        rs.getInt("ps3p9b_la"),
                        rs.getInt("ps3p9b_lb"),
                        rs.getInt("ps3p9c_la"),
                        rs.getInt("ps3p9c_lb"),
                        rs.getInt("ps3p9d_la"),
                        rs.getInt("ps3p9d_lb"),
                        rs.getInt("ps3p9e_la"),
                        rs.getInt("ps3p9e_lb"),
                        rs.getInt("ps3p10a_la"),
                        rs.getInt("ps3p10a_lb"),
                        rs.getInt("ps3p10b_la"),
                        rs.getInt("ps3p10b_lb"),
                        rs.getInt("ps3p10c_la"),
                        rs.getInt("ps3p10c_lb"),
                        rs.getInt("ps3p10d_la"),
                        rs.getInt("ps3p10d_lb"),
                        rs.getInt("ps3p10e_la"),
                        rs.getInt("ps3p10e_lb"),
                        rs.getInt("ps3p10f_la"),
                        rs.getInt("ps3p10f_lb"),
                        rs.getInt("ps3p10g_la"),
                        rs.getInt("ps3p10g_lb"),
                        rs.getInt("ps3p11a_la"),
                        rs.getInt("ps3p11a_lb"),
                        rs.getInt("ps3p11b_la"),
                        rs.getInt("ps3p11b_lb"),
                        rs.getInt("ps3p11c_la"),
                        rs.getInt("ps3p11c_lb"),
                        rs.getInt("ps3p11d_la"),
                        rs.getInt("ps3p11d_lb"),
                        rs.getInt("ps3p11e_la"),
                        rs.getInt("ps3p11e_lb"),
                        rs.getInt("ps3p11f_la"),
                        rs.getInt("ps3p11f_lb"),
                        rs.getInt("ps3p11g_la"),
                        rs.getInt("ps3p11g_lb"),
                        rs.getInt("ps3p12a_la"),
                        rs.getInt("ps3p12a_lb")
                );
                lst.add(pl);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTres() throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            String sql = "select * from graduados.f_select_cumplimiento_perfil()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresPreg1LadoA() throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            String sql = "select * from graduados.f_select_seccion3_p1a_la()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresDadoPreg1LadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p1a_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresPreg1LadoB() throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            String sql = "select * from graduados.f_select_seccion3_p1a_lb()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresDadoPreg1LadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p1a_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresPreg1bLadoA() throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            String sql = "select * from graduados.f_select_seccion3_p1b_la()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresPreg1cLadoA() throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            String sql = "select * from graduados.f_select_seccion3_p1c_la()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresPreg1dLadoA() throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            String sql = "select * from graduados.f_select_seccion3_p1d_la()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresPreg1eLadoA() throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            String sql = "select * from graduados.f_select_seccion3_p1e_la()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresPreg1bLadoB() throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            String sql = "select * from graduados.f_select_seccion3_p1b_lb()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresPreg1cLadoB() throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            String sql = "select * from graduados.f_select_seccion3_p1c_lb()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresPreg1dLadoB() throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            String sql = "select * from graduados.f_select_seccion3_p1d_lb()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresPreg1eLadoB() throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            String sql = "select * from graduados.f_select_seccion3_p1e_lb()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresDadoPreg1bLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p1b_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresDadoPreg1cLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p1c_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresDadoPreg1dLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p1d_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresDadoPreg1eLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p1e_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresDadoPreg1bLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p1b_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresDadoPreg1cLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p1c_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresDadoPreg1dLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p1d_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerSeccionTresDadoPreg1eLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p1e_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2ALadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2a_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2ALadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2a_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2BLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2b_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2BLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2b_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2CLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2c_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2CLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2c_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2DLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2d_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2DLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2d_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P3ALadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p3a_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P3ALadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p3a_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P3BLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p3b_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P3BLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p3b_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P3CLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p3c_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P3CLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p3c_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P3DLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p3d_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P3DLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p3d_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2ELadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2e_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2ELadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2e_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2FLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2f_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2FLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2f_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2GLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2g_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P2GLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p2g_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P4ALadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p4a_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P4ALadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p4a_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P4BLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p4b_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P4BLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p4b_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P4CLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p4c_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P4CLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p4c_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P6ALadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p6a_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P6ALadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p6a_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P6BLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p6b_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P6BLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p6b_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P6CLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p6c_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P6CLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p6c_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P6DLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p6d_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P6DLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p6d_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P6ELadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p6e_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P6ELadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p6e_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P7ALadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p7a_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P7ALadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p7a_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P7BLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p7b_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P7BLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p7b_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P7CLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p7c_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P7CLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p7c_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P8ALadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p8a_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P8ALadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p8a_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P8BLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p8b_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P8BLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p8b_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P8CLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p8c_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P8CLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p8c_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P8DLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p8d_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P8DLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p8d_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P8ELadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p8e_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P8ELadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p8e_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    /*
     ++ pregunta seccion 3 pregunta 9
     */
    public static ArrayList<CumplimientoPerfil> obtenerS3P9ALadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p9a_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P9ALadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p9a_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P9BLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p9b_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P9BLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p9b_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P9CLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p9c_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P9CLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p9c_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P9DLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p9d_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P9DLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p9d_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P9ELadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p9e_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P9ELadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p9e_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    /*
     *** seccion 3 pregunta 5
     */
    public static ArrayList<CumplimientoPerfil> obtenerS3P5ALadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5a_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5ALadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5a_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5BLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5b_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5BLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5b_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5CLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5c_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5CLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5c_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5DLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5d_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5DLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5d_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5ELadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5e_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5ELadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5e_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5FLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5f_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5FLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5f_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5GLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5g_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5GLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5g_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5HLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5h_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5HLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5h_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5ILadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5i_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5ILadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5i_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5JLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5j_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5JLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5j_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5KLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5k_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5KLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5k_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5LLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5l_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5LLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5l_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5MLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5m_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5MLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5m_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5NLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5n_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5NLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5n_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5OLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5o_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P5OLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p5o_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    /*
     *** seccion 3 pregunta 10
     */
    public static ArrayList<CumplimientoPerfil> obtenerS3P10ALadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10a_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P10ALadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10a_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P10BLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10b_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P10BLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10b_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P10CLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10c_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P10CLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10c_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P10DLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10d_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P10DLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10d_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P10ELadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10e_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P10ELadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10e_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P10FLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10f_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P10FLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10f_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P10GLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10g_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P10GLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p10g_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    /*
     *** seccion 3 pregunta 11
     */

    public static ArrayList<CumplimientoPerfil> obtenerS3P11ALadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11a_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P11ALadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11a_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P11BLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11b_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P11BLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11b_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P11CLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11c_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P11CLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11c_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P11DLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11d_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P11DLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11d_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P11ELadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11e_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P11ELadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11e_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P11FLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11f_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P11FLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11f_lb(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P11GLadoA(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11g_la(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<CumplimientoPerfil> obtenerS3P11GLadoB(int res) throws Exception {
        ArrayList<CumplimientoPerfil> lst = new ArrayList<CumplimientoPerfil>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion3_dado_p11g_lb(?)";
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
