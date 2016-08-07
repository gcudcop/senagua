/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senagua.presentacion.controladores;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import senagua.logica.clases.Dirigente;

/**
 *
 * @author Danys
 */
@ManagedBean
@ViewScoped
public class ControladorDirigente {
    private ArrayList<Dirigente> listDirigente;
}
