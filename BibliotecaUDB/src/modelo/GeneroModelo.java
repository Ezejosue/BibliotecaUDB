/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import util.conexionDB;

/**
 *
 * @author kevin
 */
public class GeneroModelo {
    private static Connection conn;
    private String Genero;

    public GeneroModelo(String Genero) {
        this.Genero = Genero;
    }

    public GeneroModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
    public boolean IngresoGenero (GeneroModelo modelo){
         conn = conexionDB.getConnection();
         
         try {
            String sql = "INSERT INTO 'generos' ('nombre') Values (?) " ;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,modelo.getGenero() );
            ps.executeUpdate();
            return true;
            
        } catch (Exception e) {
            return false;
            
        } finally{
             conexionDB.close(conn);
         }
    }
    
}
