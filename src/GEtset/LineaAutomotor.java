/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GEtset;

/**
 *
 * @author HEIDER
 */
public class LineaAutomotor {
    private int id_linea;

    public LineaAutomotor() {
    }

    public int getId_linea() {
        return id_linea;
    }

    public void setId_linea(int id_linea) {
        this.id_linea = id_linea;
    }

    public String getNombre_linea() {
        return nombre_linea;
    }

    public void setNombre_linea(String nombre_linea) {
        this.nombre_linea = nombre_linea;
    }

    public LineaAutomotor(int id_linea, String nombre_linea) {
        this.id_linea = id_linea;
        this.nombre_linea = nombre_linea;
    }
    private String nombre_linea;
}
