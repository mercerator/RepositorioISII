/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controlador.Cliente;
import Controlador.Gerente;
import Controlador.UsuarioRegistrado;
import Datos.DatosParcela;
import Datos.DatosReserva;
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
    private ArrayList<Actividad> actividades = new ArrayList<Actividad>();
    protected ArrayList<Parcela> parcelaConAsignacion = new ArrayList<Parcela>();
    protected ArrayList<Parcela> parcelas = new ArrayList<>();
    protected ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    protected ArrayList<Tienda> tiendas = new ArrayList<Tienda>();

    private String nombreApellidos;
    private String dni;

    private int descuento;
    protected Date fechaIni;
    protected Date fechaFin;
    public String ubicacion;
    public String url;

    public static final int ERROR = -1;
    public static final int ENCONTRADO = 1;
    public static final int SEGUIR = 0;

    public Camping() {
        
    }

    public void cargarDatos() throws Exception {
        /*
        Gerente per1 = new Gerente("Anthony", "123", this);
        usuarios.add(per1);

        Gerente per2 = new Gerente("Alex", "123", this);
        usuarios.add(per2);

        Gerente per3 = new Gerente("Ana", "123", this);
        usuarios.add(per3);

        Gerente per4 = new Gerente("Jacques", "123", this);
        usuarios.add(per4);
        */
        
        Parcela p = new Parcela (0, 20, true, 10);
        parcelas.add(p);
        p = new Parcela (1, 20, true, 10);
        parcelas.add(p);
        p = new Parcela (2, 25, true, 10);
        parcelas.add(p);
        p = new Parcela (3, 25, true, 10);
        parcelas.add(p);
        p = new Parcela (4, 25, true, 10);
        parcelas.add(p);
        p = new Parcela (5, 40, true, 10);
        parcelas.add(p);
        p = new Parcela (6, 40, true, 10);
        parcelas.add(p);
        p = new Parcela (7, 45, true, 10);
        parcelas.add(p);
        
        
        
        

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

    public ArrayList<Parcela> consultarParcelas() {
        ArrayList<Parcela> parcelas = new ArrayList<>();

        for (int i = 0; i < parcelaConAsignacion.size(); i++) {
            Parcela p = parcelaConAsignacion.get(i);
            parcelas.add(p);
        }
        return parcelas;
    }

    public void nuevaReserva(String nombreApellidos, String dni, ArrayList<String> nombresTiendas,
            ArrayList<Integer> metrosTiendas, boolean luz, Date fechaIni, Date fechaFin, ArrayList<Parcela> parcelasSeleccionadas, Cliente cliente) {

        for (Parcela parcela : parcelasSeleccionadas) {
            parcelas.add(parcela);
        }
        Reserva reserva = new Reserva(fechaIni, fechaFin, parcelasSeleccionadas, cliente);
        reservas.add(reserva);
        
        for (int i = 0; i < nombresTiendas.size(); i++) {
            Tienda tienda = new Tienda(nombresTiendas.get(i), metrosTiendas.get(i));
            tiendas.add(tienda);
        }
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getDescuento() {
        return this.descuento;
    }
    
    public Object devolverParcela(int identificador){
        Object res = new Object();
        for (Parcela p : parcelas){
            if (p.getIdentificador() == identificador)
                res = p;
        }
        return res;
    }
}
