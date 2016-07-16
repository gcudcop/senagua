/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.logica.servicios;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import graduados.logica.entidades.PerspectivaLaboral;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Geovanny
 */
public class SrvcPerspectivaLaboral {

    public static ArrayList<PerspectivaLaboral> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        PerspectivaLaboral pl = null;
        try {
            while (rs.next()) {
                pl = new PerspectivaLaboral(rs.getInt("pcodigo"),
                        ServiciosGraduados.obtenerGraduadoDadoCodigo(rs.getInt("pcodigo_graduado")),
                        rs.getDate("pfecha"),
                        rs.getString("ps2p1"),
                        rs.getString("ps2p2"),
                        rs.getString("ps2p3"),
                        rs.getString("ps2p4"),
                        rs.getString("ps2p5"),
                        rs.getString("ps2p6"),
                        rs.getString("ps2p7"),
                        rs.getString("ps2p8"),
                        rs.getInt("ps2p9"),
                        rs.getInt("ps2p10"),
                        rs.getString("ps2p11"),
                        rs.getString("ps2p12")
                );
                lst.add(pl);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    public static boolean insertarDatos(PerspectivaLaboral pl) throws Exception {
        boolean band = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_insert_seccion_dos(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, pl.getGraduado().getCodigo()));
            lstP.add(new Parametro(2, pl.getS2p1()));
            lstP.add(new Parametro(3, pl.getS2p2()));
            lstP.add(new Parametro(4, pl.getS2p3()));
            lstP.add(new Parametro(5, pl.getS2p4()));
            lstP.add(new Parametro(6, pl.getS2p5()));
            lstP.add(new Parametro(7, pl.getS2p6()));
            lstP.add(new Parametro(8, pl.getS2p7()));
            lstP.add(new Parametro(9, pl.getS2p8()));
            lstP.add(new Parametro(10, pl.getS2p9()));
            lstP.add(new Parametro(11, pl.getS2p10()));
            lstP.add(new Parametro(12, pl.getS2p11()));
            lstP.add(new Parametro(13, pl.getS2p12()));

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

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDos() throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            String sql = "select * from graduados.f_select_perspectiva_laboral()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerPregunta1() throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            String sql = "select * from graduados.f_select_pregunta1()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerPreguntaUno(String res) throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion2_p1(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosPregunta2() throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            String sql = "select * from graduados.f_select_seccion2_pregunta2()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosDadoPregunta2(String res) throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion2_dado_p2(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosPregunta3() throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            String sql = "select * from graduados.f_select_seccion2_pregunta3()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosPregunta4() throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            String sql = "select * from graduados.f_select_seccion2_pregunta4()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosPregunta5() throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            String sql = "select * from graduados.f_select_seccion2_pregunta5()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosPregunta6() throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            String sql = "select * from graduados.f_select_seccion2_pregunta6()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosPregunta7() throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            String sql = "select * from graduados.f_select_seccion2_pregunta7()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosPregunta8() throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            String sql = "select * from graduados.f_select_seccion2_pregunta8()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosPregunta9() throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            String sql = "select * from graduados.f_select_seccion2_pregunta9()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosPregunta10() throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            String sql = "select * from graduados.f_select_seccion2_pregunta10()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosPregunta11() throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            String sql = "select * from graduados.f_select_seccion2_pregunta11()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosPregunta12() throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            String sql = "select * from graduados.f_select_seccion2_pregunta12()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosDadoPregunta3(String res) throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion2_dado_p3(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosDadoPregunta4(String res) throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion2_dado_p4(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosDadoPregunta5(String res) throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion2_dado_p5(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosDadoPregunta6(String res) throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion2_dado_p6(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosDadoPregunta7(String res) throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion2_dado_p7(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosDadoPregunta8(String res) throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion2_dado_p8(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosDadoPregunta9(int res) throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion2_dado_p9(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosDadoPregunta10(int res) throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion2_dado_p10(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosDadoPregunta11(String res) throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion2_dado_p11(?)";
            lstP.add(new Parametro(1, res));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static ArrayList<PerspectivaLaboral> obtenerSeccionDosDadoPregunta12(String res) throws Exception {
        ArrayList<PerspectivaLaboral> lst = new ArrayList<PerspectivaLaboral>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from graduados.f_select_seccion2_dado_p12(?)";
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
