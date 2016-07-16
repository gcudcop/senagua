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
public class RespuestasSeccionCuatro {
    
    public static ArrayList<LadoA> obtenerRespuestas() {
        ArrayList<LadoA> lst = new ArrayList<LadoA>();
        try {
            lst.add(new LadoA(1, "Insatisfecho"));
            lst.add(new LadoA(2, "Algo satisfecho"));
            lst.add(new LadoA(3, "Satisfecho"));
            lst.add(new LadoA(4, "Muy Satisfecho"));
            lst.add(new LadoA(5, "Extr. Satisfecho"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
}
