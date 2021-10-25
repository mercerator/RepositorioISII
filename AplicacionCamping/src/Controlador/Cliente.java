/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Camping;
import Model.Reserva;
import Model.Tienda;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Cliente extends UsuarioRegistrado{
    private ArrayList<Tienda> tiendas = new ArrayList<Tienda>();
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    private String nombreApellidos;
    private String dni;
    
    public Cliente(String usuario, Camping camping){
        super(usuario, null, camping);
    }
    
    
}
