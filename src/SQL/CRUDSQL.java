
package SQL;
import GEtset.variables;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class CRUDSQL extends Conexion {
    
    java.sql.Statement st;
    ResultSet rs;
    variables var = new variables();
    
    public void insertarSucursal(String id_sucursal, String nombre){
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO SUCURSAL(id_sucursal,id_cuidad,nombre) VALUES('"+id_sucursal+"','"+nombre+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null,"El registo se guardo correctamente","mensaje",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"El registo no se ha podido guardar de manera exitosa","mensaje",JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    public void insertarEmpleado(String documento, String codigo, String nombre, String fecha_nacimiento, String fecha_ingreso, String fecha_salida, String salario){
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO EMPLEADO(documento,codigo,nombre,fecha_nacimiento,fecha_ingreso,fecha_salida,salario) VALUES('"+documento+"','"+codigo+"','"+nombre+"','"+fecha_nacimiento+"','"+fecha_ingreso+"','"+fecha_salida+"','"+salario+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null,"El registo se guardo correctamente","mensaje",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"El registo no se ha podido guardar de manera exitosa","mensaje",JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    public void insertarCleinte(String documento, String nombre, String fecha_inicio){
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO CLIENTE(documento,nombre,fecha_inicio) VALUES('"+documento+"','"+nombre+"','"+fecha_inicio+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null,"El registo se guardo correctamente","mensaje",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"El registo no se ha podido guardar de manera exitosa","mensaje",JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    public void insertarVenta(String id_venta, String cantidad){
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO VENTA(id_venta,cantidad) VALUES('"+id_venta+"','"+cantidad+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null,"El registo se guardo correctamente","mensaje",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"El registo no se ha podido guardar de manera exitosa","mensaje",JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    
    public void insertarAutomotr(String numero_chasis, String precio, String placa, String id_interno, String fecha_entrada, String fecha_salida){
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO AUTOMOTOR(numero_chasis,precio,placa,id_interno,fecha_entrada,fecha_salida) VALUES('"+numero_chasis+"','"+precio+"','"+placa+"','"+id_interno+"','"+fecha_entrada+"','"+fecha_salida+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null,"El registo se guardo correctamente","mensaje",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"El registo no se ha podido guardar de manera exitosa","mensaje",JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    
    public void mostrarSucursal(String id_sucursal){
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from SUCURSAL where id = '"+id_sucursal+"';";
            rs = st.executeQuery(sql);
            if(rs.next()){
                var.setId_sucursal(rs.getString("ID"));
                var.setCuidad(rs.getString("Cuidad"));
                var.setNombre(rs.getString("nombre"));
            }else{
            var.setId_sucursal("");
            var.setCuidad("");
            var.setNombre("");
            JOptionPane.showMessageDialog(null, "No se encontro registro","sin registro",JOptionPane.INFORMATION_MESSAGE);
        }
           st.close();
           conexion.close();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error en el sistema de busqueda","Error busqueda",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarSucursal(String id_sucursal,String cuidad, String nombre){
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update SUCURSAL set nombre='"+cuidad+"',puesto='"+nombre+"' where id= '"+id_sucursal+"';";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null,"El registro se actualizo de manera exitosa", "exito",JOptionPane.INFORMATION_MESSAGE );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminar(String id){
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete From empleado where id='"+id+"';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente","eliminado",JOptionPane.INFORMATION_MESSAGE );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al eliminar","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
