/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.IOException;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author pep
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CuentaCorrienteTest4 {
    
    private CuentaCorriente instance;
    
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();
    
    @Rule 
    public final ExpectedException thrown = ExpectedException.none();
    
    public CuentaCorrienteTest4() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests ...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando tests ...");
    }
    
    @Before
    public void setUp() {
        instance = new CuentaCorriente("Pepe", 1_000.0);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }
    
    @Test
    public void temporaryFolderTest() throws IOException {
        File file = folder.newFile();
        Assert.assertTrue(file.exists());
    }
    
    @Test
    public void abonaTest() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectCause(Is.isA(IllegalArgumentException.class));
        thrown.expectMessage(CoreMatchers.startsWith("Saldo insuficiente"));
        instance.abona(1_001.0);
    }

    
}
