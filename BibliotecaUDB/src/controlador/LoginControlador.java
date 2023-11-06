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
 * @author Josue
 */
public class LoginControlador {

    private vistaLogin vista;
    private UsuarioModelo modelo;
    private vistaMenu vistamenu;

    public LoginControlador(vistaLogin vista, UsuarioModelo modelo, vistaMenu vistamenu) {
        this.vista = vista;
        this.modelo = modelo;
        this.vistamenu = vistamenu;
        this.vista.setControlador(this);
    }

    public void iniciarSesion(String correo, String contrasena) {
        Usuario usuario = modelo.obtenerUsuarioPorCredenciales(correo, contrasena);
        if (usuario != null) {
            //  vista.mostrarMensaje("Inicio de sesión exitoso");
            vistamenu.configurarMenuParaUsuario(usuario.getTipoUsuario());
            vistamenu.setVisible(true);
            vista.setVisible(false);

        } else {
            vista.mostrarMensaje("Correo o contraseña incorrectos");
        }
    }

}
