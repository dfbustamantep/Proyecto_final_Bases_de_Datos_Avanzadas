/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GEtset;

/**
 *
 * @author DBustamanteP
 */
public class Sucursal {
    private  int id_sucursal;
    private  int id_ciudad;
    private  String nombre;

    public Sucursal() {
    }

    public Sucursal(int id_sucursal, int id_ciudad, String nombre) {
        this.id_sucursal = id_sucursal;
        this.id_ciudad = id_ciudad;
        this.nombre = nombre;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    
     
    
}
