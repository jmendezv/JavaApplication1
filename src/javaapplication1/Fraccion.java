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
public class Fraccion {

    // Propiedades
    private int numerador;
    private int denominador;

    // Constructo/es: sirven para crear instancias (variables) de a clase.
    public Fraccion(int numerador, int denominador) throws Exception {
        if (denominador == 0) {
            throw new Exception("Denominador no puede ser 0");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }

    // Maximo común divisor
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    public Fraccion suma(int n) throws Exception {
        return null;
    }
    
    
    public Fraccion resta(int n) throws Exception {
        return null;
    }
    
    
    public Fraccion producto(int n) throws Exception {
        return null;
    }
    
    
    public Fraccion division(int n) throws Exception {
        return null;
    }
    
    public Fraccion suma(Fraccion fraccion) throws Exception {
        final Fraccion resultado = new Fraccion(
                numerador * fraccion.denominador + fraccion.numerador * denominador,
                denominador * fraccion.denominador);
        int mcd = mcd(numerador, denominador);
        return new Fraccion(resultado.numerador / mcd, resultado.denominador / mcd);
    }

    public Fraccion resta(Fraccion fraccion) throws Exception {
        return new Fraccion(
                numerador * fraccion.denominador - fraccion.numerador * denominador,
                denominador * fraccion.denominador);
    }

    public Fraccion producto(Fraccion fraccion) throws Exception {
        return new Fraccion(
                numerador * fraccion.numerador, denominador * fraccion.denominador);
    }

    public Fraccion division(Fraccion fraccion) throws Exception {
        return new Fraccion(
                numerador * fraccion.denominador, denominador * fraccion.numerador);
    }

//    public static void main(String[] args) {
//        final Fraccion f1 = new Fraccion(1, 4);
//        final Fraccion f2 = new Fraccion(3, 5);
//        final Fraccion f3 = f1.suma(f2);
//        System.out.println(f3);
//    }
}
