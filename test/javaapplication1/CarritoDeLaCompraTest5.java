/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

/**
 *
 * @author pep
 * 
 * Ejemplo de aplicacion de @Rules: timeout y exceptions
 * 
 */
public class CarritoDeLaCompraTest5 {
    
   private CarritoDeLaCompra instance;
   
   @Rule
   public final ExpectedException exception = ExpectedException.none();
   
   @Rule 
   public Timeout timeout = Timeout.millis(250);
    
    public CarritoDeLaCompraTest5() {
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
    @Test
    public void testAñade() throws Exception {
        exception.expect(Exception.class);
        exception.expectCause(CoreMatchers.isA(IllegalAccessException.class));
        //exception.expectMessage(CoreMatchers.startsWith("Detalle es nulo"));
        exception.expectMessage("Detalle es nulo");
        instance.añade(null);
        
    }
    
        @Test
        //@Ignore
    public void testAñade2() throws Exception {
        instance.añade(new Detalle(1, new Item(135, "Nike", "Deporivas", 124.99), 1));
        
    }

    /**
     * Test of elimina method, of class CarritoDeLaCompra.
     */
    @Test
    public void testElimina2() throws Exception {
        exception.expect(Exception.class);
        exception.expectCause(CoreMatchers.isA(IllegalAccessException.class));
        //exception.expectMessage(CoreMatchers.startsWith("Detalle es nulo"));
        exception.expectMessage("Detalle es nulo");
        instance.elimina(null);
       
    }
    
}
