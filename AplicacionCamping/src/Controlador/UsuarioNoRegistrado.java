/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Camping;

/**
 *
 * @author Alex
 */
public class UsuarioNoRegistrado {
    private Camping camping;
    
    public UsuarioNoRegistrado(Camping camping){
        this.camping = camping;
    }
    
    public Cliente altaCliente(String usuario, String contraseña){
        return new Cliente(usuario, contraseña, camping);
    }
}
