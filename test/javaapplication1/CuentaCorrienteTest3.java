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
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author pep
 */
@RunWith(Parameterized.class)
public class CuentaCorrienteTest3 {
    
    private CuentaCorriente instance;
    
    private Double abono;
    private Double saldo;

    public CuentaCorrienteTest3(double abono, double saldo) {
        this.abono = abono;
        this.saldo = saldo;
    }
    
    
    @Parameterized.Parameters
    public static Collection<Double[]> data() {
        Double[][] data = new Double[][] {
                {10.0, 90.0},
                {1.0, 99.0},
                {5.0, 95.0},
                {50.0, 50.0},
                {45.0, 55.0},
                {100.0, 0.0},
                {199.0, 100.0},
                {35.0, 65.0},
                {9.0, 91.0},
                {25.0, 75.000 },
                
        };
        return Arrays.asList(data); 
    }

    /* Aquest mètode s'executa abans de tot */
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests 3 ...");
    }

    /* Aquest mètode s'executa al final de tot */
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando tests 3 ...");
    }

    /* Aquest mètode s'executa abans de cada test */
    @Before
    public void setUp() {
        instance = new CuentaCorriente("Pepe", 100.0);
    }

    /* Aquest mètode s'executa després de cada test */
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testAbona() throws Exception {
        instance.abona(abono);
        assertEquals(saldo, instance.getSaldo(), 1.0E-3);
    }
}
