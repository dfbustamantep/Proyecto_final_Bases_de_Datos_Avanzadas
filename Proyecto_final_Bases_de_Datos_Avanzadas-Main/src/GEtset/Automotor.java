/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GEtset;

/**
 *
 * @author HEIDER
 */
public class Automotor {
private  String fecha_entrada;
private  String fecha_salida;
private  String placa;
private  int numero_chasis;
private  int precio;
private  int id_interno;
private  int id_venta;
private  int id_sucursal;
private  int id_tipo;
private  int id_linea;
private  int id_modelo;
private  int id_marca;
private  int id_color;

    public Automotor() {
    }

    public Automotor(String fecha_entrada, String fecha_salida, String placa, int numero_chasis, int precio, int id_interno, int id_venta, int id_sucursal, int id_tipo, int id_linea, int id_modelo, int id_marca, int id_color) {
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.placa = placa;
        this.numero_chasis = numero_chasis;
        this.precio = precio;
        this.id_interno = id_interno;
        this.id_venta = id_venta;
        this.id_sucursal = id_sucursal;
        this.id_tipo = id_tipo;
        this.id_linea = id_linea;
        this.id_modelo = id_modelo;
        this.id_marca = id_marca;
        this.id_color = id_color;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumero_chasis() {
        return numero_chasis;
    }

    public void setNumero_chasis(int numero_chasis) {
        this.numero_chasis = numero_chasis;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId_interno() {
        return id_interno;
    }

    public void setId_interno(int id_interno) {
        this.id_interno = id_interno;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getId_linea() {
        return id_linea;
    }

    public void setId_linea(int id_linea) {
        this.id_linea = id_linea;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public int getId_color() {
        return id_color;
    }

    public void setId_color(int id_color) {
        this.id_color = id_color;
    }

  


   
}
