/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.DatosParcela;
import Model.Camping;
import Model.Parcela;
import Model.Reserva;
import Model.Tienda;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alexandra
 */
public class Cliente extends UsuarioRegistrado{
    private ArrayList<Tienda> tiendas = new ArrayList<Tienda>();
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    private String nombreApellidos;
    private String dni;
    
    public Cliente(String usuario, Camping camping){
        super(usuario, null, camping);
    }
    
    public DatosParcela consultarDatosParcela(Object parcela){
        Parcela par = (Parcela)parcela;
        return par.consultarDatosParcela();
    }
    
    public ArrayList consultarParcelas(){
        return camping.consultarParcelas();
    }
    
    public void reserva(String nombreApellidos, String dni, ArrayList<String> nombresTiendas, 
            ArrayList<Integer> metrosTiendas, boolean luz, Date fechaIni, Date fechaFin, ArrayList parcelasSeleccionadas){
        Reserva reserva = camping.reserva(nombreApellidos, dni, luz, fechaIni, 
                fechaFin, (ArrayList<Parcela>) parcelasSeleccionadas, this);
        reservas.add(reserva);
        for(int i = 0; i < nombresTiendas.size(); i++){
            Tienda tienda = new Tienda(nombresTiendas.get(i), metrosTiendas.get(i));
            tiendas.add(tienda);
        }
    }
}
