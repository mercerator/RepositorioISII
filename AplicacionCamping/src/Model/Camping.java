/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controlador.Cliente;
import Controlador.Gerente;
import Controlador.UsuarioRegistrado;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author EpicGames
 */
public class Camping {
        
    //Variables
    protected ArrayList<UsuarioRegistrado> usuarios = new ArrayList<UsuarioRegistrado>();
    private ArrayList<Actividad> actividades = new ArrayList<Actividad>();
    private ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    private int descuento;
    
    public static final int ERROR = -1;
    public static final int ENCONTRADO = 1;
    public static final int SEGUIR = 0;
    
    public Camping() {
    }
    
    public void cargarDatos() throws Exception {
        Gerente per1 = new Gerente("Anthony","123",this);
        usuarios.add(per1);
        
        Gerente per2 = new Gerente("Alex","123",this);
        usuarios.add(per2);
        
        Gerente per3 = new Gerente("Ana","123",this);
        usuarios.add(per3);
        
        Gerente per4 = new Gerente("Jacques","123",this);
        usuarios.add(per4);
    }
    
    public UsuarioRegistrado login (String nombre, String contrasenya){
        UsuarioRegistrado usuario = null, usuarioEncontrado = null;
        int i = 0, resultado = SEGUIR;
        
        while (i< usuarios.size() && resultado != ERROR && resultado != ENCONTRADO){
            usuario = usuarios.get(i);
            resultado = usuario.validarUsuario(nombre, contrasenya);
            i++;
        }
        if (resultado == ENCONTRADO){
            usuarioEncontrado = usuario;
        }       
        
        return usuarioEncontrado;
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
    
    public void setDescuento(int descuento){
        this.descuento = descuento;
    }
    
    public int getDescuento(){
        return this.descuento;
    }
}
