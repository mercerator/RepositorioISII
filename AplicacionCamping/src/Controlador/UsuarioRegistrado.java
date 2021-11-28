/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Camping;
import static Model.Camping.ENCONTRADO;
import static Model.Camping.ERROR;
import static Model.Camping.SEGUIR;

/**
 *
 * @author Jacques
 */
public class UsuarioRegistrado {

    private String nombre;
    private String contrasenya;
    protected Camping camping;

    public UsuarioRegistrado(String nombre, String contrasenya, Camping camping) {
        this.nombre = nombre;
        this.contrasenya = contrasenya;
        this.camping = camping;
    }

    public int validarUsuario(String nombre, String contrasenya) {
        int resultado = SEGUIR;

        if (nombre.equals(this.nombre) && contrasenya.equals(this.contrasenya)) {
            resultado = ENCONTRADO;
        } else if (nombre.equals(this.nombre)) {
            resultado = ERROR;
        }

        return resultado;
    }

    public int validarGerente(String nombre, String contrasenya) {
        int resultado = SEGUIR;

        if (nombre.equals(this.nombre) && contrasenya.equals(this.contrasenya)) {
            resultado = ENCONTRADO;
        } else if (nombre.equals(this.nombre)) {
            resultado = ERROR;
        }

        return resultado;
    }

    public int validarCliente(String nombre, String contrasenya) {
        int resultado = SEGUIR;

        if (nombre.equals(this.nombre) && contrasenya.equals(this.contrasenya)) {
            resultado = ENCONTRADO;
        } else if (nombre.equals(this.nombre)) {
            resultado = ERROR;
        }

        return resultado;
    }
}
