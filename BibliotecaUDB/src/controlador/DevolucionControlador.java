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
import modelo.Devolucion;
import modelo.DevolucionModelo;
import modelo.Prestamo;
import util.conexionDB;
import vista.vistaDevolucion;

/**
 *
 * @author Josue
 */
public class DevolucionControlador {

    vistaDevolucion vista;
    DevolucionModelo modelo;

    public DevolucionControlador() {
    }

    public DevolucionControlador(vistaDevolucion vista, DevolucionModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setControlador(this);
    }

    public static void procesarDevolucion(Devolucion devolucion) {
        try {
            DevolucionModelo devolucionModelo = new DevolucionModelo();
            devolucionModelo.guardarDevolucion(devolucion);
            JOptionPane.showMessageDialog(null, "Devolución procesada con éxito.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al procesar la devolución: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static List<Prestamo> obtenerPrestamosPendientes(int idUsuario) {
        List<Prestamo> prestamos = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conexion = conexionDB.getConnection();
            String sql = "SELECT prestamos.*, ejemplares.titulo FROM prestamos\n"
                    + "JOIN ejemplares ON prestamos.id_ejemplar = ejemplares.id\n"
                    + "WHERE prestamos.id_usuario = ? AND prestamos.fecha_devolucion IS NULL";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();

            while (rs.next()) {
                Prestamo prestamo = new Prestamo();
                prestamo.setId(rs.getInt("id"));
                prestamo.setIdUsuario(rs.getInt("id_usuario"));
                prestamo.setIdEjemplar(rs.getString("id_ejemplar"));
                prestamo.setTitulo(rs.getString("titulo"));
                prestamo.setFechaPrestamo(rs.getDate("fecha_prestamo"));
                prestamo.setFechaDevolucion(rs.getDate("fecha_devolucion"));
                prestamos.add(prestamo);
            }
        } catch (SQLException e) {
            // Manejar excepciones
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conexion != null) {
                    conexion.close();
                    System.out.println("Conexión cerrada");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return prestamos;
    }

}
