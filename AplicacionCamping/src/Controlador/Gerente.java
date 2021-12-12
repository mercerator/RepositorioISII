package Controlador;

import Datos.DatosParcela;
import Datos.DatosReserva;
import Datos.ListaParcelas;
import Datos.ListaReservas;
import Datos.ListasEventos;
import Model.Camping;
import Model.Parcela;
import Model.Reserva;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jacques
 */
public class Gerente extends UsuarioRegistrado {

    protected Reserva reservaAct;
    protected int i;

    public Gerente(String usuario, String contrasenya, Camping camping) {
        super(usuario, contrasenya, camping);
    }


    public void setDescuento(int descuento) {
        camping.setDescuento(descuento);
    }
    
    public int getDescuento(){
        return camping.getDescuento();
    }

    
    public Object devolverParcelas() {
        return camping.devolverParcela(i);
    }
    
    public ListaParcelas consultarParcela() {
        return camping.consultarParcelas();
    }

    public ArrayList consultarReserva() {
        return camping.consultarReserva();
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasenya() {
        return contrasenya;
    }
    
    public ListasEventos listasEventos(){
        return camping.listasEventos();
    }
    
    public DatosReserva datosReserva(Object reserva){
        reservaAct = (Reserva)reserva;
        return reservaAct.getDatosReserva();
    }
    
    public void actualizarFechaReserva(Date fechaEntrada, Date fechaSalida){
        reservaAct.setFechaIni(fechaEntrada);
        reservaAct.setFechaFin(fechaSalida);
        camping.actualizarFechaReserva(reservaAct, fechaEntrada, fechaSalida);
    }
    
    public int getPrecioReserva(){
        return reservaAct.getPrecioReserva();
    }
    
    public double getPrecioTotal(){
        return reservaAct.getPrecioTotal(this.getDescuento());
    }
    
    public double getDias(){
        return reservaAct.getDias();
    }
    public void tramitarReserva(){
        camping.tramitarReserva(reservaAct);
        reservaAct = null;
    }
    
    public void sancionarClienteFronton(Object cliente){
        Cliente c = (Cliente)cliente;
        c.setSancion(true);
        camping.sancionarClienteFronton(c);
    }
    
    public void sancionarClientePiscina(Object cliente){
        Cliente c = (Cliente)cliente;
        c.setSancion(true);
        camping.sancionarClientePiscina(c);
    }
    
    public void sancionarClienteClub(Object cliente){
        Cliente c = (Cliente)cliente;
        c.setSancion(true);
        camping.sancionarClienteClub(c);
    }
}
