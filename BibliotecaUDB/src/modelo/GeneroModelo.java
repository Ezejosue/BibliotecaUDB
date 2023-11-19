package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import util.conexionDB;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class GeneroModelo {
    private String nombre;
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    private static PreparedStatement pstmt;
 

   public GeneroModelo() {

    }

    public GeneroModelo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean IngresoGenero(GeneroModelo modelo) {

        conn = conexionDB.getConnection();

        try {
            String sql = "INSERT INTO generos (\"nombre\") Values (?) ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, modelo.getNombre());
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            return false;

        } finally {
            conexionDB.close(conn);
        }

    }
// metodo que muestra los datos de la tabla genero 
    public ArrayList<GeneroModelo> tablaGenero() {
        conn = conexionDB.getConnection();
        try {
            ArrayList<GeneroModelo> todosGenero = new ArrayList<>();
            String sql = "SELECT * FROM generos  ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                GeneroModelo genero = new GeneroModelo();
                genero.setNombre(rs.getNString("nombre"));
                todosGenero.add(genero);
            }
            return todosGenero;

        } catch (Exception e) {
            return null;
        } finally {
            conexionDB.close(conn);
        }
    }
    

    @Override
    public String toString() {
     return "GeneroModelo{" + "Nombre=" + nombre + "}";
    }

}
