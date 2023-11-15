/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Prestamo;

/**
 *
 * @author PC
 */
public class PrestamoTableModel extends AbstractTableModel {

    private final List<Prestamo> prestamos;
    private final String[] columnNames = {"ID", "ID Usuario", "ID Ejemplar", "Fecha Préstamo", "Fecha Devolución"};

    public PrestamoTableModel(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public int getRowCount() {
        return prestamos.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Prestamo prestamo = prestamos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return prestamo.getId();
            case 1:
                return prestamo.getIdUsuario();
            case 2:
                return prestamo.getIdEjemplar();
            case 3:
                return prestamo.getFechaPrestamo();
            case 4:
                return prestamo.getFechaDevolucion();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    public void limpiarDatos() {
        prestamos.clear();
    }
    
     public void limpiar() {
        prestamos.clear();
        fireTableDataChanged();
    }

    public List<Prestamo> getEjemplares() {
        return prestamos;
    }
}
