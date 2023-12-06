/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GEtset;

/**
 *
 * @author HEIDER
 */
public class CiudadSucursal_Cliente {
    
   private int idCiudad;
   private String nombre;

    public CiudadSucursal_Cliente() {
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CiudadSucursal_Cliente(int idCiudad, String nombre) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
    }
    
}
