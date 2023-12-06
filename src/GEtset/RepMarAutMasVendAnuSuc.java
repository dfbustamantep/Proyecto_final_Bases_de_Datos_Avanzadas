/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GEtset;

/**
 *
 * @author heide
 */
public class RepMarAutMasVendAnuSuc {    
    private String nombre_marca;
    private String estatus;
    private int id_marca;
    private int cantidad;
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }



    public String getNombre_marca() {
        return nombre_marca;
    }

    public RepMarAutMasVendAnuSuc(String nombre_marca, String estatus, int id_marca, int cantidad) {
        this.nombre_marca = nombre_marca;
        this.estatus = estatus;
        this.id_marca = id_marca;
        this.cantidad = cantidad;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public RepMarAutMasVendAnuSuc(String nombre_marca, int id_marca, int cantidad) {
        this.nombre_marca = nombre_marca;
        this.id_marca = id_marca;
        this.cantidad = cantidad;
    }

    public RepMarAutMasVendAnuSuc() {
    }
}
