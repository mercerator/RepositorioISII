/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alex
 */
public class Reserva {
    private Date fechaIni;
    private Date fechaFin;
    private ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
    
    public Reserva(Date fechaIni, Date fechaFin, ArrayList<Parcela> parcelas){
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.parcelas = parcelas;
    }
}
