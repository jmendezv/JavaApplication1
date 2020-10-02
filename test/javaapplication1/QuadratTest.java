/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author pep
 */
public class QuadratTest {

    private Quadrat instance;
    
    private final double POS_X = 0.0;
    private final double POS_Y = 0.0;
    private final double LADO = 10.0;

    public QuadratTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests ...");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando tests ...");
    }


    /* test fixture ó condicions inicials */

    @Before
    public void setUp() {
        instance = new Quadrat(new Coordenada(POS_X, POS_Y), LADO);
    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of area method, of class Quadrat.
     */
    @Test
    public void testArea() {
        // 1.0E-3 == 0-001
        Assert.assertEquals(LADO * LADO, instance.area(), 1.0E-3);
    }

    /**
     * Test of perimetre method, of class Quadrat.
     */
    @Test
    // @Ignore
    public void testPerimetre() {
        Assert.assertEquals(4 * LADO, instance.perimetre(), 1.0E-3);
    }

    /**
     * Test of cantonadaInferiorEsquerra method, of class Quadrat.
     */
    @Test
    // @Ignore
    public void testCantonadaInferiorDreta() {
        Coordenada coordenada = instance.cantonadaInferiorDreta();
        Assert.assertEquals(POS_X + LADO, coordenada.getX(), 1.0E-3);
        Assert.assertEquals(POS_Y + LADO, coordenada.getY(), 1.0E-3);
    }

}
