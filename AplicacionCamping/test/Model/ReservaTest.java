/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controlador.Cliente;
import Datos.DatosReserva;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class ReservaTest {
    
    public ReservaTest() {
    }

    @Test
    public void testGetNombreApellidos() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        assertEquals("Pepe Pepe", reserva.getNombreApellidos());
    }

    @Test
    public void testGetDni() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        assertEquals("C8564721", reserva.getDni());
    }

    @Test
    public void testGetFechaIni() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        assertEquals(fecha.getTime(), reserva.getFechaIni().getTime());
    }

    @Test
    public void testSetFechaIni() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        fecha.setTime(System.currentTimeMillis());
        reserva.setFechaIni(fecha);
        assertEquals(fecha.getTime(), reserva.getFechaIni().getTime());
    }

    @Test
    public void testGetFechaFin() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        assertEquals(fecha.getTime(), reserva.getFechaFin().getTime());
    }

    @Test
    public void testSetFechaFin() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        fecha.setTime(System.currentTimeMillis());
        reserva.setFechaFin(fecha);
        assertEquals(fecha.getTime(), reserva.getFechaFin().getTime());
    }

    @Test
    public void testGetParcelasSeleccionadas() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        assertEquals(parcelas, reserva.getParcelasSeleccionadas());
    }

    @Test
    public void testSetParcelasSeleccionadas() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        parcela = new Parcela(2, 30, false, 30, 0);
        parcelas.add(parcela);
        reserva.setParcelasSeleccionadas(parcelas);
        
        assertEquals(parcelas, reserva.getParcelasSeleccionadas());
    }

    @Test
    public void testGetDatosReserva() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        DatosReserva dr = new DatosReserva(1, fecha, fecha, parcelas, cliente.getNombreApellidos(), cliente.getNombre(), cliente.getTelefono(), cliente.getCorreo(), cliente.getCp());
        
        assertEquals(dr.id, reserva.getDatosReserva().id);
    }

    @Test
    public void testToString() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        String tostring = "Id: " + 1 + "   Parcelas: " + parcelas.size() + "   Fecha Llegada: " +
                fecha.getDate() + "/" + (fecha.getMonth()+1) + "/" + (fecha.getYear()+1900) +
                "   Fecha Salida: " + fecha.getDate() + "/" + (fecha.getMonth()+1) + "/" + (fecha.getYear()+1900);
        
        assertEquals(tostring, reserva.toString());
    }

    @Test
    public void testGetId() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        assertEquals(1, reserva.getId());
    }

    @Test
    public void testGetPrecioReserva() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        assertEquals(30, reserva.getPrecioReserva());
    }

    @Test
    public void testGetPrecioTotal() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        assertEquals(0, (int)reserva.getPrecioTotal(0));
    }

    @Test
    public void testTramitarReserva() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        reserva.tramitarReserva();
        
        assertEquals(0, cliente.getReservas().size());
    }

    @Test
    public void testGetDias() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cliente);
        
        assertEquals(0, (int)reserva.getDias());
    }
    
}
