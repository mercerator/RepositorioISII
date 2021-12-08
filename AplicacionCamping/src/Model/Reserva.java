package Model;

import Controlador.Cliente;
import Datos.DatosReserva;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jacques
 */
public class Reserva {

    protected DatosReserva datosreserva;
    private int id;
    private ArrayList<Parcela> parcelas;
    private Date fechaIni;
    private Date fechaFin;
    private Cliente cliente;

    public Reserva(int id, ArrayList<Parcela> parcelasSeleccionadas, Date fechaIni, Date fechaFin, Cliente cliente) {
        this.id = id;
        this.parcelas = parcelasSeleccionadas;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
    }

    public String getNombreApellidos() {
        return cliente.getNombreApellidos();
    }

    public String getDni() {
        return cliente.getNombre();
    }

    /*public Boolean getLuz() {
        return datosreserva.luz;
    }

    public void setLuz(DatosReserva _luz) {
        datosreserva = _luz;
    }
    */
    public Date getFechaIni() {
        return this.fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Parcela> getParcelasSeleccionadas() {
        return parcelas;
    }

    public void setParcelasSeleccionadas(ArrayList parcelasSeleccionadas) {
        this.parcelas = parcelasSeleccionadas;
    }
    
    public DatosReserva getDatosReserva(){
        return new DatosReserva(id, fechaIni, fechaFin, parcelas, cliente.getNombreApellidos(),
            cliente.getNombre(), cliente.getTelefono(), cliente.getCorreo(), cliente.getCp());
    }

    @Override
    public String toString() {
        String res = "Id: " + id + "   Parcelas: " + parcelas.size() + "   Fecha Llegada: " +
                fechaIni.getDate() + "/" + (fechaIni.getMonth()+1) + "/" + (fechaIni.getYear()+1900) +
                "   Fecha Salida: " + fechaFin.getDate() + "/" + (fechaFin.getMonth()+1) + "/" + (fechaFin.getYear()+1900);
        return res;
    }

    public int getId() {
        return id;
    }
}
