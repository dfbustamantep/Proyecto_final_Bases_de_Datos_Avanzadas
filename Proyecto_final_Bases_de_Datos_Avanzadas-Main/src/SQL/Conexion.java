
package SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class Conexion {
    public Connection con;
    public PreparedStatement sen;
    
    int puerto = 5433;
    //int puerto = 5432;
    String url = "jdbc:postgresql://localhost:"+puerto+"/ej1";
    String usuario = "postgres";
    String Clave = "admin";
    //String Clave = "1234";
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,usuario,Clave);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en conexion");
        }
        return con;
    } 

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
        
    }

    public PreparedStatement getSen() {
        return sen;
    }

    public void setSen(PreparedStatement sen) {
        this.sen = sen;
    }
}

