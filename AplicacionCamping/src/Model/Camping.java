package Model;

import Controlador.Cliente;
import Controlador.Gerente;
import Controlador.UsuarioRegistrado;
import Datos.DatosParcela;
import Datos.DatosReserva;
import Datos.ListaParcelas;
import Datos.ListaReservas;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

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
    protected ArrayList<Cliente> clientes = new ArrayList<Cliente>();

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
    
    private Connection conex;

    public Camping() {
        this.cargarDatos();
    }

    public void cargarDatos() {
        // Generacion de usuarios
        Gerente per1 = new Gerente("Anthony", "123", this);
        usuarios.add(per1);

        Gerente per2 = new Gerente("Alex", "123", this);
        usuarios.add(per2);

        Gerente per3 = new Gerente("Ana", "123", this);
        usuarios.add(per3);

        Gerente per4 = new Gerente("Jacques", "123", this);
        usuarios.add(per4);
        
        Cliente cli = new Cliente("Pepe", "123", this, "", "", "", "");
        usuarios.add(cli);
        
        // Generacion de parcelas
        int tamanyo = 0;
        for(int i = 1; i <= 37; i++){
            if((i >= 1) && (i <= 9)){
                tamanyo = 15;
            }else if((i >= 10) && (i <= 17)){
                tamanyo = 20;
            }else if((i >= 18) && (i <= 28)){
                tamanyo = 30;
            }if((i >= 29) && (i <= 37)){
                tamanyo = 50;
            }
            Parcela p = new Parcela(i, tamanyo, true, 10, 0);
            parcelasSinAsignacion.add(p);
            parcelas.add(p);
        }
        
        // Descuento
        descuento = 10;
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

    public ArrayList consultarReserva() {
        return reservas;
    }

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

    public ArrayList parcelasAsignadas(){
        ArrayList parcelasAsignadas = new ArrayList();
        
        for(Parcela parcela: parcelasConAsignacion){
            parcelasAsignadas.add(parcela.getIdentificador());
        }
        
        return parcelasAsignadas;
    }
    
    public Cliente altaCliente(String usuario, String contraseña, String nombreApellidos, String telefono, String correo, String cp){
        Cliente cliente = new Cliente(usuario, contraseña, this, nombreApellidos, telefono, correo, cp);
        usuarios.add(cliente);
        return cliente;
    }
    
    public Reserva realizarReserva(ArrayList<Parcela> parcelasSeleccionadas, Date fechaIni, Date fechaFin, Cliente cliente){
        Reserva reserva = new Reserva(reservas.size(), parcelasSeleccionadas, fechaIni, fechaFin, cliente);
        reservas.add(reserva);
        for(Parcela p: parcelasSeleccionadas){
            parcelasSinAsignacion.remove(p);
            parcelasConAsignacion.add(p);
        }
        return reserva;
    }
    
    public boolean conectarBaseDatos (){
        boolean ok = true;

        String baseDatos = "jdbc:mysql://localhost:3306/mydb?serverTimezone=" + TimeZone.getDefault().getID();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex = DriverManager.getConnection(baseDatos, "root", "123456");
        } catch (Exception e) {
            System.out.println("Error en la conexion a la BD");
            ok = false;
        }

        return ok;
    }
    
    public ArrayList<Tienda> crearTiendas(ArrayList<String> nombresTiendas, ArrayList<Integer> metrosTiendas){
        
        ArrayList<Tienda> tiendaux = new ArrayList<Tienda>();
        Tienda tienda;
        
        for(int i = 0; i < nombresTiendas.size(); i++){
            tienda = new Tienda(tiendas.size(),nombresTiendas.get(i), metrosTiendas.get(i));
            tiendas.add(tienda);
            tiendaux.add(tienda);
        }
        
        return tiendaux;
    }
    
    private void cargaDeDatos(){
        Statement sentencia;
        ResultSet result;
        
        try{
            sentencia = conex.createStatement();
            result = sentencia.executeQuery("SELECT *FROM GERENTE");
                while(result.next()){
                    Gerente ge = new Gerente(result.getString("id_gerente"), result.getString("contraseña"),this);
                    usuarios.add(ge);
                }
        }catch(SQLException ex){
            System.out.println("Error cargando los datos de los gerentes");
        }
        
        try{
            sentencia = conex.createStatement();
            result = sentencia.executeQuery("SELECT * FROM CLIENTES");
            while(result.next()){
                Cliente cli= new Cliente(result.getString("dni"), result.getString("nombre"), this, result.getString("contraseña"), result.getString("telefono"), result.getString("codigopostal"), result.getString("correo"));
                usuarios.add(cli);
                clientes.add(cli);
            }
        }catch(SQLException ex){
            System.out.println("Error cargando los datos de los clientes");
        }
        
        try{
            sentencia = conex.createStatement();
            result = sentencia.executeQuery("SELECT * FROM PARCELAS");
            while(result.next()){
                Parcela pa = new Parcela(result.getInt("id_parcela"), result.getInt("metroscuadrados"), result.getBoolean("luz"), result.getInt("preciodia"), result.getInt("id_reserva"));
                parcelas.add(pa);
            }
        }catch(SQLException ex){
            System.out.println("Error cargando los datos de las parcelas");
        }
        
        try{
            sentencia = conex.createStatement();
            result = sentencia.executeQuery("SELECT * FROM RESERVAS");
            ArrayList<Parcela> parcelaux = new ArrayList<Parcela>();
            Cliente cli = null;
            while(result.next()){
                for(int i = 0; i < parcelas.size(); i++){
                    if(parcelas.get(i).getId_reserv() == result.getInt("id_reserva"))
                        parcelaux.add(parcelas.get(i));
                }
                        
                for(int i = 0; i < clientes.size(); i++){
                    if(clientes.get(i).getNombre() == result.getString("dni_cliente"))
                       cli = clientes.get(i);
                }
                Reserva re = new Reserva(result.getInt("id_reserva"), parcelaux, result.getDate("fecha_ini"), result.getDate("fecha_fin"), cli);
                reservas.add(re);
            }
        }catch(SQLException ex){
            System.out.println("Error cargando los datos de las reservas");
        }
        
        try{
            sentencia = conex.createStatement();
            result = sentencia.executeQuery("SELECT * FROM TIENDAS");
            while(result.next()){
                Tienda ti = new Tienda(result.getInt("id_tiendads"), result.getString("nombre"), result.getInt("metroscuadrados"));
                tiendas.add(ti);
            }
        }catch(SQLException ex){
            System.out.println("Error cargando los datos de las tiendas");
        }
    }
}
