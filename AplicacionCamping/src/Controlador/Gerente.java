
package Controlador;

import Model.Camping;

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
}
