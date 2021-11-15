/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controlador.Cliente;
import Datos.DatosReserva;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jacques
 */
public class Reserva {
    protected DatosReserva datosReserva;
    protected Camping camping;
    
    public Reserva(DatosReserva _datos){
        datosReserva = _datos;
    }
    
   
    
}
