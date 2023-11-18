/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import util.conexionDB;

/**
 *
 * @author HP
 */
public class EditorialModelo  extends AbstractTableModel {
    private static Connection conn;
    private final List<Editorial> editoriales;
    private final String[] columnNames = {"id", "nombre"};

    public EditorialModelo(List<Editorial> editoriales) {
        this.editoriales = editoriales;
    }

    @Override
    public int getRowCount() {
        return editoriales.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Editorial editorial = editoriales.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return editorial.getId();
            case 1:
                return editorial.getNombre();
         
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    public void limpiar() {
        editoriales.clear();
        fireTableDataChanged();
    }

    public List<Editorial> getEditoriales() {
        return editoriales;
    }
    
    
    public List<Editorial> allEditoriales() {
        return editoriales;
    }
    
    public void limpiarDatos() {
        editoriales.clear();
    }
    
     public boolean ingresarUsuario(Usuario usuario) {
        conn = conexionDB.getConnection();
        try {
            String sql = "INSERT INTO editoriales  (`nombre`) VALUES (?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            conexionDB.close(conn);
        }
    }

}
