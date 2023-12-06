/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GEtset;

/**
 *
 * @author heide
 */
public class RepClienNueMesSucur {
private int documento;
private String nombre;
private String nombre_sucursal;
private String fecha_inicio;
private int id_ciudad;
private int id_sucursal;

    public RepClienNueMesSucur(int documento, String nombre, String nombre_sucursal, String fecha_inicio, int id_ciudad, int id_sucursal) {
        this.documento = documento;
        this.nombre = nombre;
        this.nombre_sucursal = nombre_sucursal;
        this.fecha_inicio = fecha_inicio;
        this.id_ciudad = id_ciudad;
        this.id_sucursal = id_sucursal;
    }

    public RepClienNueMesSucur() {
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_sucursal() {
        return nombre_sucursal;
    }

    public void setNombre_sucursal(String nombre_sucursal) {
        this.nombre_sucursal = nombre_sucursal;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }




}
