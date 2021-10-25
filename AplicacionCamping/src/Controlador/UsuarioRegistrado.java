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
public class UsuarioRegistrado {
    private String usuario;
    private String contrasenya;
    protected Camping camping;
    
    public UsuarioRegistrado(String usuario, String contrasenya, Camping camping){
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.camping = camping;
    }
    
    public boolean validarGerente(String usuario, String contrasenya){
        boolean resultado = false;
        
        if(usuario.equals(this.usuario) && contrasenya.equals(this.contrasenya)){
            resultado = true;
        }
        
        return resultado;
    }
    
    public boolean validarCliente(String usuario){
        boolean resultado = false;
        
        if(usuario.equals(this.usuario)){
            resultado = true;
        }
        
        return resultado;
    }
}
