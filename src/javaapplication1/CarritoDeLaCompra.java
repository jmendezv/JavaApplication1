/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author pep
 */
public class CarritoDeLaCompra {
    private ArrayList<Detalle> carrito = new ArrayList();
    
    public void añade(Detalle detalle) {
        carrito.add(detalle);
    }
    
    public void elimina(Detalle detalle) {
        carrito.remove(detalle);
    }
    
    public double checkout() {
        double total = 0;
        int size = carrito.size();
        for (int i = 0; i < size; i++) {
            Detalle detalle = carrito.get(i);
            total += 
                    detalle.getCantidad() * 
                    detalle.getItem().getPrecio();
        }
        return total;
    }

    public ArrayList<Detalle> getCarrito() {
        return carrito;
    }
    
    
}












