/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaudb;

import controlador.LoginControlador;
import modelo.UsuarioModelo;
import vista.Login;

/**
 *
 * @author PC
 */
public class BibliotecaUDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        UsuarioModelo modelo = new UsuarioModelo();
        Login loginVista = new Login();
        LoginControlador controlador = new LoginControlador(loginVista, modelo);
        loginVista.setVisible(true);

    }

}
