package SQL;

import GEtset.Automotor;
import GEtset.Cargo;
import GEtset.CiudadSucursal_Cliente;
import GEtset.Cliente;
import GEtset.ColorAutomotor;
import GEtset.Empleado;
import GEtset.LineaAutomotor;
import GEtset.Marca;
import GEtset.ModeloAutomotor;
import GEtset.RepCliNueNac;
import GEtset.RepClienNueMesSucur;
import GEtset.RepEmpleados;
import GEtset.RepMarAutMasVendAnuSuc;
import GEtset.RepMarcAutNuevMasVenMensSucur;
import GEtset.Sucursal;
import GEtset.TipoAutomotor;
import GEtset.variables;
import GEtset.VariablesAuto;
import GEtset.VariablesCliente;
import GEtset.VariablesEmple;
import GEtset.VariablesVenta;
import java.awt.HeadlessException;
import java.awt.List;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CRUDSQL extends Conexion {

    java.sql.Statement st;
    ResultSet rs;
    Sucursal var = new Sucursal();
    VariablesAuto var1 = new VariablesAuto();
    VariablesEmple var2 = new VariablesEmple();
    VariablesCliente var3 = new VariablesCliente();
    VariablesVenta var4 = new VariablesVenta();

    //INSERTS
    public void insertarSucursal(String id_sucursal, String nombre, String id_ciudad) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO SUCURSAL(id_sucursal, id_ciudad , nombre) VALUES('" + id_sucursal + "','" + id_ciudad + "','" + nombre + "');";

            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registo se guardo correctamente", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "El registo no se ha podido guardar de manera exitosa", "mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    public void insertarEmpleado(String documento, String codigo, String nombre, String fecha_nacimiento, String fecha_ingreso, String fecha_salida, String salario, String sucursal, String cargo) {
        String sql = "";
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            if (fecha_salida.equals("")) {
                sql = "INSERT INTO EMPLEADO("
                        + "documento,codigo,nombre,fecha_nacimiento,fecha_ingreso,fecha_salida,salario, id_sucursal , id_cargo) "
                        + "VALUES('" + documento + "','" + codigo + "','" + nombre + "','" + fecha_nacimiento + "','" + fecha_ingreso + "',null,'" + salario + "','" + sucursal + "','" + cargo + "');";

            } else {
                sql = "INSERT INTO EMPLEADO("
                        + "documento,codigo,nombre,fecha_nacimiento,fecha_ingreso,fecha_salida,salario, id_sucursal , id_cargo) "
                        + "VALUES('" + documento + "','" + codigo + "','" + nombre + "','" + fecha_nacimiento + "','" + fecha_ingreso + "','" + fecha_salida + "','" + salario + "','" + sucursal + "','" + cargo + "');";

            }
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registo se guardo correctamente", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "El registo no se ha podido guardar de manera exitosa", "mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    public void insertarCleinte(String documento, String nombre, String fecha_inicio, String id_ciudad, String id_sucursal) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO CLIENTE(documento,nombre,fecha_inicio, id_ciudad , id_sucursal) VALUES('" + documento + "','" + nombre + "','" + fecha_inicio + "','" + id_ciudad + "','" + id_sucursal + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registo se guardo correctamente", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "El registo no se ha podido guardar de manera exitosa", "mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertarVenta(String id_venta, String fecha_venta, String documento_cliente, String documento_empleado, String codigo_empleado, String chasisAutomotor) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO VENTA(id_venta,fecha_venta, documento_cliente , documento_empleado, codigo_empleado) VALUES('" + id_venta + "','" + fecha_venta + "','" + documento_cliente + "','" + documento_empleado + "','" + codigo_empleado + "');";

            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registo se guardo correctamente", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "El registo no se ha podido guardar de manera exitosa", "mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("el error de insercion es " + e.getMessage());
        }      
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "UPDATE automotor SET fecha_salida = '" + fecha_venta + "' , id_venta = '" + id_venta + "' WHERE numero_chasis = " + chasisAutomotor + ";";

            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registo se guardo correctamente", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "El registo no se ha podido actualizar de manera exitosa", "mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("el error de actualizacion es " + e.getMessage());
        }
    }

    public void insertarAutomotr(String numero_chasis, String precio, String placa, String id_interno, String fecha_entrada, String fecha_salida, String id_sucursal, String id_tipo, String id_linea, String id_modelo, String id_color, String id_marca) {
        String sql = "";
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            if ((placa.equals("")) && (fecha_salida.equals(""))) {
                System.out.println("uno");
                sql = "INSERT INTO AUTOMOTOR(numero_chasis,precio,placa,id_interno,fecha_entrada,fecha_salida, id_sucursal , id_tipo , id_linea , id_modelo , id_color, id_marca) VALUES('" + numero_chasis + "','" + precio + "',null," + id_interno + "','" + fecha_entrada + "',null,'" + id_sucursal + "','" + id_tipo + "','" + id_linea + "','" + id_modelo + "','" + id_color + "','" + id_marca + "');";
            } else if ((id_interno.equals("")) && (fecha_salida.equals(""))) {
                System.out.println("dos");
                sql = "INSERT INTO AUTOMOTOR(numero_chasis,precio,placa,id_interno,fecha_entrada,fecha_salida, id_sucursal , id_tipo , id_linea , id_modelo , id_color, id_marca) VALUES('" + numero_chasis + "','" + precio + "','" + placa + "',null,'" + fecha_entrada + "',null,'" + id_sucursal + "','" + id_tipo + "','" + id_linea + "','" + id_modelo + "','" + id_color + "','" + id_marca + "');";
            } else if (placa.equals("")) {
                System.out.println("tres");
                sql = "INSERT INTO AUTOMOTOR(numero_chasis,precio,placa,id_interno,fecha_entrada,fecha_salida, id_sucursal , id_tipo , id_linea , id_modelo , id_color, id_marca) VALUES('" + numero_chasis + "','" + precio + ",null," + id_interno + "','" + fecha_entrada + "','" + fecha_salida + "','" + id_sucursal + "','" + id_tipo + "','" + id_linea + "','" + id_modelo + "','" + id_color + "','" + id_marca + "');";
            } else if (id_interno.equals("")) {
                System.out.println("cuatro");
                sql = "INSERT INTO AUTOMOTOR(numero_chasis,precio,placa,id_interno,fecha_entrada,fecha_salida, id_sucursal , id_tipo , id_linea , id_modelo , id_color, id_marca) VALUES('" + numero_chasis + "','" + precio + "','" + placa + ",null," + fecha_entrada + "','" + fecha_salida + "','" + id_sucursal + "','" + id_tipo + "','" + id_linea + "','" + id_modelo + "','" + id_color + "','" + id_marca + "');";
            } else {
                System.out.println("cinco");
                sql = "INSERT INTO AUTOMOTOR(numero_chasis,precio,placa,id_interno,fecha_entrada,fecha_salida, id_sucursal , id_tipo , id_linea , id_modelo , id_color, id_marca) VALUES('" + numero_chasis + "','" + precio + "','" + placa + "','" + id_interno + "','" + fecha_entrada + "','" + fecha_salida + "','" + id_sucursal + "','" + id_tipo + "','" + id_linea + "','" + id_modelo + "','" + id_color + "','" + id_marca + "');";

            }

            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registo se guardo correctamente", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "El registo no se ha podido guardar de manera exitosa", "mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("el error de insercion de automotor es " + e.getMessage());
        }
    }

    //MOSTRAR DATOS
    public Sucursal mostrarSucursal(String id_sucursal) {
        Sucursal aux = new Sucursal();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from sucursal where id_sucursal = " + id_sucursal + ";";
            System.out.println("la consulta es   " + sql);
            rs = st.executeQuery(sql);
            if (rs.next()) {
                aux.setId_sucursal(rs.getInt("id_sucursal"));
                aux.setId_ciudad(rs.getInt("id_ciudad"));
                aux.setNombre(rs.getString("nombre"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro registro", "sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de busqueda", "Error busqueda", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return aux;
    }

    public Automotor mostrarAutomotor(String Numero_de_chasis) {
        Automotor aux = new Automotor();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from AUTOMOTOR where numero_chasis = '" + Numero_de_chasis + "';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                aux.setNumero_chasis(rs.getInt("numero_chasis"));
                aux.setPrecio(rs.getInt("precio"));
                aux.setId_interno(rs.getInt("id_interno"));
                aux.setPlaca(rs.getString("placa"));
                aux.setFecha_entrada(rs.getString("fecha_entrada"));
                aux.setFecha_salida(rs.getString("fecha_salida"));
            }else{
             JOptionPane.showMessageDialog(null, "No se encontro registro", "sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
             st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de busqueda", "Error busqueda", JOptionPane.ERROR_MESSAGE);
        }
        return aux;
    }

    public Empleado mostrarEmpleado(String Documento) {
        
        Empleado aux = new Empleado();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from EMPLEADO where documento = '" + Documento + "';";            
            System.out.println(sql);
            rs = st.executeQuery(sql);
            if (rs.next()){
                
                aux.setDocumento(rs.getInt("documento"));
                aux.setCodigo(rs.getInt("codigo"));
                aux.setNombre(rs.getString("nombre"));
                aux.setFecha_nacimineto(rs.getString("fecha_nacimiento"));
                aux.setFecha_ingreso(rs.getString("fecha_ingreso"));
                aux.setFecha_salida(rs.getString("fecha_salida"));
                aux.setSalario(rs.getInt("salario"));
                System.out.println("entra if" + aux.getSalario());
            } else {                 
                JOptionPane.showMessageDialog(null, "No se encontro registro", "sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de busqueda", "Error busqueda", JOptionPane.ERROR_MESSAGE);
        }
        return aux;
    }

    public Cliente mostrarCliente(String Documento) {
        Cliente aux = new Cliente();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from CLIENTE where documento = '" + Documento + "';";
            System.out.println("la consulta es   " + sql);
            rs = st.executeQuery(sql);
            if (rs.next()) {
                aux.setDocumento(rs.getInt("documento"));
                aux.setNombre(rs.getString("nombre"));
                aux.setFecha_inicio(rs.getString("fecha_inicio"));     
                aux.setId_ciudad(rs.getInt("id_ciudad"));
                aux.setId_sucursal(rs.getInt("id_sucursal"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro registro", "sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de busqueda", "Error busqueda", JOptionPane.ERROR_MESSAGE);
        }
        
        return aux;
    }



    //UPDATES
    public void actualizarSucursal(String id_sucursal, String ciudad, String nombre) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update SUCURSAL set nombre='" + nombre + "' , id_ciudad='" + ciudad + "' where id_sucursal= '" + id_sucursal + "';";
            System.out.println("update  " + sql  );
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo de manera exitosa", "exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizarCliente(String documento, String nombre, String fecha_inicio , String id_ciudad , String id_sucursal) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update CLIENTE set nombre='" + nombre + "',fecha_inicio='" + fecha_inicio + "', id_ciudad='" + id_ciudad + "',id_sucursal='" + id_sucursal+ "' where documento= '" + documento + "';";
            System.out.println("la actualizacoin es " + sql);
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo de manera exitosa", "exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    public void actualizarEmpleado(String Documento, String nombre, String fecha_nacimiento, String fecha_ingreso, String fecha_salida, String salario) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update EMPLEADO set nombre='" + nombre + "',fecha_nacimiento='" + fecha_nacimiento + "',fecha_ingreso='" + fecha_ingreso + "',fecha_salida='" + fecha_salida + "',salario='" + salario + "' where documento= '" + Documento + "';";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo de manera exitosa", "exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizarAuto(String placa, String precio, String ID_Interno, String Fecha_entrada, String Fecha_salida , String numero_chasis) {
        String sql = "";
        try {
             
            Connection conexion = conectar();
            st = conexion.createStatement();
           if(placa.equals("")){
             sql = "update AUTOMOTOR set precio='" + precio + "',id_interno='" + ID_Interno + "',fecha_entrada='" + Fecha_entrada + "',fecha_salida='" + Fecha_salida + "' ,placa= null where numero_chasis= '" + numero_chasis + "';";
            System.out.println(sql);
            st.execute(sql);
           }else if(ID_Interno.equals("")) {           
            sql = "update AUTOMOTOR set precio='" + precio + "',id_interno= null ,fecha_entrada='" + Fecha_entrada + "',fecha_salida='" + Fecha_salida + "' ,placa='" + placa + "' where numero_chasis= '" + numero_chasis + "';";
           System.out.println(sql);
           st.execute(sql);
           }
           
        
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo de manera exitosa", "exito", JOptionPane.INFORMATION_MESSAGE);
        }catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }



    //DELETES
    public void eliminarSucursal(String id) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from SUCURSAL where id_sucursal='" + id + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente", "eliminado", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarAuto(String Numero_de_chasis) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from AUTOMOTOR where numero_chasis='" + Numero_de_chasis + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente", "eliminado", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarEmpleado(String Documento) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from EMPLEADO where Documento='" + Documento + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente", "eliminado", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarCliente(String Documento) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from CLIENTE where documento='" + Documento + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente", "eliminado", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    //GUARDAR TODO EN ARRAYLIST
    public ArrayList<Sucursal> obtenerSucursales() {
        ArrayList<Sucursal> listaSucursal = new ArrayList<Sucursal>();
        Sucursal aux = new Sucursal();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * from SUCURSAL ORDER BY id_sucursal;";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                aux.setId_ciudad(rs.getInt("id_ciudad"));
                aux.setId_sucursal(rs.getInt("id_sucursal"));
                aux.setNombre(rs.getString("nombre"));
                listaSucursal.add(aux);
                aux = new Sucursal();
            }

            st.close();
            conexion.close();

        } catch (HeadlessException | SQLException e) {
        }
        return listaSucursal;
    }

    public ArrayList<Cargo> obtenerCargos() {
        ArrayList<Cargo> listaCargo = new ArrayList<Cargo>();
        Cargo aux = new Cargo();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * from CARGO ;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setIdCargo(rs.getInt("id_cargo"));
                aux.setNombreCargo(rs.getString("nombre_cargo"));
                listaCargo.add(aux);
                aux = new Cargo();
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaCargo;
    }

    public ArrayList<CiudadSucursal_Cliente> obtenerCiudad() {
        ArrayList<CiudadSucursal_Cliente> listaCiudadSucursal = new ArrayList<CiudadSucursal_Cliente>();
        CiudadSucursal_Cliente aux = new CiudadSucursal_Cliente();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * from  CIUDAD_SUCURSAL ORDER BY id_ciudad;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setIdCiudad(rs.getInt("id_ciudad"));
                aux.setNombre(rs.getString("nombre_ciudad"));
                listaCiudadSucursal.add(aux);
                aux = new CiudadSucursal_Cliente();
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaCiudadSucursal;
    }

    public ArrayList<TipoAutomotor> obtenerTipo() {
        ArrayList<TipoAutomotor> listaTipoAutomotor = new ArrayList<TipoAutomotor>();
        TipoAutomotor aux = new TipoAutomotor();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * from  tipo;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setId_tipo(rs.getInt("id_tipo"));
                aux.setNombre_tipo(rs.getString("nombre_tipo"));
                listaTipoAutomotor.add(aux);
                aux = new TipoAutomotor();
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaTipoAutomotor;
    }

    public ArrayList<LineaAutomotor> obtenerLinea() {
        ArrayList<LineaAutomotor> listaLineaAutomotor = new ArrayList<LineaAutomotor>();
        LineaAutomotor aux = new LineaAutomotor();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * from  linea;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setId_linea(rs.getInt("id_linea"));
                aux.setNombre_linea(rs.getString("nombre_linea"));
                listaLineaAutomotor.add(aux);
                aux = new LineaAutomotor();
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaLineaAutomotor;
    }

    public ArrayList<ModeloAutomotor> obtenerModelo() {
        ArrayList<ModeloAutomotor> listaModeloAutomotor = new ArrayList<ModeloAutomotor>();
        ModeloAutomotor aux = new ModeloAutomotor();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * from  modelo;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setId_modelo(rs.getInt("id_modelo"));
                aux.setNombre_modelo(rs.getString("nombre_modelo"));
                listaModeloAutomotor.add(aux);
                aux = new ModeloAutomotor();
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaModeloAutomotor;
    }

    public ArrayList<ColorAutomotor> obtenerColor() {
        ArrayList<ColorAutomotor> listaColorAutomotor = new ArrayList<ColorAutomotor>();
        ColorAutomotor aux = new ColorAutomotor();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * from  color;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setId_color(rs.getInt("id_color"));
                aux.setNombre_color(rs.getString("nombre_color"));
                listaColorAutomotor.add(aux);
                aux = new ColorAutomotor();
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaColorAutomotor;
    }

    public ArrayList<Cliente> obtenerCliente() {
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        Cliente aux = new Cliente();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * from  cliente;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setId_ciudad(rs.getInt("id_ciudad"));
                aux.setId_sucursal(rs.getInt("id_sucursal"));
                aux.setDocumento(rs.getInt("documento"));
                aux.setNombre(rs.getString("nombre"));
                aux.setFecha_inicio(rs.getString("fecha_inicio"));
                listaClientes.add(aux);
                aux = new Cliente();
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaClientes;
    }

    public ArrayList<Empleado> obtenerEmpleado() {
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        Empleado aux = new Empleado();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * from  empleado ORDER BY documento;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setId_cargo(rs.getInt("id_cargo"));
                aux.setId_sucursal(rs.getInt("id_sucursal"));
                aux.setDocumento(rs.getInt("documento"));
                aux.setCodigo(rs.getInt("codigo"));
                aux.setSalario(rs.getInt("salario"));
                aux.setFecha_ingreso(rs.getString("fecha_ingreso"));
                aux.setFecha_nacimineto(rs.getString("fecha_nacimiento"));
                aux.setFecha_salida(rs.getString("fecha_salida"));
                aux.setNombre(rs.getString("nombre"));
                listaEmpleados.add(aux);
                aux = new Empleado();
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaEmpleados;
    }

    public ArrayList<Automotor> obtenerAutomotoresDisponiblesVenta() {
        ArrayList<Automotor> listaAutomotor = new ArrayList<Automotor>();
        Automotor aux = new Automotor();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * from  automotor WHERE id_venta IS null;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setNumero_chasis(rs.getInt("numero_chasis"));
                aux.setPrecio(rs.getInt("precio"));
                aux.setId_interno(rs.getInt("id_interno"));
                aux.setId_venta(rs.getInt("id_venta"));
                aux.setId_sucursal(rs.getInt("id_sucursal"));
                aux.setId_tipo(rs.getInt("id_tipo"));
                aux.setId_linea(rs.getInt("id_linea"));
                aux.setId_modelo(rs.getInt("id_modelo"));
                aux.setId_marca(rs.getInt("id_marca"));
                aux.setId_color(rs.getInt("id_color"));
                aux.setPlaca(rs.getString("placa"));
                aux.setFecha_entrada(rs.getString("fecha_entrada"));
                aux.setFecha_salida(rs.getString("fecha_salida"));
                listaAutomotor.add(aux);
                aux = new Automotor();
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaAutomotor;
    }

    public ArrayList<Marca> obtenerMarca() {
        ArrayList<Marca> listaMarca = new ArrayList<Marca>();
        Marca aux = new Marca();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * from  marca;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setId_marca(rs.getInt("id_marca"));
                aux.setNombre_marca(rs.getString("nombre_marca"));
                listaMarca.add(aux);
                aux = new Marca();
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaMarca;
    }

    public ArrayList<Automotor> obtenerAutomotorPorIdSucursal(String id_sucursal) {
        ArrayList<Automotor> listaAutomotorPorIdSucursal = new ArrayList<Automotor>();
        Automotor aux = new Automotor();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT DISTINCT automotor.* \n"
                    + "FROM automotor INNER JOIN sucursal\n"
                    + "ON \n"
                    + "automotor.id_sucursal = sucursal.id_sucursal INNER JOIN empleado\n"
                    + "ON \n"
                    + "sucursal.id_sucursal = empleado.id_sucursal \n"
                    + "WHERE sucursal.id_sucursal = '" + id_sucursal + "' AND automotor.id_venta IS null"
                    + "  ORDER BY numero_chasis ASC;";
            System.out.println("la consulta de automotores es : " + sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setNumero_chasis(rs.getInt("numero_chasis"));
                aux.setPrecio(rs.getInt("precio"));
                aux.setId_interno(rs.getInt("id_interno"));
                aux.setId_venta(rs.getInt("id_venta"));
                aux.setId_sucursal(rs.getInt("id_sucursal"));
                aux.setId_tipo(rs.getInt("id_tipo"));
                aux.setId_linea(rs.getInt("id_linea"));
                aux.setId_modelo(rs.getInt("id_modelo"));
                aux.setId_marca(rs.getInt("id_marca"));
                aux.setId_color(rs.getInt("id_color"));
                aux.setPlaca(rs.getString("placa"));
                aux.setFecha_entrada(rs.getString("fecha_entrada"));
                aux.setFecha_salida(rs.getString("fecha_salida"));
                listaAutomotorPorIdSucursal.add(aux);
                aux = new Automotor();
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaAutomotorPorIdSucursal;
    }

    //CONSULTAS
    public ArrayList<RepCliNueNac> obtenerRepCliNueNac(String año, String mes) {
        ArrayList<RepCliNueNac> listaRepCliNueNac = new ArrayList<RepCliNueNac>();
        RepCliNueNac aux = new RepCliNueNac();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT cliente.*\n"
                    + "FROM cliente INNER JOIN SUCURSAL\n"
                    + "ON (cliente.id_sucursal = sucursal.id_sucursal)\n"
                    + "WHERE \n"
                    + "(EXTRACT(year FROM fecha_inicio) = " + año + ")\n"
                    + "AND\n"
                    + "(EXTRACT(month FROM fecha_inicio) = " + mes + ")\n"
                    + ";";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setDocumento(rs.getInt("documento"));
                aux.setFecha_inicio(rs.getString("fecha_inicio"));
                aux.setId_ciudad(rs.getInt("id_ciudad"));
                aux.setId_sucursal(rs.getInt("id_sucursal"));
                aux.setNombre(rs.getString("nombre"));
                listaRepCliNueNac.add(aux);
                aux = new RepCliNueNac();
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaRepCliNueNac;
    }

    public String obtenerCantidadRepCliNueNac(String año, String mes) {
        int cantidad = 0;
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT COUNT(*) AS cantidad \n"
                    + "FROM cliente INNER JOIN SUCURSAL\n"
                    + "ON (cliente.id_sucursal = sucursal.id_sucursal)\n"
                    + "WHERE \n"
                    + "(EXTRACT(year FROM fecha_inicio) = " + año + ")\n"
                    + "AND\n"
                    + "(EXTRACT(month FROM fecha_inicio) = " + mes + ")\n"
                    + ";";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cantidad = rs.getInt("cantidad");
            }

            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return cantidad + "";
    }

    public ArrayList<RepMarAutMasVendAnuSuc> obtenerRepMarAutMasVendAnuSuc(String año_salida, String id_sucursal) {
        ArrayList<RepMarAutMasVendAnuSuc> listaRepMarAutMasVendAnuSuc = new ArrayList<RepMarAutMasVendAnuSuc>();
        RepMarAutMasVendAnuSuc aux = new RepMarAutMasVendAnuSuc();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * FROM\n"
                    + "((SELECT \n"
                    + "    marca.nombre_marca, \n"
                    + "    automotor.id_marca, \n"
                    + "    COUNT(automotor.id_marca) AS cantidad,\n"
                    + " 	'Nuevo' AS estatus\n"
                    + "FROM marca\n"
                    + "JOIN automotor ON marca.id_marca = automotor.id_marca\n"
                    + "JOIN venta ON automotor.id_venta = venta.id_venta\n"
                    + "JOIN sucursal ON automotor.id_sucursal = sucursal.id_sucursal\n"
                    + "WHERE (EXTRACT(year FROM fecha_salida) = " + año_salida + " )\n"
                    + "AND (sucursal.id_sucursal = " + id_sucursal + " )\n"
                    + "AND placa IS null\n"
                    + "GROUP BY marca.nombre_marca, automotor.id_marca\n"
                    + "ORDER BY cantidad DESC\n"
                    + "LIMIT 1)\n"
                    + "UNION\n"
                    + "(SELECT \n"
                    + "    marca.nombre_marca, \n"
                    + "    automotor.id_marca, \n"
                    + "    COUNT(automotor.id_marca) AS cantidad,\n"
                    + " 	'Segunda' AS estatus\n"
                    + "FROM marca\n"
                    + "JOIN automotor ON marca.id_marca = automotor.id_marca\n"
                    + "JOIN venta ON automotor.id_venta = venta.id_venta\n"
                    + "JOIN sucursal ON automotor.id_sucursal = sucursal.id_sucursal\n"
                    + "WHERE (EXTRACT(year FROM fecha_salida) = " + año_salida + " )\n"
                    + "AND (sucursal.id_sucursal = " + id_sucursal + " )\n"
                    + "AND  id_interno IS null\n"
                    + "GROUP BY marca.nombre_marca, automotor.id_marca\n"
                    + "ORDER BY cantidad DESC\n"
                    + "LIMIT 1)\n"
                    + ") MasVendidos;";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setCantidad(rs.getInt("cantidad"));
                aux.setId_marca(rs.getInt("id_marca"));
                aux.setNombre_marca(rs.getString("nombre_marca"));
                aux.setEstatus(rs.getString("estatus"));
                listaRepMarAutMasVendAnuSuc.add(aux);
                aux = new RepMarAutMasVendAnuSuc();

            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaRepMarAutMasVendAnuSuc;
    }

    public ArrayList<RepMarAutMasVendAnuSuc> obtenerRepMarAutMasVendMensSuc(String año_salida, String id_sucursal, String mes) {
        ArrayList<RepMarAutMasVendAnuSuc> listaRepMarAutMasVendMensSuc = new ArrayList<RepMarAutMasVendAnuSuc>();
        RepMarAutMasVendAnuSuc aux = new RepMarAutMasVendAnuSuc();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * FROM\n"
                    + "((SELECT \n"
                    + "    marca.nombre_marca, \n"
                    + "    automotor.id_marca, \n"
                    + "    COUNT(automotor.id_marca) AS cantidad,\n"
                    + " 	'Nuevo' AS estatus\n"
                    + "FROM marca\n"
                    + "JOIN automotor ON marca.id_marca = automotor.id_marca\n"
                    + "JOIN venta ON automotor.id_venta = venta.id_venta\n"
                    + "JOIN sucursal ON automotor.id_sucursal = sucursal.id_sucursal\n"
                    + "WHERE (EXTRACT(year FROM fecha_salida) =  " + año_salida + " )\n"
                    + "AND (EXTRACT(month FROM fecha_salida) = " + mes + " )\n"
                    + "AND (sucursal.id_sucursal =  " + id_sucursal + " )\n"
                    + "AND placa IS null\n"
                    + "GROUP BY marca.nombre_marca, automotor.id_marca\n"
                    + "ORDER BY cantidad DESC\n"
                    + "LIMIT 1)\n"
                    + "UNION\n"
                    + "(SELECT \n"
                    + "    marca.nombre_marca, \n"
                    + "    automotor.id_marca, \n"
                    + "    COUNT(automotor.id_marca) AS cantidad,\n"
                    + " 	'Segunda' AS estatus\n"
                    + "FROM marca\n"
                    + "JOIN automotor ON marca.id_marca = automotor.id_marca\n"
                    + "JOIN venta ON automotor.id_venta = venta.id_venta\n"
                    + "JOIN sucursal ON automotor.id_sucursal = sucursal.id_sucursal\n"
                    + "WHERE (EXTRACT(year FROM fecha_salida) =  " + año_salida + " )\n"
                    + "AND (EXTRACT(month FROM fecha_salida) = " + mes + "  )\n"
                    + "AND (sucursal.id_sucursal = " + id_sucursal + ")\n"
                    + "AND  id_interno IS null\n"
                    + "GROUP BY marca.nombre_marca, automotor.id_marca\n"
                    + "ORDER BY cantidad DESC\n"
                    + "LIMIT 1)\n"
                    + ") MasVendidos;";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setCantidad(rs.getInt("cantidad"));
                aux.setId_marca(rs.getInt("id_marca"));
                aux.setNombre_marca(rs.getString("nombre_marca"));
                aux.setEstatus(rs.getString("estatus"));
                listaRepMarAutMasVendMensSuc.add(aux);
                aux = new RepMarAutMasVendAnuSuc();

            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaRepMarAutMasVendMensSuc;
    }

    public String ConvertirMesANumero(String mes) {
        String numMes = "";

        switch (mes) {
            case "Enero":
                numMes = 1 + "";
                break;
            case "Febrero":
                numMes = 2 + "";
                break;
            case "Marzo":
                numMes = 3 + "";
                break;
            case "Abril":
                numMes = 4 + "";
                break;
            case "Mayo":
                numMes = 5 + "";
                break;
            case "Junio":
                numMes = 6 + "";
                break;
            case "Julio":
                numMes = 7 + "";
                break;
            case "Agosto":
                numMes = 8 + "";
                break;
            case "Septiembre":
                numMes = 9 + "";
                break;
            case "Octubre":
                numMes = 10 + "";
                break;
            case "Noviembre":
                numMes = 11 + "";
                break;
            case "Diciembre":
                numMes = 12 + "";
                break;
            default:
                throw new AssertionError();
        }
        return numMes;
    }

    public ArrayList<RepClienNueMesSucur> obtenerRepClienNueMesSucur(String año_salida, String id_sucursal, String mes) {
        ArrayList<RepClienNueMesSucur> listaRepClienNueMesSucur = new ArrayList<RepClienNueMesSucur>();
        RepClienNueMesSucur aux = new RepClienNueMesSucur();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT cliente.documento , cliente.nombre , sucursal.nombre AS nombre_sucursal , cliente.fecha_inicio , cliente.id_ciudad , cliente.id_sucursal  \n"
                    + "FROM cliente INNER JOIN sucursal\n"
                    + "ON (cliente.id_sucursal = sucursal.id_sucursal)\n"
                    + "WHERE (EXTRACT(year FROM fecha_inicio) =  " + año_salida + " )\n"
                    + "AND (EXTRACT(month FROM fecha_inicio) = " + mes + " )  \n"
                    + "AND sucursal.id_sucursal =  " + id_sucursal + " \n"
                    + "GROUP BY sucursal.nombre , cliente.documento;";
            System.out.println(sql);

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setDocumento(rs.getInt("documento"));
                aux.setFecha_inicio(rs.getString("fecha_inicio"));
                aux.setId_ciudad(rs.getInt("id_ciudad"));
                aux.setId_sucursal(rs.getInt("id_sucursal"));
                aux.setNombre(rs.getString("nombre"));
                aux.setNombre_sucursal(rs.getString("nombre_sucursal"));
                listaRepClienNueMesSucur.add(aux);
                aux = new RepClienNueMesSucur();

            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
        }
        return listaRepClienNueMesSucur;
    }

    public ArrayList<RepMarcAutNuevMasVenMensSucur> obtenerRepMarcAutNuevMasVenMensSucur(String año_salida, String id_sucursal, String mes) {
        ArrayList<RepMarcAutNuevMasVenMensSucur> listaRepMarcAutNuevMasVenMensSucur = new ArrayList<RepMarcAutNuevMasVenMensSucur>();
        RepMarcAutNuevMasVenMensSucur aux = new RepMarcAutNuevMasVenMensSucur();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "WITH MarcasPorSucursal AS (\n"
                    + "    SELECT\n"
                    + "        sucursal.id_sucursal,\n"
                    + "        sucursal.nombre AS nombre_sucursal,\n"
                    + "        marca.nombre_marca,\n"
                    + "        COUNT(automotor.id_marca) AS cantidad_comprados,\n"
                    + "        ROW_NUMBER() OVER (PARTITION BY sucursal.id_sucursal ORDER BY COUNT(automotor.id_marca) DESC) AS ranking\n"
                    + "    FROM\n"
                    + "        sucursal\n"
                    + "    JOIN automotor ON sucursal.id_sucursal = automotor.id_sucursal\n"
                    + "    JOIN venta ON automotor.id_venta = venta.id_venta\n"
                    + "    JOIN marca ON automotor.id_marca = marca.id_marca\n"
                    + "    WHERE\n"
                    + "        EXTRACT(year FROM venta.fecha_venta) = " + año_salida + "  \n"
                    + "        AND EXTRACT(month FROM venta.fecha_venta) = " + mes + " \n"
                    + "	 AND automotor.id_sucursal = " + id_sucursal + " \n "
                    + "	AND placa IS null\n"
                    + "    GROUP BY\n"
                    + "        sucursal.id_sucursal,\n"
                    + "        sucursal.nombre,\n"
                    + "        marca.nombre_marca\n"
                    + ")\n"
                    + "SELECT\n"
                    + "    nombre_sucursal,\n"
                    + "    nombre_marca,\n"
                    + "    cantidad_comprados\n"
                    + "FROM\n"
                    + "    MarcasPorSucursal\n"
                    + "WHERE\n"
                    + "    ranking = 1\n"
                    + "ORDER BY\n"
                    + "    nombre_sucursal;";
            //System.out.println(sql);

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setCantidad_comprados(rs.getInt("cantidad_comprados"));
                aux.setNombre_marca(rs.getString("nombre_marca"));
                aux.setNombre_sucursal(rs.getString("nombre_sucursal"));
                listaRepMarcAutNuevMasVenMensSucur.add(aux);
                aux = new RepMarcAutNuevMasVenMensSucur();

            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("el erroer es   " + e.getMessage());
        }
        return listaRepMarcAutNuevMasVenMensSucur;
    }

    public ArrayList<RepMarcAutNuevMasVenMensSucur> obtenerRepMarcAutNuevMasVenMensNacio(String año_salida, String mes) {
        ArrayList<RepMarcAutNuevMasVenMensSucur> listaRepMarcAutNuevMasVenMensSucur = new ArrayList<RepMarcAutNuevMasVenMensSucur>();
        RepMarcAutNuevMasVenMensSucur aux = new RepMarcAutNuevMasVenMensSucur();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "WITH MarcasPorSucursal AS (\n"
                    + "    SELECT\n"
                    + "        sucursal.id_sucursal,\n"
                    + "        sucursal.nombre AS nombre_sucursal,\n"
                    + "        marca.nombre_marca,\n"
                    + "        COUNT(automotor.id_marca) AS cantidad_comprados,\n"
                    + "        ROW_NUMBER() OVER (PARTITION BY sucursal.id_sucursal ORDER BY COUNT(automotor.id_marca) DESC) AS ranking\n"
                    + "    FROM\n"
                    + "        sucursal\n"
                    + "    JOIN automotor ON sucursal.id_sucursal = automotor.id_sucursal\n"
                    + "    JOIN venta ON automotor.id_venta = venta.id_venta\n"
                    + "    JOIN marca ON automotor.id_marca = marca.id_marca\n"
                    + "    WHERE\n"
                    + "        EXTRACT(year FROM venta.fecha_venta) = " + año_salida + "  \n"
                    + "        AND EXTRACT(month FROM venta.fecha_venta) = " + mes + " \n"
                    + "	AND placa IS null\n"
                    + "    GROUP BY\n"
                    + "        sucursal.id_sucursal,\n"
                    + "        sucursal.nombre,\n"
                    + "        marca.nombre_marca\n"
                    + ")\n"
                    + "SELECT\n"
                    + "    nombre_sucursal,\n"
                    + "    nombre_marca,\n"
                    + "    cantidad_comprados\n"
                    + "FROM\n"
                    + "    MarcasPorSucursal\n"
                    + "WHERE\n"
                    + "    ranking = 1\n"
                    + "ORDER BY\n"
                    + "    nombre_sucursal;";
            //System.out.println(sql);

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setCantidad_comprados(rs.getInt("cantidad_comprados"));
                aux.setNombre_marca(rs.getString("nombre_marca"));
                aux.setNombre_sucursal(rs.getString("nombre_sucursal"));
                listaRepMarcAutNuevMasVenMensSucur.add(aux);
                aux = new RepMarcAutNuevMasVenMensSucur();

            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("el erroer es   " + e.getMessage());
        }
        return listaRepMarcAutNuevMasVenMensSucur;
    }

    public ArrayList<RepEmpleados> obtenerRepEmpleados() {
        ArrayList<RepEmpleados> listaRepEmpleados = new ArrayList<RepEmpleados>();
        RepEmpleados aux = new RepEmpleados();
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "SELECT * FROM datos_empleados;";
            System.out.println(sql);

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aux.setCodigo(rs.getInt("codigo"));
                aux.setDocumento(rs.getInt("documento"));
                aux.setFecha_ingreso(rs.getString("fecha_ingreso"));
                aux.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                aux.setId_cargo(rs.getInt("id_cargo"));
                aux.setId_sucursal(rs.getInt("id_sucursal"));
                aux.setNombre_cargo(rs.getString("nombre_cargo"));
                aux.setNombre_empleado(rs.getString("nombre_empleado"));
                aux.setNombre_sucursal(rs.getString("nombre_sucursal"));
                aux.setSalario(rs.getInt("salario"));
                listaRepEmpleados.add(aux);
                aux = new RepEmpleados();

            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("el erroer es   " + e.getMessage());
        }
        return listaRepEmpleados;
    }
}
