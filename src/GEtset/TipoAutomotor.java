/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GEtset;

/**
 *
 * @author HEIDER
 */
public class TipoAutomotor {
    private int id_tipo;
    private String nombre_tipo;

    public TipoAutomotor() {
    }

    public TipoAutomotor(int id_tipo, String nombre_tipo) {
        this.id_tipo = id_tipo;
        this.nombre_tipo = nombre_tipo;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }
    
    
}
