/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Usuario;
import modelo.UsuarioModelo;
import vista.vistaLogin;
import vista.vistaMenu;

/**
 *
 * @author PC
 */
public class LoginControlador {

    private vistaLogin vista;
    private UsuarioModelo modelo;

    public LoginControlador(vistaLogin vista, UsuarioModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setControlador(this);
    }

    public void iniciarSesion(String correo, String contrasena) {
        Usuario usuario = modelo.obtenerUsuarioPorCredenciales(correo, contrasena);
        if (usuario != null) {
          //  vista.mostrarMensaje("Inicio de sesión exitoso");
            vistaMenu vistaMenu = new vistaMenu();
            vistaMenu.setVisible(true);
            vista.setVisible(false);
            
        } else {
            vista.mostrarMensaje("Correo o contraseña incorrectos");
        }
    }

}
