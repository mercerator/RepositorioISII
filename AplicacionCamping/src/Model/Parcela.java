package Model;

import Datos.DatosParcela;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Parcela {

    public Reserva reserva;

    protected DatosParcela datosParcela;

    public int identificador;
    public int metrosCuadrados;
    public boolean luz;
    public int precioDia;

    public Parcela(DatosParcela _datos) {
        datosParcela = _datos;
    }

    /**
     * La funcion permite actualizar una reserva con los datos que se le pasan
     * como parámetro.
     *
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

    public DatosParcela consultarDatosParcela(ArrayList parcelasDisponibles) {
        DatosParcela datosParcela = new DatosParcela(this.identificador,
                this.metrosCuadrados, this.luz, this.precioDia);
        return new DatosParcela(identificador,metrosCuadrados,luz,precioDia);
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

    @Override
    public String toString() {
        return datosParcela + "" + identificador + "" + metrosCuadrados + "" + luz + "" + precioDia + "";
    }
}
