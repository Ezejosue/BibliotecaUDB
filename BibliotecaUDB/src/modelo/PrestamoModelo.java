/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.conexionDB;

/**
 *
 * @author Josue
 */
public class PrestamoModelo {

    public void guardarPrestamo(Prestamo prestamo) {
        try (Connection conn = conexionDB.getConnection()) {
            String sql = "INSERT INTO prestamos (id_usuario, id_ejemplar, fecha_prestamo) VALUES (?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, prestamo.getIdUsuario());
                stmt.setString(2, prestamo.getIdEjemplar());
                stmt.setDate(3, new java.sql.Date(prestamo.getFechaPrestamo().getTime()));
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Prestamo obtenerPrestamoPorId(int idPrestamo) throws SQLException {
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Prestamo prestamo = null;

        try {
            conexion = conexionDB.getConnection();
            String sql = "SELECT * FROM prestamos WHERE id = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, idPrestamo);
            rs = ps.executeQuery();

            if (rs.next()) {
                prestamo = new Prestamo();
                prestamo.setFechaPrestamo(rs.getDate("fecha_prestamo"));
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        }

        return prestamo;
    }

}
