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

    public String nombreApellidos;
    public String dni;
    public String nombreTiendas;
    public int metrosTienda;
    public Boolean luz;
    public Date fechaIni;
    public Date fechaFin;
    public ArrayList parcelasSeleccionadas = new ArrayList<>();

    public DatosReserva(String nombreApellidos, String dni, String nombresTiendas,
            int metrosTiendas, boolean luz, Date fechaIni, Date fechaFin, ArrayList parcelasSeleccionadas) {
        this.nombreApellidos = nombreApellidos;
        this.dni = dni;
        this.nombreTiendas = nombreTiendas;
        this.metrosTienda = metrosTienda;
        this.luz = luz;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.parcelasSeleccionadas = parcelasSeleccionadas;

    }

    public DatosReserva consultarDatosParcela(ArrayList<Parcela> parcelasDisponibles) {
        return new DatosReserva(nombreApellidos, dni, nombreTiendas, metrosTienda, luz, fechaIni, fechaFin, parcelasDisponibles);
    }
}
