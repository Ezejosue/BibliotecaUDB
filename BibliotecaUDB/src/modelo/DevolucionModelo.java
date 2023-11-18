/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

    public static BigDecimal obtenerValorMulta() throws SQLException {
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        BigDecimal valorMulta = BigDecimal.ZERO;

        try {
            conexion = conexionDB.getConnection();
            String sql = "SELECT valor FROM configuraciones WHERE clave = 'Mora'";
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                valorMulta = rs.getBigDecimal("valor");
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

        return valorMulta;
    }

    public void registrarPago(int idUsuario, BigDecimal monto, int idPrestamo) throws SQLException {
        Connection conexion = null;
        PreparedStatement ps = null;

        try {
            conexion = conexionDB.getConnection();
            conexion.setAutoCommit(false); // Empezar transacción

            // Insertar el registro de pago
            String sqlPago = "INSERT INTO pagos (id_usuario, monto, fecha_pago, id_prestamo) VALUES (?, ?, ?, ?)";
            ps = conexion.prepareStatement(sqlPago);
            ps.setInt(1, idUsuario);
            ps.setBigDecimal(2, monto);
            ps.setDate(3, new java.sql.Date(System.currentTimeMillis())); // Fecha actual
            ps.setInt(4, idPrestamo);
            ps.executeUpdate();

            // Actualizar la morosidad del usuario
            String sqlMora = "UPDATE usuarios SET mora = 0 WHERE id = ?";
            ps = conexion.prepareStatement(sqlMora);
            ps.setInt(1, idUsuario);
            ps.executeUpdate();

            conexion.commit(); // Confirmar transacción
        } catch (SQLException e) {
            if (conexion != null) {
                conexion.rollback(); // Revertir transacción en caso de error
            }
            throw e;
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conexion != null) {
                conexion.setAutoCommit(true); // Restaurar auto commit
                conexion.close();
            }
        }
    }

    public void registrarMorosidad(int idUsuario, BigDecimal monto) throws SQLException {
        Connection conexion = null;
        PreparedStatement ps = null;

        try {
            conexion = conexionDB.getConnection();

            // Actualizar la morosidad del usuario
            String sql = "UPDATE usuarios SET mora = mora + ? WHERE id = ?";
            ps = conexion.prepareStatement(sql);
            ps.setBigDecimal(1, monto);
            ps.setInt(2, idUsuario);
            ps.executeUpdate();

        } catch (SQLException e) {
            throw e;
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        }
    }

    public BigDecimal obtenerMoraUsuario(int idUsuario) throws SQLException {
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        BigDecimal mora = BigDecimal.ZERO;

        try {
            conexion = conexionDB.getConnection();
            String sql = "SELECT mora FROM usuarios WHERE id = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                mora = rs.getBigDecimal("mora");
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

        return mora;
    }

  
}
