/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Prestamo;
import modelo.PrestamoModelo;
import util.conexionDB;
import vista.vistaPrestamo;

/**
 *
 * @author PC
 */
public class PrestamoControlador {

    private PrestamoModelo modelo;
    private vistaPrestamo vista;

    public PrestamoControlador() {
    }

    public PrestamoControlador(PrestamoModelo modelo, vistaPrestamo vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }

    public static void procesarPrestamo(Prestamo prestamo) {
        try {
            // Crear una instancia del DAO para manejar las operaciones de la base de datos
            PrestamoModelo prestamoModelo = new PrestamoModelo();

            // Guardar el préstamo en la base de datos
            prestamoModelo.guardarPrestamo(prestamo);
            JOptionPane.showMessageDialog(null, "Préstamo procesado con éxito.");

        } catch (Exception e) {
            // Manejar cualquier excepción que pueda ocurrir durante el procesamiento del préstamo
            e.printStackTrace(); // Imprimir la traza de la pila para depuración
            // Aquí podrías agregar lógica para manejar la excepción, como mostrar un mensaje de error al usuario
            JOptionPane.showMessageDialog(null, "Error al procesar el préstamo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

}
