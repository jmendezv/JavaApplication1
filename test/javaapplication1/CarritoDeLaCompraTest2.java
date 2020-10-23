/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author pep
 *
 * Tests parametrizado de la clase CarritoDeLaCompra
 *
 */

@RunWith(Parameterized.class)
public class CarritoDeLaCompraTest2 {

    private CarritoDeLaCompra instance;

    @Parameter(0)
    public Detalle detalle0;
    @Parameter(1)
    public Detalle detalle1;
    @Parameter(2)
    public Detalle detalle2;
    @Parameter(3)
    public Detalle detalle3;
    @Parameter(4)
    public Double total;

    
    @Parameters
    public static Collection<Object[]> data() {
        
        
        Object[][] data = new Object[][] {
            {
                new Detalle(1, new Item(135, "Nike", "Deporivas", 124.99), 1), 
                new Detalle(2, new Item(542, "Adidas", "Chadal", 224.22), 2), 
                new Detalle(3, new Item(533, "NB", "Mochila", 213.93), 3),
                new Detalle(4, new Item(234, "Rebook", "Shoes", 165.21), 12),
                3_197.74
            },
                       {
                new Detalle(1, new Item(135, "Nike", "Deporivas", 124.99), 2), 
                new Detalle(2, new Item(542, "Adidas", "Chadal", 224.22), 2), 
                new Detalle(3, new Item(533, "NB", "Mochila", 213.93), 3),
                new Detalle(4, new Item(234, "Rebook", "Shoes", 165.21), 12),
                3_322.73
            },
                                  {
                new Detalle(1, new Item(135, "Nike", "Deporivas", 124.99), 1), 
                new Detalle(2, new Item(542, "Adidas", "Chadal", 224.22), 2), 
                new Detalle(3, new Item(533, "NB", "Mochila", 213.93), 5),
                new Detalle(4, new Item(234, "Rebook", "Shoes", 165.21), 12),
                3_625.6
            }
            
        };
        
        return Arrays.asList(data);
    }

    public CarritoDeLaCompraTest2() {
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
        instance = new CarritoDeLaCompra();
    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of checkout method, of class CarritoDeLaCompra.
     * @throws java.lang.Exception
     */
    @Test
    public void testCheckout() throws Exception {
        instance.añade(detalle0);
        instance.añade(detalle1);
        instance.añade(detalle2);
        instance.añade(detalle3);
        Assert.assertEquals(total, instance.checkout(), 1.0E-3);
    }

}
