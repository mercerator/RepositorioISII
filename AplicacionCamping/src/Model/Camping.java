package Model;

import Controlador.Cliente;
import Controlador.Gerente;
import Controlador.UsuarioRegistrado;
import Datos.DatosParcela;
import Datos.DatosReserva;
import Datos.ListaParcelas;
import Datos.ListaReservas;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author EpicGames
 */
public class Camping {

    //Variables
    protected DatosReserva datosReserva;
    protected DatosParcela datosParcela;
    protected Cliente cliente;

    protected ArrayList<UsuarioRegistrado> usuarios = new ArrayList<UsuarioRegistrado>();
    protected ArrayList<Actividad> actividades = new ArrayList<Actividad>();

    protected ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
    protected ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    protected ArrayList<DatosReserva> reserva = new ArrayList<DatosReserva>();

    protected ArrayList<Parcela> parcelasConAsignacion = new ArrayList<Parcela>();
    protected ArrayList<Parcela> parcelasSinAsignacion = new ArrayList<Parcela>();

    protected ArrayList<Tienda> tiendas = new ArrayList<Tienda>();

    /*public static final String gerente2 = "Alex";
    public static final String gerente3 = "Ana";
    public static final String gerente4 = "Jacques";
     */
    private int descuento;
    protected Date fechaIni;
    protected Date fechaFin;
    public String ubicacion;
    public String url;

    public static final int ERROR = -1;
    public static final int ENCONTRADO = 1;
    public static final int SEGUIR = 0;

    public Camping() {
        cargarDatos();
    }

    public void cargarDatos() {
        Gerente per1 = new Gerente("Anthony", "123", this);
        usuarios.add(per1);

        Gerente per2 = new Gerente("Alex", "123", this);
        usuarios.add(per2);

        Gerente per3 = new Gerente("Ana", "123", this);
        usuarios.add(per3);

        Gerente per4 = new Gerente("Jacques", "123", this);
        usuarios.add(per4);
        
        Cliente cli = new Cliente("Pepe", "123", this);
        usuarios.add(cli);
    }

    public UsuarioRegistrado login(String nombre, String contrasenya) {
        UsuarioRegistrado usuario = null, usuarioEncontrado = null;
        int i = 0, resultado = SEGUIR;

        while (i < usuarios.size() && resultado != ERROR && resultado != ENCONTRADO) {
            usuario = usuarios.get(i);
            resultado = usuario.validarUsuario(nombre, contrasenya);
            i++;
        }
        if (resultado == ENCONTRADO) {
            usuarioEncontrado = usuario;
        }

        return usuarioEncontrado;
    }

    public ArrayList cParcelas() {
        return parcelas;
    }

    public ListaParcelas consultarParcelas() {
        return new ListaParcelas(parcelas);
    }

    public ArrayList<Parcela> consultarParcelasDisponibles() {
        ArrayList<Parcela> parcelasDisponibles = new ArrayList<>();
        for (int i = 0; i < parcelasConAsignacion.size(); i++) {
            Parcela parcela = parcelasConAsignacion.get(i);
            if (parcela.consultarReservas()) {
                parcelasDisponibles.add(parcela);
            }
        }
        return parcelasDisponibles;
    }

    public ListaReservas consultarReserva() {
        return new ListaReservas(reservas);
    }

    public void nuevaReserva(String nombreApellidos, String dni, String nombresTiendas,
            int metrosTiendas, boolean luz, Date fechaIni, Date fechaFin, ArrayList<Parcela> parcelasSeleccionadas) {
        Reserva r = new Reserva(datosReserva);
        reservas.add(r);

        for (Parcela par : parcelasSeleccionadas) {
            parcelas.add(par);
        }
    }

    /*
    public void nuevaReserva(String nombreApellidos, String dni, String nombresTiendas,
            ArrayList<Integer> metrosTiendas, boolean luz, Date fechaIni, Date fechaFin, ArrayList<Parcela> parcelasSeleccionadas, Gerente gerente) {

        for (Parcela parcela : parcelasSeleccionadas) {
            parcelas.add(parcela);
        }
        Reserva reserva = new Reserva(fechaIni, fechaFin, parcelasSeleccionadas, gerente);
        reservas.add(reserva);

        for (int i = 0; i < nombresTiendas.size(); i++) {
            Tienda tienda = new Tienda(nombresTiendas.get(i), metrosTiendas.get(i));
            tiendas.add(tienda);
        }
    }*/
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getDescuento() {
        return this.descuento;
    }

    public Object devolverParcela(int identificador) {
        Object res = new Object();
        for (Parcela p : parcelas) {
            if (p.getIdentificador() == identificador) {
                res = p;
            }
        }
        return res;
    }

}
