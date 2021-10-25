/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controlador.Cliente;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author EpicGames
 */
public class Camping {

    public static String usuario1 = "Anthony";
    public static String usuario2 = "Alex";
    public static String usuario3 = "Ana";
    public static String usuario4 = "Jacques";
    
    public static String contra = "123";
    
    //Variables
    private ArrayList<Actividad> actividades = new ArrayList<Actividad>();
    private ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    
    public Camping() {
    }
    
    public ArrayList consultarParcelas(){
        return parcelas;
    } 
    
    public Reserva reserva(String nombreApellidos, String dni, boolean luz, 
            Date fechaIni, Date fechaFin, ArrayList<Parcela> parcelasSeleccionadas,Cliente cliente){
        for(Parcela parcela: parcelasSeleccionadas){
            parcelas.remove(parcela);
        }
        Reserva reserva = new Reserva(fechaIni, fechaFin, parcelasSeleccionadas, cliente);
        reservas.add(reserva);
        
        return reserva;
    }
}
