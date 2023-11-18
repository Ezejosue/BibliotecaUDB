/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Josue
 */
public class UsuarioActual {

    private static UsuarioActual instancia = new UsuarioActual();
    private int idUsuario;
    private String tipoUsuario;

    private UsuarioActual() {
    }

    public static UsuarioActual getInstancia() {
        return instancia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int id) {
        this.idUsuario = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

  
    
}
