/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Controlador.Cliente;
import Model.Parcela;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Epic
 */
public class DatosReserva {
    public Date fechaIni;
    public Date fechaFin;
    public ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
    public Cliente cliente;
    
    
     /**
    * Constructor de la Reserva con sus respectivos datos
    * @param fechaIni Date
    * @param fechaFin Date
    * @param parcelas ArrayList<Parcela>
    * @param cliente Cliente
    */
    public DatosReserva(Date fechaIni, Date fechaFin, ArrayList<Parcela> parcelas, Cliente cliente){
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.parcelas = parcelas;
        this.cliente = cliente;
    }
}
