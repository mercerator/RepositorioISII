/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Alex
 */
public class DatosParcela {
    public int identificador;
    public int metrosCuadrados;
    public boolean luz;
    public int precioDia;
    
    public DatosParcela(int identificador, int metrosCuadrados, boolean luz, int precioDia){
        this.identificador = identificador;
        this.metrosCuadrados = metrosCuadrados;
        this.luz = luz;
        this.precioDia = precioDia;
    }
}
