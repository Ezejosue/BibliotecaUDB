/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.GeneroModelo;
import vista.vistaGenero;
import vista.vistaMenu;

/**
 *
 * @author kevin
 */
public class GeneroControlador {

    private final vistaGenero vGenero;
    private final GeneroModelo gModelo;
    private final vistaMenu vMenu;

    public GeneroControlador(vistaGenero vGenero, GeneroModelo gModelo, vistaMenu vMenu) {
        this.vGenero = vGenero;
        this.gModelo = gModelo;
        this.vMenu = vMenu;
        this.vGenero.setControlador(this);
    }

    public void RegistrarModelo(GeneroModelo modelo) {
        if (modelo != null) {
            if (!modelo.getGenero().equals("")) {
                boolean Guardar = modelo.IngresoGenero(modelo);
                if (Guardar) {
                    vGenero.Mostrarmensaje("Genero Guardado correctamente");
                } else {
                    vGenero.Mostrarmensaje("no se puede registrar el Genero");
                }
            } else {
                vGenero.Mostrarmensaje("Ingrese el valor");
            }
        }else{
            
        }
    }
}

    
