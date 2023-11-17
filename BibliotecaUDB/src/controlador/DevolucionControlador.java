/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import modelo.Devolucion;
import modelo.DevolucionModelo;
import modelo.Prestamo;
import modelo.PrestamoModelo;
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

    public static void procesarDevolucion(Devolucion devolucion, Date fechaPrestamo, int idUsuario, int idEjemplar) {
        DevolucionModelo devolucionModelo = new DevolucionModelo();
        Date fechaDevolucion = devolucion.getFechaDevolucion();
        long diferenciaEnMilis = fechaDevolucion.getTime() - fechaPrestamo.getTime();
        long diasDiferencia = TimeUnit.DAYS.convert(diferenciaEnMilis, TimeUnit.MILLISECONDS);
        if (diasDiferencia > 7) {
            try {
                BigDecimal valorMultaPorDia = DevolucionModelo.obtenerValorMulta();
                BigDecimal diasExcedidos = new BigDecimal(diasDiferencia - 7);
                BigDecimal multaTotal = valorMultaPorDia.multiply(diasExcedidos);

                int respuesta = JOptionPane.showConfirmDialog(null, "La devolución está atrasada por " + diasExcedidos + " días. La multa total es: " + multaTotal + ". ¿Desea realizar el pago ahora?", "Multa por Atraso", JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {

                    devolucionModelo.registrarPago(idUsuario, multaTotal, idEjemplar);

                    JOptionPane.showMessageDialog(null, "Pago realizado con éxito. Deuda actualizada a cero.");
                } else {
                    devolucionModelo.registrarMorosidad(idUsuario, multaTotal);
                    JOptionPane.showMessageDialog(null, "La deuda ha sido registrada. Por favor, realice el pago lo antes posible.");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al procesar la multa: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

            }
        }

        try {
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
