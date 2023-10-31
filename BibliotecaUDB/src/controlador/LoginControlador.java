/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Usuario;
import modelo.UsuarioModelo;
import vista.Login;

/**
 *
 * @author PC
 */
public class LoginControlador {

    private Login vista;
    private UsuarioModelo modelo;

    public LoginControlador(Login vista, UsuarioModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setControlador(this);
    }

    public void iniciarSesion(String correo, String contrasena) {
        Usuario usuario = modelo.obtenerUsuarioPorCredenciales(correo, contrasena);
        if (usuario != null) {
            vista.mostrarMensaje("Inicio de sesión exitoso");
        } else {
            vista.mostrarMensaje("Correo o contraseña incorrectos");
        }
    }

}
