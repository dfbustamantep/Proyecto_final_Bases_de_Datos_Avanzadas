/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GEtset;

/**
 *
 * @author heide
 */
public class RepEmpleados {
private String nombre_sucursal;
private String nombre_cargo;
private String nombre_empleado;
private String fecha_ingreso;
private String fecha_nacimiento;
private int documento;
private int  salario;
private int  codigo;
private int id_sucursal;
private int  id_cargo;

    public RepEmpleados(String nombre_sucursal, String nombre_cargo, String nombre_empleado, String fecha_ingreso, String fecha_nacimiento, int documento, int salario, int codigo, int id_sucursal, int id_cargo) {
        this.nombre_sucursal = nombre_sucursal;
        this.nombre_cargo = nombre_cargo;
        this.nombre_empleado = nombre_empleado;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_nacimiento = fecha_nacimiento;
        this.documento = documento;
        this.salario = salario;
        this.codigo = codigo;
        this.id_sucursal = id_sucursal;
        this.id_cargo = id_cargo;
    }

    public RepEmpleados() {
    }

    public String getNombre_sucursal() {
        return nombre_sucursal;
    }

    public void setNombre_sucursal(String nombre_sucursal) {
        this.nombre_sucursal = nombre_sucursal;
    }

    public String getNombre_cargo() {
        return nombre_cargo;
    }

    public void setNombre_cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

}
