/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Alex
 */
public class Tienda {
    
    private int id_tienda;
    private String nombre;
    private int metrosCuadrados;
    
    public Tienda(int id, String nombre, int metrosCuadrados){
        this.id_tienda = id;
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "" + nombre + "" + metrosCuadrados;
    }

    public int getId_tienda() {
        return id_tienda;
    }
    
}
