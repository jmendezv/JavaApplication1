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
public class CalculadoraTest {

    //private Calculadora instance;
    public CalculadoraTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests ...");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando tests ...");
    }

    @Before
    public void setUp() {
        // instance = new Calculadora();
    }

    @After
    public void tearDown() {
        // instance = null
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        assertEquals(2, Calculadora.suma(1, 1));
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    //@Ignore
    public void testResta() {
        assertEquals(0, Calculadora.resta(1, 1));
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    //@Ignore
    public void testDivision() {
        assertEquals(2, Calculadora.division(4, 2));
    }

    /**
     * Test of producto method, of class Calculadora.
     */
    @Test
    // @Ignore
    public void testProducto() {
        assertEquals(12, Calculadora.producto(3, 4));
    }

    @Test
    // @Ignore
    public void testModulo() {
        assertEquals(2, Calculadora.modulo(8, 3));
    }
    
    
    @Test
    // @Ignore
    public void testImc() {
        assertEquals(27.929, Calculadora.imc(91.5, 1.81), 0.01);
    }

}
