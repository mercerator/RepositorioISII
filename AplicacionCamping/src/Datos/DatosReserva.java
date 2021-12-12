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
    // Datos cliente
    public String nombreApellidos;
    public String dni;
    public String telefono;
    public String correo;
    public String cp;
    
    // Datos reserva
    public int id;
    public Date fechaIni;
    public Date fechaFin;
    public ArrayList parcelasSeleccionadas = new ArrayList<>();
    public ArrayList<Integer> precioParcelas = new ArrayList<Integer>();

    public DatosReserva(int id, Date fechaIni, Date fechaFin, ArrayList<Parcela> parcelasSeleccionadas, 
            String nombreApellidos, String dni, String telefono, String correo, String cp) {
        this.nombreApellidos = nombreApellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.cp = cp;
        this.id = id;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.parcelasSeleccionadas = parcelasSeleccionadas;
        
        for(Parcela p: parcelasSeleccionadas){
            precioParcelas.add(p.getPrecioDia());
        }

    }

    public DatosReserva consultarDatosParcela(ArrayList<Parcela> parcelasDisponibles) {
        return new DatosReserva(id, fechaIni, fechaFin, parcelasDisponibles, nombreApellidos, dni, telefono, correo, cp);
    }
}
