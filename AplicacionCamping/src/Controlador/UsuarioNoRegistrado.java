/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Camping;
import Model.Parcela;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class UsuarioNoRegistrado {
    private Camping camping;
    
    public UsuarioNoRegistrado(Camping camping){
        this.camping = camping;
    }
    
    public Cliente altaCliente(String usuario, String contraseña, String nombreApellidos, String telefono, String correo, String cp){
        return camping.altaCliente(usuario, contraseña, nombreApellidos, telefono, correo, cp);
    }
    
    public ArrayList parcelasAsignadas(){
        return camping.parcelasAsignadas();
    }
    
    public Object devolverParcela(int identificador) {
        return camping.devolverParcela(identificador);
    }
    
    public boolean tamanyoCorrecto(Object parcela, int tamanyo){
        Parcela p = (Parcela)parcela;
        return p.tamanyoCorrecto(tamanyo);
    }
}
