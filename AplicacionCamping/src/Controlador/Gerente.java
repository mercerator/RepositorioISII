
package Controlador;

import Datos.DatosParcela;
import Datos.ListaReservas;
import Model.Camping;
import java.util.ArrayList;

/**
 *
 * @author Jacques
 */
public class Gerente extends UsuarioRegistrado{
    
    
    public Gerente(String usuario, String contrasenya, Camping camping){
        super(usuario, contrasenya, camping);
    }
    
    public void setDescuento(int descuento){
        camping.setDescuento(descuento);
    }
    
    public ArrayList consultarParcela(){
        return camping.consultarParcelas();
    }
    
    
}
