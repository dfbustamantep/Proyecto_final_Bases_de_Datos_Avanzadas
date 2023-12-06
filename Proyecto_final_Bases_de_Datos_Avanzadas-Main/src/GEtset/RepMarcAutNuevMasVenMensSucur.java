/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GEtset;

/**
 *
 * @author heide
 */
public class RepMarcAutNuevMasVenMensSucur {
private String nombre_sucursal;
private String nombre_marca;
private int cantidad_comprados;

    public RepMarcAutNuevMasVenMensSucur(String nombre_sucursal, String nombre_marca, int cantidad_comprados) {
        this.nombre_sucursal = nombre_sucursal;
        this.nombre_marca = nombre_marca;
        this.cantidad_comprados = cantidad_comprados;
    }

    public RepMarcAutNuevMasVenMensSucur() {
    }

    public String getNombre_sucursal() {
        return nombre_sucursal;
    }

    public void setNombre_sucursal(String nombre_sucursal) {
        this.nombre_sucursal = nombre_sucursal;
    }

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public int getCantidad_comprados() {
        return cantidad_comprados;
    }

    public void setCantidad_comprados(int cantidad_comprados) {
        this.cantidad_comprados = cantidad_comprados;
    }


}