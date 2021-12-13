/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controlador.Cliente;
import Controlador.Gerente;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class CampingTest {
    
    public CampingTest() {
    }

    @Test
    public void testLogin() {
        Camping camping = new Camping();
        Cliente cli = new Cliente("Pepe", "123", camping, "Pepe", "Maria", "jose", "juan");
        
        assertEquals(cli.toString(), camping.login("Pepe", "123").toString());
    }

    @Test
    public void testCParcelas() {
        Camping camping = new Camping();
        
        assertEquals("1", camping.cParcelas().get(0).toString());
    }

    @Test
    public void testConsultarReserva() {
        Camping camping = new Camping();
        
        assertEquals(0, camping.consultarReserva().size());
    }

    @Test
    public void testSetDescuento() {
        Camping camping = new Camping();
        camping.setDescuento(0);
        assertEquals(0, camping.getDescuento());
    }

    @Test
    public void testGetDescuento() {
        Camping camping = new Camping();
        
        assertEquals(10, camping.getDescuento());
    }

    @Test
    public void testDevolverParcela() {
        Camping camping = new Camping();
        
        assertEquals("1", camping.devolverParcela(1).toString());
    }

    @Test
    public void testParcelasAsignadas() {
        Camping camping = new Camping();
        
        assertEquals(0, camping.parcelasAsignadas().size());
    }

    @Test
    public void testAltaCliente() {
        Camping camping = new Camping();
        assertEquals("Juan", camping.altaCliente("Juan", "123", "Juan", "658954752", "juan@uv.es", "45210").getNombreApellidos());
    }

    @Test
    public void testRealizarReserva() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Camping camping = new Camping();
        Cliente cliente = new Cliente("C8564721", "123", camping, "Pepe Pepe", "625658472", "pepe@uv.es", "46018");
        
        Date fecha = new Date();
        
        assertEquals("Pepe Pepe", camping.realizarReserva(parcelas, fecha, fecha, cliente).getNombreApellidos());
    }

    @Test
    public void testCrearTiendas() {
        ArrayList<String> nombresTiendas = new ArrayList<String>();
        nombresTiendas.add("Patata");
        ArrayList<Integer> metrosTiendas = new ArrayList<Integer>();
        metrosTiendas.add(20);
        
        Camping camping = new Camping();
        
        assertEquals(1, camping.crearTiendas(nombresTiendas, metrosTiendas).size());
    }

    @Test
    public void testListasEventos() {
        Camping camping = new Camping();
        assertEquals(0, camping.listasEventos().listaClub.size());
    }
}
