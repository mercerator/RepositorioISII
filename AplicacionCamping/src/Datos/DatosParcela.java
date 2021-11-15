package Datos;

/**
 *
 * @author Alex
 */
public class DatosParcela {
    public int identificador;
    public int metrosCuadrados;
    public boolean luz;
    public int precioDia;
    
    public DatosParcela(int identificador, int metrosCuadrados, boolean luz, int precioDia){
        this.identificador = identificador;
        this.metrosCuadrados = metrosCuadrados;
        this.luz = luz;
        this.precioDia = precioDia;
    }
}
