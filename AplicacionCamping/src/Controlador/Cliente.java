/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.DatosParcela;
import Datos.DatosReserva;
import Model.Camping;
import Model.Evento;
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
    private ArrayList<Evento> eventos = new ArrayList<Evento>();
    private Reserva reservaAct;
    private boolean sancionado = false;
    
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
    public void guardarClienteBD(){
        camping.guardarClienteBD(this);
    }
    public void realizarReserva(ArrayList<String> nombresTiendas, ArrayList<Integer> metrosTiendas, 
            ArrayList luzParcelas, ArrayList parcelasSeleccionadas, Date fechaIni, Date fechaFin){
        // Creamos y guardamos las tiendas de campanya
        tiendas = camping.crearTiendas(nombresTiendas, metrosTiendas);
        
        // Creamos y guardamos la reserva en cliente
        reservas.add(camping.realizarReserva((ArrayList<Parcela>)parcelasSeleccionadas, fechaIni, fechaFin, this));
    }
    
    public Object devolverParcela(int identificador) {
        return camping.devolverParcela(identificador);
    }
    
    public ArrayList getReservas(){
        return reservas;
    }
    
    public ArrayList getEventos(){
        return eventos;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCp() {
        return cp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasenya() {
        return contrasenya;
    }
    
    public boolean tamanyoCorrecto(Object parcela, int tamanyo){
        Parcela p = (Parcela)parcela;
        return p.tamanyoCorrecto(tamanyo);
    }
    
    public void actualizarFechaReserva(Date fechaEntrada, Date fechaSalida){
        for(Reserva aux: reservas){
            if(aux.getId() == reservaAct.getId()){
                aux.setFechaIni(fechaEntrada);
                aux.setFechaFin(fechaSalida);
                camping.actualizarFechaReserva(reservaAct, fechaEntrada, fechaSalida);
            }
        }
    }
    
    public DatosReserva getDatosReserva(Object reserva){
        reservaAct = (Reserva)reserva;
        return reservaAct.getDatosReserva();
    }
    
    public void eliminarReserva(){
        camping.eliminarReserva(reservaAct);
        reservas.remove(reservaAct);
        reservaAct = null;
    }
    
    public ArrayList parcelasAsignadas(){
        return camping.parcelasAsignadas();
    }
    
    public void unirseFronton(){
        camping.unirseFronton(this);
    }
    
    public void unirsePiscina(){
        camping.unirsePiscina(this);
    }
    
    public void unirseClub(){
        camping.unirseClub(this);
    }
    
    public void eliminarPiscina(){
        camping.eliminarPiscina(this);
    }
    
    public void eliminarFronton(){
        camping.eliminarFronton(this);
    }
        
    public void eliminarClub(){
        camping.eliminarClub(this);
    }
    
    public void tramitarReserva(Reserva reserva){
        reservas.remove(reserva);
    }
    
    public boolean getSancion(){
        return sancionado;
    }
    
    public void setSancion(boolean sancion){
        sancionado = sancion;
    }
    
    @Override
    public String toString(){
        return nombreApellidos;
    }
}
