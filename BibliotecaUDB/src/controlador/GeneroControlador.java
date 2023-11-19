/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.annotation.XmlElement;
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

    //     contrucctor de la clase Genero
    public GeneroControlador(vistaGenero vGenero, GeneroModelo gModelo, vistaMenu vMenu) {
        this.vGenero = vGenero;
        this.gModelo = gModelo;
        this.vMenu = vMenu;
        this.vGenero.setControlador(this);
    }

    public void RegistrarModelo(GeneroModelo modelo) {
        if (modelo != null) {
            if (!modelo.getNombre().equals("")) {
                boolean isGuardar = modelo.IngresoGenero(modelo);
                if (isGuardar) {
                    vGenero.Mostrarmensaje("Genero Guardado correctamente");
                } else {
                    vGenero.Mostrarmensaje("no se puede registrar el Genero");
                }
            } else {
                vGenero.Mostrarmensaje("Ingrese el valor");
            }
        } else {
            vGenero.Mostrarmensaje("Ingrese los valores");
        }
    }

    public DefaultTableModel MostrarGeneros() {
        ArrayList<GeneroModelo> generoModelos = gModelo.tablaGenero();
        String[] titulos = {"Nombre"};
        DefaultTableModel tableModel = new DefaultTableModel(titulos, 0);

        for (GeneroModelo gModelo : generoModelos) {
            Object[] fila = {gModelo.getNombre()};
            tableModel.addRow(fila);
        }
        return tableModel;
    }

}
