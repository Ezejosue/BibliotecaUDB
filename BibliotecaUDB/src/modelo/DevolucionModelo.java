/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.conexionDB;

/**
 *
 * @author PC
 */
public class DevolucionModelo {

    public void guardarDevolucion(Devolucion devolucion) throws SQLException {
        Connection conexion = null;
        PreparedStatement ps = null;

        try {
            conexion = conexionDB.getConnection();

            String sql = "INSERT INTO devoluciones (id_prestamo, fecha_devolucion, estado_devolucion, comentarios) VALUES (?, ?, ?, ?)";
            ps = conexion.prepareStatement(sql);

            ps.setInt(1, devolucion.getIdPrestamo());
            ps.setDate(2, new java.sql.Date(devolucion.getFechaDevolucion().getTime()));
            ps.setString(3, devolucion.getEstadoDevolucion());
            ps.setString(4, devolucion.getComentarios());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw e;
        } finally {
            // Cerrar recursos
            if (ps != null) {
                ps.close();
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Cerrar conexión");
            }
        }
    }

}
