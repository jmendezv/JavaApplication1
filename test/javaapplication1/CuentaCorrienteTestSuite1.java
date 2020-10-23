/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author pep
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    javaapplication1.CuentaCorrienteTest1.class,
    javaapplication1.CuentaCorrienteTest2.class,
    javaapplication1.CuentaCorrienteTest3.class})
public class CuentaCorrienteTestSuite1 {

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Statrting Suite");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("Ending Suite");
    }

}
