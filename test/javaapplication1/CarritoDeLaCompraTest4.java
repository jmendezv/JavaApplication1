/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
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
public class CarritoDeLaCompraTest4 {
    
    private CarritoDeLaCompra instance;
    
    public CarritoDeLaCompraTest4() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inicializando tests ...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando tests ...");
    }
    
    @Before
    public void setUp() {
        instance = new CarritoDeLaCompra();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of añade method, of class CarritoDeLaCompra.
     */
    @Test(expected = Exception.class, timeout = 250)
    public void testAñade() throws Exception {
        instance.añade(null);
        
    }

    /**
     * Test of elimina method, of class CarritoDeLaCompra.
     */
    @Test(expected = Exception.class, timeout = 250)
    //@Ignore
    public void testElimina() throws Exception {
        instance.elimina(null);
       
    }

    
    
}
