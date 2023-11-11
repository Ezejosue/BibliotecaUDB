/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Usuario;
import modelo.UsuarioModelo;
import vista.vistaRgistroUsuario;
import vista.vistaMenu;

/**
 *
 * @author GUASI
 */
public class usuarioControlador {

    private vistaRgistroUsuario vistaRUsuario;
    private UsuarioModelo modelo;
    private vistaMenu vistamenu;

    public usuarioControlador(vistaRgistroUsuario vista, UsuarioModelo modelo, vistaMenu vistamenu) {
        this.vistaRUsuario = vista;
        this.modelo = modelo;
        this.vistamenu = vistamenu;
        this.vistaRUsuario.setControlador(this);
    }

    public void RegistrarUsuario(Usuario usuario) {
        System.out.println("INGRESO AL METODO");
        if (usuario != null) {
            if (!usuario.getNombre().equals("") && !usuario.getCorreo().equals("") && !usuario.getContrasena().equals("") && !usuario.getTipoUsuario().equals("")) {
                boolean isGuardado = modelo.ingresarUsuario(usuario);
                if (isGuardado) {
                    vistaRUsuario.mostrarMensaje("Usuario Guardado Exitosamente");
                } else {
                    vistaRUsuario.mostrarMensaje("No se pudo registrar Usuario");
                }
            } else {
                vistaRUsuario.mostrarMensaje("ingrese todos los valores");
            }
        } else {
            vistaRUsuario.mostrarMensaje("ingrese los valores");
        }
    }

}
