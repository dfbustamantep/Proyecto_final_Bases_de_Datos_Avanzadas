
package SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con = null;
    String url = "jdbc:postgresql://localhost:5432/prueba";
    String usuario = "postgres";
    String Clave = "1234";
    
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,usuario,Clave);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en conexion");
        }
        return con;
    } 
    
    
    
    
}
