/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Actividad {
    private String nombre;
    private String ganador;
    private ArrayList<String> participantes = new ArrayList<String>();
    
    public Actividad(String nombre){
        this.nombre = nombre;
    }
    
    public void setGanador(String ganador){
        this.ganador = ganador;
    }
    
    public void setParticipantes(ArrayList<String> participantes){
        this.participantes = participantes;
    }
    
    public void emparejar(){
        //por implementar
    }
}
