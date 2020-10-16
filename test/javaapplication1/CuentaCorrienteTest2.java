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
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author pep
 * 
 * Prueba a fondo el método ingresa de la clase CuentaCorriente
 * 
 */
@RunWith(Parameterized.class)
public class CuentaCorrienteTest2 {

    private CuentaCorriente instance;
    
    private final Double SALDO_INICIAL = 50.0;

    @Parameter(0)
    public double ingres;
    @Parameter(1)
    public double saldo;

    @Parameterized.Parameters
    public static Collection<Double[]> data() {
        
        Double[][] data = new Double[][]{
            {10.0, 60.0},
            {20.0, 70.0},
            {30.0, 80.0},
            {40.0, 90.0},
            {50.0, 100.0},
            {60.0, 110.0},
            {70.0, 120.0},
            {80.0, 130.0},
            {90.0, 140.0},
            {100.0, 150.0},
            {110.0, 160.0},
            {120.0, 170.0},
            {5.0, 55.0},
            {250.0, 300.0},
            {195.0, 245.0}
        };

        return Arrays.asList(data);
    }

    public CuentaCorrienteTest2() {
    }

    /* Aquest mètode s'executa abans de tot */
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests 2 ...");
    }

    /* Aquest mètode s'executa al final de tot */
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando tests 2 ...");
    }

    /* Aquest mètode s'executa abans de cada test */
    @Before
    public void setUp() {
        instance = new CuentaCorriente("Pepe", SALDO_INICIAL);
    }

    /* Aquest mètode s'executa després de cada test */
    @After
    public void tearDown() {
        instance = null;
    }

    /*
    * The @Ignore annotation allow to statically ignore a test. 
    * Alternatively you can use Assume.assumeFalse or 
    * Assume.assumeTrue to define a condition for the test. 
    * Assume.assumeFalse marks the test as invalid, if its condition 
    * evaluates to true. 
    * Assume.assumeTrue evaluates the test as invalid if its condition 
    * evaluates to false.
     */
//    @Test
//    public void testAbona1() {
//        // Assume.assumeFalse(System.getProperty("os.name").contains("Linux"));
//        Assume.assumeTrue(false);
//    }
    @Test
    public void testIngressa() throws Exception {
        instance.ingresa(ingres);
        assertEquals(saldo, instance.getSaldo(), 1.0E-3);
    }

}














