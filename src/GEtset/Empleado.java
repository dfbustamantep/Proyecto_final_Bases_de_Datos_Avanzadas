/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GEtset;

/**
 *
 * @author HEIDER
 */
public class Empleado {
private  String nombre;
private  String fecha_nacimineto;
private  String fecha_ingreso;
private  String fecha_salida;
private  int documento;
private  int codigo;
private  int salario;
private  int id_sucursal;
private  int id_cargo;

    public Empleado(String nombre, String fecha_nacimineto, String fecha_ingreso, String fecha_salida, int documento, int codigo, int salario, int id_sucursal, int id_cargo) {
        this.nombre = nombre;
        this.fecha_nacimineto = fecha_nacimineto;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.documento = documento;
        this.codigo = codigo;
        this.salario = salario;
        this.id_sucursal = id_sucursal;
        this.id_cargo = id_cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nacimineto() {
        return fecha_nacimineto;
    }

    public void setFecha_nacimineto(String fecha_nacimineto) {
        this.fecha_nacimineto = fecha_nacimineto;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
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

    public Empleado() {
    }



}
