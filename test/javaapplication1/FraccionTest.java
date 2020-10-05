/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author pep
 */
public class FraccionTest {

    private Fraccion f1;

    private Fraccion f2;

    public FraccionTest() {
    }

    @Before
    public void setUp() throws Exception {
        f1 = new Fraccion(1, 4);
        f2 = new Fraccion(3, 5);
    }

    @After
    public void tearDown() {
        f1 = null;
        f2 = null;
    }

    /**
     * Test of suma method, of class Fraccion.
     */
    @Test
    //@Ignore
    public void testSuma() throws Exception {
        Fraccion f3 = f1.suma(f2);
        assertEquals(17, f3.getNumerador());
        assertEquals(20, f3.getDenominador());
    }
    
    @Test
    public void testMcd() {
        assertEquals(1, Fraccion.mcd(17, 20));
    }

    /**
     * Test of resta method, of class Fraccion.
     */
    @Test
    public void testResta() throws Exception {
        Fraccion f3 = f1.resta(f2);
        assertEquals(-7, f3.getNumerador());
        assertEquals(20, f3.getDenominador());
    }

    /**
     * Test of producot method, of class Fraccion.
     */
    @Test
    public void testProducto() throws Exception {
        Fraccion f3 = f1.producto(f2);
        assertEquals(3, f3.getNumerador());
        assertEquals(20, f3.getDenominador());
    }

    /**
     * Test of division method, of class Fraccion.
     */
    @Test
    public void testDivision() throws Exception {
        Fraccion f3 = f1.division(f2);
        assertEquals(5, f3.getNumerador());
        assertEquals(12, f3.getDenominador());
    }

}
