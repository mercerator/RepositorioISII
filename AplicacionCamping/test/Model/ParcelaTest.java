/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class ParcelaTest {
    
    public ParcelaTest() {
    }

    @Test
    public void testGetIdentificador() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        assertEquals(1, parcela.getIdentificador());
    }

    @Test
    public void testSetIdentificador() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        parcela.setIdentificador(2);
        assertEquals(2, parcela.getIdentificador());
    }

    @Test
    public void testGetMetrosCuadrados() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        assertEquals(30, parcela.getMetrosCuadrados());
    }

    @Test
    public void testSetMetrosCuadrados() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        parcela.setMetrosCuadrados(35);
        assertEquals(35, parcela.getMetrosCuadrados());
    }

    @Test
    public void testIsLuz() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        assertEquals(false, parcela.isLuz());
    }

    @Test
    public void testSetLuz() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        parcela.setLuz(true);
        assertEquals(true, parcela.isLuz());
    }

    @Test
    public void testGetPrecioDia() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        assertEquals(30, parcela.getPrecioDia());
    }

    @Test
    public void testSetPrecioDia() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        parcela.setPrecioDia(50);
        assertEquals(50, parcela.getPrecioDia());
    }

    @Test
    public void testConsultarReservas() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        assertEquals(true, parcela.consultarReservas());
    }

    @Test
    public void testTamanyoCorrecto() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        assertEquals(true, parcela.tamanyoCorrecto(30));
    }

    @Test
    public void testToString() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        assertEquals("1", parcela.toString());
    }

    @Test
    public void testGetId_reserv() {
        Parcela parcela = new Parcela(1, 30, false, 30, 0);
        assertEquals(0, parcela.getId_reserv());
    }
    
}
