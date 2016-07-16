/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.presentacion.ctrl;

import graduados.logica.entidades.Graduado;
import graduados.logica.servicios.ServiciosGraduados;
import java.util.ArrayList;

/**
 *
 * @author Geovanny
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ArrayList<Graduado> lst=ServiciosGraduados.obtenerEstadoCivilGraduados();
           for(int i=0;i<lst.size();i++){
               System.out.println(ServiciosGraduados.obtenerEstadoCivilGraduados().get(i).getEstadoCivil()+
                        ServiciosGraduados.obtenerGrdauadosDadoEstadoCivil(ServiciosGraduados.obtenerEstadoCivilGraduados().get(i).getEstadoCivil()).size());

           }
            System.out.println("test: "+lst.size());
        } catch (Exception e) {
        }
       
    }
    
}
