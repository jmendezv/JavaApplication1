/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author pep
 */
public class Calculadora {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int producto(int a, int b) {
        return a * b;
    }
    
    public static int modulo(int a, int b) {
        return a % b;
    }
    
    // peso en kgs y altura en metros
    public static double imc(double peso, double altura) {
        return peso / (altura * altura);
    }

}
