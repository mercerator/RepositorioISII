/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Controlador.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class ListasEventos {
    public ArrayList listaPiscina;
    public ArrayList listaFronton;
    public ArrayList listaClub;
    
    public ListasEventos(ArrayList<Cliente> listaPiscina, ArrayList<Cliente> listaFronton, ArrayList<Cliente> listaClub){
        this.listaPiscina = listaPiscina;
        this.listaFronton = listaFronton;
        this.listaClub = listaClub;
    }
}
