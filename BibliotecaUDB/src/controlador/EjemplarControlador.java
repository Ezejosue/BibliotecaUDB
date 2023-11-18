/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.EjemplarModelo;
import modelo.Libro;
import vista.panelLibro;
import vista.vistaRegistroMaterial;

/**
 *
 * @author Josue
 */
public class EjemplarControlador {

    EjemplarModelo modelo;
    panelLibro panelVista;
    vistaRegistroMaterial vista;

    public EjemplarControlador() {
    }

    public EjemplarControlador(EjemplarModelo modelo, vistaRegistroMaterial vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }

    public EjemplarControlador(EjemplarModelo modelo, panelLibro panelVista) {
        this.modelo = modelo;
        this.panelVista = panelVista;
        this.panelVista.setControlador(this);
    }

    public void crearEjemplar(Libro libro) {
        try {
            if (libro != null) {
                modelo.agregarLibro(libro);
                JOptionPane.showMessageDialog(null, "Libro creado con éxito.");
            } else {
                System.out.println("Es nulo");
            };
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear el libro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void actualizarEjemplar(Libro libro) {
        try {
            modelo.actualizarLibro(libro);
            JOptionPane.showMessageDialog(null, "Libro actualizado con éxito.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el libro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
