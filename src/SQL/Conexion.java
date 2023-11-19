
package SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con = null;
    int puerto = 5432;
    String url = "jdbc:postgresql://localhost:"+puerto+"/prueba";
    String usuario = "postgres";
    String Clave = "1234";
    
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,usuario,Clave);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en conexion");
        }
        return con;
    } 
    
    
    
    
}
