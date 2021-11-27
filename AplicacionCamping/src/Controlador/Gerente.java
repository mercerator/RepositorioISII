package Controlador;

import Datos.DatosParcela;
import Datos.DatosReserva;
import Datos.ListaParcelas;
import Datos.ListaReservas;
import Model.Camping;
import Model.Parcela;
import Model.Reserva;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jacques
 */
public class Gerente extends UsuarioRegistrado {

    protected DatosReserva reservaAct;
    protected int i;

    public Gerente(String usuario, String contrasenya, Camping camping) {
        super(usuario, contrasenya, camping);
    }

    public void reserva(String nombreApellidos, String dni, String nombresTiendas,
            int metrosTiendas, boolean luz, Date fechaIni, Date fechaFin, ArrayList parcelasSeleccionadas) {

        camping.nuevaReserva(nombreApellidos, dni, nombresTiendas, metrosTiendas, luz,
                fechaIni, fechaFin, parcelasSeleccionadas);
    }

    public void setDescuento(int descuento) {
        camping.setDescuento(descuento);
    }

    
    public Object devolverParcelas() {
        return camping.devolverParcela(i);
    }
    
    public ListaParcelas consultarParcela() {
        return camping.consultarParcelas();
    }

    public ListaReservas consultarReserva() {
        return camping.consultarReserva();
    }

    public DatosReserva consultarDetallesReserva(Object reserva) {
        reservaAct = (DatosReserva) reserva;
        ArrayList<Parcela> parcelasDisponibles = camping.consultarParcelasDisponibles();
        return reservaAct.consultarDatosParcela(parcelasDisponibles);
    }
}
