package Model;

import Datos.DatosReserva;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jacques
 */
public class Reserva {

    protected DatosReserva datosreserva;

    public Reserva(DatosReserva _datos) {
        datosreserva = _datos;
    }

    public String getNombreApellidos() {
        return datosreserva.nombreApellidos;
    }

    public void setNombreApellidos(DatosReserva _nombre) {
        datosreserva = _nombre;
    }

    public String getDni() {
        return datosreserva.dni;
    }

    public void setDni(DatosReserva _dni) {
        datosreserva = _dni;
    }

    public String getNombreTiendas() {
        return datosreserva.nombreTiendas;
    }

    public void setNombreTiendas(DatosReserva _nombreTiendas) {
        datosreserva = _nombreTiendas;
    }

    public int getMetrosTienda() {
        return datosreserva.metrosTienda;
    }

    public void setMetrosTienda(DatosReserva _metrosTienda) {
        datosreserva = _metrosTienda;
    }

    public Boolean getLuz() {
        return datosreserva.luz;
    }

    public void setLuz(DatosReserva _luz) {
        datosreserva = _luz;
    }

    public Date getFechaIni() {
        return datosreserva.fechaIni;
    }

    public void setFechaIni(DatosReserva _fechaIni) {
        datosreserva = _fechaIni;
    }

    public Date getFechaFin() {
        return datosreserva.fechaFin;
    }

    public void setFechaFin(DatosReserva _fechaFin) {
        datosreserva = _fechaFin;
    }

    public ArrayList<Parcela> getParcelasSeleccionadas() {
        return datosreserva.parcelasSeleccionadas;
    }

    public void setParcelasSeleccionadas(DatosReserva _parcelasSeleccionadas) {
        datosreserva = _parcelasSeleccionadas;
    }
    
   

    @Override
    public String toString() {
        return "" + datosreserva.dni;
    }

}
