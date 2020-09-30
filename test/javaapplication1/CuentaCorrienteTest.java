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
public class CuentaCorrienteTest {

    private CuentaCorriente instance;

    public CuentaCorrienteTest() {
    }

    /* Aquest mètode s'executa abans de tot */
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests ...");
    }

    /* Aquest mètode s'executa al final de tot */
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando tests ...");
    }

    /* Aquest mètode s'executa abans de cada test */
    @Before
    public void setUp() {
        instance = new CuentaCorriente("Pepe");
    }

    /* Aquest mètode s'executa després de cada test */
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testInstance() {
        assertNotNull("instància és nul·la", instance);
    }

    /**
     * Test of ingresa method, of class CuentaCorriente.
     */
    @Test
    // @Ignore("Already checked")
    public void testIngresa() {
        instance.ingresa(100.0);
        assertEquals(100.0, instance.getSaldo(), 1.0E-3);
    }

    /**
     * Test of ingresa method, of class CuentaCorriente.
     */
    @Test(timeout = 100)
    // @Ignore("Already checked")
    public void testIngresa2() {
        instance.ingresa(100.0);
        assertEquals(100.0, instance.getSaldo(), 1.0E-3);
    }

    /**
     * Test of abona method, of class CuentaCorriente.
     */
    @Test
    public void testAbona() throws Exception {
        instance.ingresa(100.0);
        instance.abona(10.0);
        assertEquals(90.0, instance.getSaldo(), 1.0E-2);
    }

    /**
     * Test of abona method, of class CuentaCorriente.
     */
    @Test(expected = Exception.class)
    public void testAbona2() throws Exception {
        instance.ingresa(100.0);
        instance.abona(101.0);
        assertEquals(90.0, instance.getSaldo(), 1.0E-2);
    }

}
