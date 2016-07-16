/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduados.servicios.webservice;

import graduados.logica.entidades.Graduado;
import graduados.logica.entidades.PerspectivaLaboral;
import graduados.logica.servicios.ServiciosGraduados;
import graduados.logica.servicios.SrvcPerspectivaLaboral;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Geovanny
 */
@WebService(serviceName = "GraduadosWebService")
public class GraduadosWebService {

    @WebMethod
    public Graduado updateGraduado(Graduado graduado) throws Exception {
        try {
            ServiciosGraduados.actualizarGraduado(graduado);
        } catch (Exception e) {
            System.out.println("insertarGraduado() dice: " + e.getMessage());
        }
        return graduado;
    }

    @WebMethod
    public Graduado iniciarSesion(String cedula, String contrasenia) throws Exception {
        Graduado graduado = new Graduado();
        try {
            graduado = ServiciosGraduados.iniciarSesion(cedula, contrasenia);
        } catch (Exception e) {
            System.out.println("insertarGraduado() dice: " + e.getMessage());
        }
        return graduado;
    }

    @WebMethod
    public PerspectivaLaboral insertarSeccionDos(PerspectivaLaboral pl) throws Exception {
        try {
            SrvcPerspectivaLaboral.insertarDatos(pl);
        } catch (Exception e) {
            System.out.println("insertarGraduado() dice: " + e.getMessage());
        }
        return pl;
    }
}
