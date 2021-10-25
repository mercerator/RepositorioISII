/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Alex
 */
public class Historico {
    private Date fechaEntrada;
    private Date fechaSalida;
    private int precioTotal;
    
    public Historico(Date fechaEntrada, Date fechaSalida, int precioTotal){
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.precioTotal = precioTotal;
    }
}
