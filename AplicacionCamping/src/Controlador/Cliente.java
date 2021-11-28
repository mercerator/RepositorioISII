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

public class Cliente extends UsuarioRegistrado {
    
    private String nombreApellidos;
    private String telefono;
    private String correo;
    private String cp;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    private ArrayList<Tienda> tiendas = new ArrayList<Tienda>();
    
    public Cliente(String usuario, String contraseña, Camping camping, String nombreApellidos, String telefono, String correo, String cp) {
        super(usuario, contraseña, camping);
        this.nombreApellidos = nombreApellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.cp = cp;
        
    }

    //mejor reservas
    public DatosParcela consultarDatosParcela(Object parcela) {
        Parcela par = (Parcela) parcela;
        return par.consultarDatosParcela((ArrayList) parcela);
    }
     
    public ArrayList consultarParcelas() {
        return camping.cParcelas();
    }

    /*
    public ListaParcelas consultarParcelas() {
        return camping.consultarParcelas();
    }
    
     */
    public void realizarReserva(ArrayList<String> nombresTiendas, ArrayList<Integer> metrosTiendas, 
            ArrayList luzParcelas, ArrayList parcelasSeleccionadas, Date fechaIni, Date fechaFin){
        // Creamos y guardamos las tiendas de campanya
        for(int i = 0; i < nombresTiendas.size(); i++){
            tiendas.add(new Tienda(nombresTiendas.get(i), metrosTiendas.get(i)));
        }
        
        // Creamos y guardamos la reserva en cliente
        reservas.add(camping.realizarReserva((ArrayList<Parcela>)parcelasSeleccionadas, luzParcelas, fechaIni, fechaFin, this));
    }
    
    public Object devolverParcela(int identificador) {
        return camping.devolverParcela(identificador);
    }
}
