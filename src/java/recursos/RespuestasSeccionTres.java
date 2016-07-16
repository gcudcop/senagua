/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.util.ArrayList;

/**
 *
 * @author Geovanny
 */
public class RespuestasSeccionTres {

    public static ArrayList<LadoA> obtenerLadoA() {
        ArrayList<LadoA> lst = new ArrayList<LadoA>();
        try {
            lst.add(new LadoA(1, "Sin importancia"));
            lst.add(new LadoA(2, "Algo importante"));
            lst.add(new LadoA(3, "Importante"));
            lst.add(new LadoA(4, "Muy importante"));
            lst.add(new LadoA(5, "Extr. importante"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<LadoB> obtenerLadoB() {
        ArrayList<LadoB> lst = new ArrayList<LadoB>();
        try {
            lst.add(new LadoB(1, "Impreparado"));
            lst.add(new LadoB(2, "Algo preparado"));
            lst.add(new LadoB(3, "Preparado"));
            lst.add(new LadoB(4, "Bien preparado"));
            lst.add(new LadoB(5, "Muy preparado"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

}
