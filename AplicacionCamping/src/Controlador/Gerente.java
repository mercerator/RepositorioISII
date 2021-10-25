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
public class Gerente extends UsuarioRegistrado{
    
    
    public Gerente(String usuario, String contrasenya, Camping camping){
        super(usuario, contrasenya, camping);
    }
    
    
}
