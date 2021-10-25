/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Datos.DatosParcela;

/**
 *
 * @author Alex
 */
public class Parcela {
    private int identificador;
    private int metrosCuadrados;
    private boolean luz;
    private int precioDia;
    
    public Parcela(int identificador, int metrosCuadrados, boolean luz, int precioDia){
        this.identificador = identificador;
        this.metrosCuadrados = metrosCuadrados;
        this.luz = luz;
        this.precioDia = precioDia;
    }
    
    public DatosParcela consultarDatosParcela(){
        DatosParcela datosParcela = new DatosParcela(this.identificador,
            this.metrosCuadrados, this.luz, this.precioDia);
        return datosParcela;
    }
}
