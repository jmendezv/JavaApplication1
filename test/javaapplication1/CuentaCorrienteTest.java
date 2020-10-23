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

/**
 *
 * @author pep
 */
public class CuentaCorrienteTest {
    
    public CuentaCorrienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSaldo method, of class CuentaCorriente.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        CuentaCorriente instance = null;
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CuentaCorriente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CuentaCorriente instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresa method, of class CuentaCorriente.
     */
    @Test
    public void testIngresa() throws Exception {
        System.out.println("ingresa");
        double ingreso = 0.0;
        CuentaCorriente instance = null;
        instance.ingresa(ingreso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of abona method, of class CuentaCorriente.
     */
    @Test
    public void testAbona() throws Exception {
        System.out.println("abona");
        double abono = 0.0;
        CuentaCorriente instance = null;
        instance.abona(abono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
