package Model;

import Controlador.Cliente;
import Controlador.Gerente;
import java.sql.*;

public class OperacionesBasedeDatos {
    Connection conex;
    
    public OperacionesBasedeDatos(Connection co){
        this.conex = co;
    }
    
    public void añadirClienteSinReserva(Cliente cli){
        try{
            String codigo = "INSERT INTO CLIENTES VALUES "+"(?,?,?,?,?)";
            PreparedStatement ps = conex.prepareStatement(codigo);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getNombreApellidos());
            ps.setString(3, cli.getContrasenya());
            ps.setString(4, cli.getTelefono());
            ps.setString(5, cli.getCp());
            ps.setString(6, cli.getCorreo());
        }catch(Exception e){
            System.out.println("Error en la adicción de un cliente");
        }
    }
    
    public void añadirGerente(Gerente ge){
        try{
            String codigo = "INSERT INTO GERENTE VALUES "+"(?,?)";
            PreparedStatement ps = conex.prepareStatement(codigo);
            ps.setString(1, ge.getNombre());
            ps.setString(2, ge.getContrasenya());
        }catch(Exception e){
            System.out.println("Error en la adicción de un gerente");
        }
    }
    
    public void añadirTienda(Tienda ti, Cliente cli){
        try{
            String codigo = "INSERT INTO TIENDAS VALUES "+"(?,?,?,?)";
            PreparedStatement ps = conex.prepareStatement(codigo);
            ps.setInt(1, ti.getId_tienda());
            ps.setString(2, ti.getNombre());
            ps.setInt(3, ti.getMetrosCuadrados());
            ps.setString(4, cli.getNombre());
        }catch(Exception e){
            System.out.println("Error en la adicción de un gerente");
        }
    }
    
    public void añadirParcela(Parcela par, Cliente cli, Reserva re){
        try{
            String codigo = "INSERT INTO TIENDAS VALUES "+"(?,?,?,?,?,?)";
            PreparedStatement ps = conex.prepareStatement(codigo);
            ps.setInt(1, par.getIdentificador());
            ps.setInt(2, par.getMetrosCuadrados());
            ps.setBoolean(3, par.isLuz());
            ps.setInt(4, par.getPrecioDia());
            ps.setInt(5, re.getId());
            ps.setString(6, cli.getNombre());
        }catch(Exception e){
            System.out.println("Error en la adicción de un gerente");
        }
    }
    
    public void añadirReserva(Reserva re, Cliente cli){
        try{
            String codigo = "INSERT INTO TIENDAS VALUES "+"(?,?,?,?)";
            PreparedStatement ps = conex.prepareStatement(codigo);
            ps.setInt(1, re.getId());
            ps.setDate(2, new java.sql.Date(re.getFechaIni().getTime()));
            ps.setDate(3, new java.sql.Date(re.getFechaFin().getTime()));
            ps.setString(4, cli.getNombre());
        }catch(Exception e){
            System.out.println("Error en la adicción de un gerente");
        }
    }
}
