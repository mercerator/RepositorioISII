package Model;

import Datos.DatosParcela;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Parcela {

    private int identificador;
    private int metrosCuadrados;
    private boolean luz;
    private int precioDia;
    private Reserva reserva;
    private int id_reserv;
    

    public Parcela(int identificador, int metrosCuadrados, boolean luz, int precioDia, int id_reserva) {
        this.identificador = identificador;
        this.metrosCuadrados = metrosCuadrados;
        this.luz = luz;
        this.precioDia = precioDia;
        this.id_reserv = id_reserva;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isLuz() {
        return luz;
    }

    public void setLuz(boolean luz) {
        this.luz = luz;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }

    //si ya esta reservada
    public boolean consultarReservas() {
        return reserva == null;
    }
    
    public boolean tamanyoCorrecto(int tamanyo){
        return (tamanyo <= metrosCuadrados);
    }

    @Override
    public String toString() {
        return String.valueOf(identificador);
    }

    public int getId_reserv() {
        return id_reserv;
    }
    
}
