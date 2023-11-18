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
import util.conexionDB;

/**
 *
 * @author Josue
 */
public class EjemplarModelo {

    public void agregarLibro(Libro libro) {
        // Primero, insertamos el Ejemplar base
        String sqlEjemplar = "INSERT INTO ejemplares (id, titulo, autor, tipo, ubicacion, cantidad, prestados) VALUES (?, ?, ?, ?, ?, ?, ?)";
        String sqlLibro = "INSERT INTO libros (id_ejemplar, isbn, id_editorial, edicion) VALUES (?, ?, ?, ?)";
        Connection conexion = null;
        try {
            conexion = conexionDB.getConnection();
            conexion.setAutoCommit(false);

            try (PreparedStatement pstmtEjemplar = conexion.prepareStatement(sqlEjemplar)) {
                pstmtEjemplar.setString(1, libro.getId());
                pstmtEjemplar.setString(2, libro.getTitulo());
                pstmtEjemplar.setString(3, libro.getAutor());
                pstmtEjemplar.setString(4, libro.getTipo());
                pstmtEjemplar.setString(5, libro.getUbicacion());
                pstmtEjemplar.setInt(6, libro.getCantidad());
                pstmtEjemplar.setInt(7, libro.getPrestados());

                int ejemplarInsertado = pstmtEjemplar.executeUpdate();

                // Si la inserción en ejemplares fue exitosa, procedemos con libros
                if (ejemplarInsertado == 1) {
                    try (PreparedStatement pstmtLibro = conexion.prepareStatement(sqlLibro)) {
                        pstmtLibro.setString(1, libro.getId());
                        pstmtLibro.setString(2, libro.getIsbn());
                        pstmtLibro.setInt(3, libro.getIdEditorial());
                        pstmtLibro.setInt(4, libro.getEdicion());

                        int libroInsertado = pstmtLibro.executeUpdate();

                        // Si ambas inserciones fueron exitosas, confirmamos la transacción
                        if (libroInsertado == 1) {
                            conexion.commit();
                        } else {
                            conexion.rollback();
                        }
                    }
                } else {
                    conexion.rollback();
                }
            }
        } catch (SQLException e) {
            try {
                // Si ocurre un error, revertimos la transacción
                conexion.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                // Restauramos el modo de auto commit
                conexion.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public ResultSet obtenerLibrosCompletos() {
        Connection conexion = conexionDB.getConnection();
        String sql = "SELECT e.id, e.titulo, e.autor, e.tipo, e.ubicacion, e.cantidad, e.prestados, l.isbn, l.id_editorial, l.edicion FROM ejemplares e INNER JOIN libros l ON e.id = l.id_ejemplar";
        try {
            PreparedStatement pstmt = conexion.prepareStatement(sql);
            return pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
