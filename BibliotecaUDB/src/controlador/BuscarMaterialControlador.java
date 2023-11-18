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
import modelo.Ejemplar;
import modelo.EjemplarTableModelo;
import modelo.Libro;
import util.conexionDB;
import vista.vistaBuscarLibro;

/**
 *
 * @author Josue
 */
public class BuscarMaterialControlador {

    public EjemplarTableModelo buscarEjemplares(String titulo, String autor, String tipoMaterial) {
        List<Ejemplar> resultados = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conexion = conexionDB.getConnection();
            String sql = "SELECT * FROM ejemplares WHERE titulo LIKE ? AND autor LIKE ? AND tipo = ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, "%" + titulo + "%");
            ps.setString(2, "%" + autor + "%");
            ps.setString(3, tipoMaterial);

            rs = ps.executeQuery();

            while (rs.next()) {
                Ejemplar ejemplar = new Ejemplar() {
                };
                ejemplar.setId(rs.getString("id"));
                ejemplar.setTitulo(rs.getString("titulo"));
                ejemplar.setAutor(rs.getString("autor"));
                ejemplar.setUbicacion(rs.getString("ubicacion"));
                ejemplar.setCantidad(rs.getInt("cantidad"));
                ejemplar.setPrestados(rs.getInt("prestados"));
                resultados.add(ejemplar);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de la excepción
        } finally {
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
                // Manejo de la excepción
            }
        }

        return new EjemplarTableModelo(resultados);
    }

    public EjemplarTableModelo mostrarEjemplares(String id, String titulo) {
        List<Ejemplar> resultados = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conexion = conexionDB.getConnection();
            String sql = "SELECT * FROM ejemplares WHERE id LIKE ? AND titulo LIKE ? ";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, "%" + id + "%");
            ps.setString(2, "%" + titulo + "%");

            rs = ps.executeQuery();

            while (rs.next()) {
                Ejemplar ejemplar = new Ejemplar() {
                };
                ejemplar.setId(rs.getString("id"));
                ejemplar.setTitulo(rs.getString("titulo"));
                ejemplar.setAutor(rs.getString("autor"));
                ejemplar.setUbicacion(rs.getString("ubicacion"));
                ejemplar.setCantidad(rs.getInt("cantidad"));
                ejemplar.setPrestados(rs.getInt("prestados"));
                resultados.add(ejemplar);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de la excepción
        } finally {
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
                // Manejo de la excepción
            }
        }

        return new EjemplarTableModelo(resultados);
    }

    public void limpiarTabla(EjemplarTableModelo modelo) {
        modelo.limpiar();
    }

    public boolean esListaVacia(List<Ejemplar> resultados) {
        return resultados.isEmpty();
    }

}
