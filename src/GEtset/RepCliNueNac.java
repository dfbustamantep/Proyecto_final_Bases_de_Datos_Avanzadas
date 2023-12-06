/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GEtset;

/**
 *
 * @author heide
 */
public class RepCliNueNac {
    private int documento;
    private int id_ciudad;
    private int id_sucursal;
    private String nombre;    
    private String fecha_inicio;

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public RepCliNueNac(int documento, int id_ciudad, int id_sucursal, String nombre, String fecha_inicio) {
        this.documento = documento;
        this.id_ciudad = id_ciudad;
        this.id_sucursal = id_sucursal;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
    }

    public RepCliNueNac() {
    }
    
    
    
}
