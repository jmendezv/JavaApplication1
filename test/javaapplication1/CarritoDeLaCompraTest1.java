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
public class CarritoDeLaCompraTest1 {
    
    private CarritoDeLaCompra instance;
    
    public CarritoDeLaCompraTest1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Terminando tests ...");
    }
    
    @Before
    public void setUp() throws Exception {
        // 3197.74
        instance = new CarritoDeLaCompra(); 
        instance.añade(
                new Detalle(1, 
                        new Item(135, "Nike", "Deporivas", 124.99), 
                        1));
        instance.añade(new Detalle(2, 
                new Item(542, "Adidas", "Chadal", 224.22), 
                2));
        instance.añade(new Detalle(3, 
                new Item(533, "NB", "Mochila", 213.93), 
        3));
        instance.añade(new Detalle(4, 
                new Item(234, "Rebook", "Deporivas Football", 165.21), 
                12));
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * 
     * Test of checkout method, of class CarritoDeLaCompra.
     */
    @Test
    public void testCheckout() {
        assertEquals(3_197.74, instance.checkout(), 1.0E-3);
    }
    
}
