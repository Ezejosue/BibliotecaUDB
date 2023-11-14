/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import util.conexionDB;

/**
 *
 * @author Josue
 */
import java.util.ArrayList;

public class UsuarioModelo {

    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    private static PreparedStatement pstmt;

    public Usuario obtenerUsuarioPorCredenciales(String correo, String contrasena) {

        conn = conexionDB.getConnection();
        try {
            String sql = "SELECT * FROM usuarios WHERE correo = ? AND contrasena = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, contrasena);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setContrasena(rs.getString("contrasena"));
                usuario.setTipoUsuario(rs.getString("tipo_usuario"));
                usuario.setMora(rs.getDouble("mora"));
                return usuario;
            }
            return null;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        } finally {
            conexionDB.close(conn);
        }
    }

    public boolean ingresarUsuario(Usuario usuario) {
        conn = conexionDB.getConnection();
        try {
            String sql = "INSERT INTO `usuarios`  (`nombre`, `correo`, `contrasena`, `tipo_usuario`) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreo());
            ps.setString(3, usuario.getContrasena());
            ps.setString(4, usuario.getTipoUsuario());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            conexionDB.close(conn);
        }
    }

    public ArrayList<Usuario> obtenerUsuarios() {
        conn = conexionDB.getConnection();
        try {
            ArrayList<Usuario> todos_Usuarios = new ArrayList<>();
            String sql = "SELECT id,nombre,correo, contrasena, tipo_usuario, mora FROM usuarios";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuario user = new Usuario();
                user.setId(rs.getInt("id"));
                user.setNombre(rs.getString("nombre"));
                user.setCorreo(rs.getString("correo"));
                user.setContrasena(rs.getString("contrasena"));
                user.setMora(rs.getDouble("mora"));
                todos_Usuarios.add(user);
            }
            return todos_Usuarios;
        } catch (Exception e) {
            return null;
        } finally {
            conexionDB.close(conn);
        }
    }
}
