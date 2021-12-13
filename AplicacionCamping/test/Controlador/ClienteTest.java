/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.DatosReserva;
import Model.Camping;
import Model.Parcela;
import Model.Reserva;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class ClienteTest {
    
    public ClienteTest() {
    }

    @Test
    public void testConsultarParcelas() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        assertEquals(37, cli.consultarParcelas().size());
    }

    @Test
    public void testDevolverParcela() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        assertEquals("1", cli.devolverParcela(1).toString());
    }

    @Test
    public void testGetReservas() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        assertEquals(0, cli.getReservas().size());
    }

    @Test
    public void testGetNombreApellidos() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        assertEquals("Pepe", cli.getNombreApellidos());
    }

    @Test
    public void testGetTelefono() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        assertEquals("Maria", cli.getTelefono());
    }

    @Test
    public void testGetCorreo() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        assertEquals("jose", cli.getCorreo());
    }

    @Test
    public void testGetCp() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        assertEquals("juan", cli.getCp());
    }

    @Test
    public void testGetNombre() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        assertEquals("Pepe", cli.getNombre());
    }

    @Test
    public void testGetContrasenya() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        assertEquals("123", cli.getContrasenya());
    }

    @Test
    public void testTamanyoCorrecto() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        Parcela p = new Parcela(1, 10, true, 10, 0);
        
        assertTrue(cli.tamanyoCorrecto(p, 5));
    }

    @Test
    public void testGetDatosReserva() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cli);
        
        DatosReserva dr = new DatosReserva(1, fecha, fecha, parcelas, "Pepe", "Pepe", "Maria", "jose", "juan");
        
        assertEquals(dr.id, cli.getDatosReserva(reserva).id);
    }

    @Test
    public void testParcelasAsignadas() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        
        assertEquals(0, cli.parcelasAsignadas().size());
    }

    @Test
    public void testGetSancion() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        
        assertFalse(cli.getSancion());
    }

    @Test
    public void testSetSancion() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        cli.setSancion(true);
        assertTrue(cli.getSancion());
    }

    @Test
    public void testToString() {
        Cliente cli = new Cliente("Pepe", "123", new Camping(), "Pepe", "Maria", "jose", "juan");
        
        assertEquals("Pepe", cli.toString());
    }
    
}
