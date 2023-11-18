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
import modelo.Editorial;
import modelo.EditorialModelo;
import util.conexionDB;
import vista.vistaEditoriales;

/**
 *
 * @author HP
 */
public class EditorialesControlador {
    
    public EditorialModelo buscarEditoriales(String nombre) {
         
        List<Editorial> resultados = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            
            conexion = conexionDB.getConnection();
            String sql = "SELECT * FROM editoriales WHERE nombre LIKE ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");

            rs = ps.executeQuery();

            while (rs.next()) {
                Editorial editorial = new Editorial() {
                };
                editorial.setId(rs.getInt("id"));
                editorial.setNombre(rs.getString("nombre"));
                resultados.add(editorial);
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

        return new EditorialModelo(resultados);
    }

    public EditorialModelo allEditoriales() {
         
        List<Editorial> resultados = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            
            conexion = conexionDB.getConnection();
            String sql = "SELECT * FROM editoriales";
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Editorial editorial = new Editorial() {
                };
                editorial.setId(rs.getInt("id"));
                editorial.setNombre(rs.getString("nombre"));
                resultados.add(editorial);
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

        return new EditorialModelo(resultados);
    }

   
     
    public void limpiarTabla(EditorialModelo modelo) {
        modelo.limpiar();
    }

    public boolean esListaVacia(List<Editorial> resultados) {
        return resultados.isEmpty();
    }
}
