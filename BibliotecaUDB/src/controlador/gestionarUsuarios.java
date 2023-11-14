/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    private vistaGUsuarios vistaGUsuario;
    private UsuarioModelo modelo ;
    private vistaMenu vistamenu;

    public gestionarUsuarios(vistaGUsuarios vistaGusuario, UsuarioModelo modelo, vistaMenu vistamenu) {
        this.vistaGUsuario = vistaGusuario;
        this.modelo = modelo;
        this.vistamenu = vistamenu;
        this.vistaGUsuario.setControlador(this);
    }
    
    public DefaultTableModel MostrarTodosLosUsuarios(){
        ArrayList<Usuario> todosLosUsuarios = modelo.obtenerUsuarios();
        DefaultTableModel tabla = new DefaultTableModel();
        String titulo[] = {"id", "nombre", "correo", "contrasena", "tipo_usuario", "mora"};
        tabla.setColumnIdentifiers(titulo);
        
        return tabla;
    }

}
