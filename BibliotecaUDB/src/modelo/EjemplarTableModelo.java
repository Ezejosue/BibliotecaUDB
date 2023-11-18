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
 * @author Josue
 */
public class EjemplarTableModelo extends AbstractTableModel {

    private final List<Ejemplar> ejemplares;
    private final String[] columnNames = {"ID", "Título", "Autor", "Ubicación", "Cantidad", "Prestados"};

    public EjemplarTableModelo(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public int getRowCount() {
        return ejemplares.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ejemplar ejemplar = ejemplares.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ejemplar.getId();
            case 1:
                return ejemplar.getTitulo();
            case 2:
                return ejemplar.getAutor();
            case 3:
                return ejemplar.getUbicacion();
            case 4:
                return ejemplar.getCantidad();
            case 5:
                return ejemplar.getPrestados();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    public void limpiar() {
        ejemplares.clear();
        fireTableDataChanged();
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void limpiarDatos() {
        ejemplares.clear();
    }

}
