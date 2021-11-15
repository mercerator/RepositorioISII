
package Model;

import Datos.DatosParcela;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alex
 */
public class Parcela {
    private int identificador;
    protected DatosParcela datosParcela;
    private int metrosCuadrados;
    private boolean luz;
    private int precioDia;
    
    public Parcela(DatosParcela _datos){
        datosParcela = _datos;
    }
    
    public DatosParcela consultarDatosParcela(){
        DatosParcela datosParcela = new DatosParcela(this.identificador,
            this.metrosCuadrados, this.luz, this.precioDia);
        return datosParcela;
    }
    
    /**
    * La funcion permite actualizar una reserva con los datos que se le pasan
    * como parámetro.
     * @param id
     * @param metros
     * @param luz
     * @param precio    
    */
    public void actualizarParcela(int id, int metros, boolean luz, int precio) {        
        this.identificador = id;
        this.metrosCuadrados = metros;
        this.luz = luz;
        this.precioDia = precio; 
    }
}
