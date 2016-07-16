/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.logica.servicios;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import graduados.logica.entidades.GradoSatisfaccion;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Geovanny
 */
public class ServiciosGradoSatisfaccion {

    public static ArrayList<GradoSatisfaccion> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        GradoSatisfaccion pl = null;
        try {
            while (rs.next()) {
                pl = new GradoSatisfaccion(rs.getInt("pcodigo"),
                        ServiciosGraduados.obtenerGraduadoDadoCodigo(rs.getInt("pcodigo_graduado")),
                        rs.getDate("pfecha"),
                        rs.getInt("ps4p2_a"),
                        rs.getInt("ps4p2_b"),
                        rs.getInt("ps4p3_a"),
                        rs.getInt("ps4p3_b"),
                        rs.getInt("ps4p3_c"),
                        rs.getInt("ps4p3_d"),
                        rs.getInt("ps4p3_e"),
                        rs.getInt("ps4p3_f"),
                        rs.getInt("ps4p3_g"),
                        rs.getInt("ps4p4"),
                        rs.getInt("ps4p5"),
                        rs.getInt("ps4p6"),
                        rs.getInt("ps4p7"),
                        rs.getInt("ps4p8"),
                        rs.getInt("ps4p9"),
                        rs.getInt("ps4p10"),
                        rs.getInt("ps4p11")
                );
                lst.add(pl);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerSeccionCuatro() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_grado_satisfaccion()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p2A() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p2_a()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p2B() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p2_b()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3A() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p3_a()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3B() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p3_b()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3C() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p3_c()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3D() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p3_d()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3E() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p3_e()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3F() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p3_f()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3G() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p3_g()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p4() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p4()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p5() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p5()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p6() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p6()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p7() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p7()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p8() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p8()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p9() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p9()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p10() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p10()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p11() throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            String sql = "select * from graduados.f_select_s4_p11()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p2_a(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4_p2_a(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p2_b(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4_p2_b(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3_a(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4_p3_a(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3_b(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4_p3_b(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3_c(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4_p3_c(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3_d(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4_p3_d(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3_e(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4_p3_e(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3_f(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4_p3_f(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p3_g(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4_p3_g(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p4dadoRespuesta(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4p4(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p5dadoRespuesta(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4p5(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p6dadoRespuesta(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4p6(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p7dadoRespuesta(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4p7(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p8dadoRespuesta(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4p8(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p9dadoRespuesta(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4p9(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p10dadoRespuesta(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4p10(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<GradoSatisfaccion> obtenerS4p11dadoRespuesta(int res) throws Exception {
        ArrayList<GradoSatisfaccion> lst = new ArrayList<GradoSatisfaccion>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_s4p11(?)";
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
