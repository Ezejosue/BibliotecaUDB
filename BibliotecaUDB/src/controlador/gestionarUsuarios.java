/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import modelo.UsuarioModelo;
import vista.vistaGUsuarios;
import vista.vistaMenu;

/**
 *
 * @author GUASI
 */
public class gestionarUsuarios {

    private vistaGUsuarios vistaGsuario;
    private UsuarioModelo modelo;
    private vistaMenu vistamenu;

    public gestionarUsuarios(vistaGUsuarios vistaGusuario, UsuarioModelo modelo, vistaMenu vistamenu) {
        this.vistaGsuario = vistaGusuario;
        this.modelo = modelo;
        this.vistamenu = vistamenu;
        this.vistaGsuario.setControlador(this);
    }

    public DefaultTableModel MostrarTodosLosUsuarios() {
        ArrayList<Usuario> todosUsuarios = modelo.obtenerUsuarios();
            String[] titulos = {"ID", "Nombre", "Correo", "Contrasena", "Mora"};
        DefaultTableModel tableModel = new DefaultTableModel(titulos, 0);

        for (Usuario usuario : todosUsuarios) {
            Object[] fila = {usuario.getId(), usuario.getNombre(), usuario.getCorreo(), usuario.getContrasena(), usuario.getMora()};
            tableModel.addRow(fila);
        }

        return tableModel;
    }
}
