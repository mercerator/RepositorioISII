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
public class TiendaTest {
    
    public TiendaTest() {
    }

    @Test
    public void testGetNombre() {
        Tienda tienda = new Tienda(1, "patata", 20);
        String nombre = tienda.getNombre();
        assertEquals("patata", nombre);
    }

    @Test
    public void testSetNombre() {
        String nombre = "patata2";
        Tienda tienda = new Tienda(1, "patata", 20);
        tienda.setNombre(nombre);
        assertEquals(nombre, tienda.getNombre());
    }

    @Test
    public void testGetMetrosCuadrados() {
        Tienda tienda = new Tienda(1, "patata", 20);
        int result = tienda.getMetrosCuadrados();
        assertEquals(20, result);
    }

    @Test
    public void testSetMetrosCuadrados() {
        int metrosCuadrados = 20;
        Tienda tienda = new Tienda(1, "patata", 20);
        tienda.setMetrosCuadrados(metrosCuadrados);
        assertEquals(20, tienda.getMetrosCuadrados());
    }

    @Test
    public void testToString() {
        Tienda tienda = new Tienda(1, "patata", 20);
        String result = tienda.toString();
        assertEquals("patata20", result);
    }

    @Test
    public void testGetId_tienda() {
        Tienda tienda = new Tienda(1, "patata", 20);
        int result = tienda.getId_tienda();
        assertEquals(1, result);
    }
    
}
