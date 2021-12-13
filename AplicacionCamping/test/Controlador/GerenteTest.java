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
public class GerenteTest {
    
    public GerenteTest() {
    }

    @Test
    public void testSetDescuento() {
        Gerente ger = new Gerente("Ana", "123", new Camping());
        ger.setDescuento(20);
        assertEquals(20, ger.getDescuento());
    }

    @Test
    public void testGetDescuento() {
        Gerente ger = new Gerente("Ana", "123", new Camping());
        assertEquals(10, ger.getDescuento());
    }

    @Test
    public void testGetNombre() {
        Gerente ger = new Gerente("Ana", "123", new Camping());
        assertEquals("Ana", ger.getNombre());
    }

    @Test
    public void testGetContrasenya() {
        Gerente ger = new Gerente("Ana", "123", new Camping());
        assertEquals("123", ger.getContrasenya());
    }

    @Test
    public void testListasEventos() {
        Gerente ger = new Gerente("Ana", "123", new Camping());
        assertEquals(0, ger.listasEventos().listaClub.size());
    }

    @Test
    public void testDatosReserva() {
        Camping camping = new Camping();
        Gerente ger = new Gerente("Ana", "123", camping);

        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        parcelas.add(parcela);
        
        Cliente cli = new Cliente("Pepe", "123", camping, "Pepe", "Maria", "jose", "juan");
        
        Date fecha = new Date();
        Reserva reserva = new Reserva(1, parcelas, fecha, fecha, cli);
        
        DatosReserva dr = new DatosReserva(1, fecha, fecha, parcelas, "Pepe", "Pepe", "Maria", "jose", "juan");
        
        assertEquals(dr.id, ger.datosReserva(reserva).id);
    }
}
