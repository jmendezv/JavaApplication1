/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.security.InvalidParameterException;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author pep
 * 
 * POJO Plain Old Java Object
 * 
 */
public class CuentaCorriente {

    // propiedades
    private String titular;
    private double saldo;

    
   // constructores
    public CuentaCorriente(String titular) {
        this(titular, 0.0);
    }

    public CuentaCorriente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

//    public String getTitular() {
//        return titular;
//    }

//    public void setTitular(String titular) {
//        this.titular = titular;
//    }

    public double getSaldo() {
        return saldo;
    }

//    public void setSaldo(double saldo) {
//        this.saldo = saldo;
//    }
    
    
    @Override
    public String toString() {
        return "CuentaCorriente{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }

    public void ingresa(double ingreso) throws Exception {
        if (ingreso < 0) throw new Exception("Ingreso negativo: " + ingreso, 
        new InvalidParameterException());
        // Se escribe sólo a efectos de demostración
        TimeUnit.MILLISECONDS.sleep(250);
        saldo += ingreso;
    }

    public void abona(double abono) throws Exception {
        if (abono < 0) throw new Exception("Abono negativo: " + abono, 
        new InvalidParameterException());
        if (abono > saldo) {
            throw new Exception("Saldo insuficiente: " + saldo, 
                    new IllegalArgumentException());
        }
        saldo -= abono;
    }

}
