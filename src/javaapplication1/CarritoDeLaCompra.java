/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author pep
 */
public class CarritoDeLaCompra {
    private ArrayList<Detalle> carrito = new ArrayList();
    
    public void añade(Detalle detalle) throws Exception {
        if (detalle == null) throw new Exception("Detalle es nulo", 
                new IllegalAccessException());
        
        TimeUnit.MILLISECONDS.sleep(240);
        carrito.add(detalle);
    }
    
    public void elimina(Detalle detalle) throws Exception {
        if (detalle == null) throw new Exception("Detalle es nulo", 
        new IllegalAccessException());
        carrito.remove(detalle);
    }
    
    public double checkout()  {
        // Inicializams una variable total a 0
        double total = 0;
        // calculamos el tamaño del carrito
        int size = carrito.size();
        // recorremos la lista
        for (int i = 0; i < size; i++) {
            // recuperamos detalle i-ésimo, el la posición i
            Detalle detalle = carrito.get(i);
            // acumulamos el total
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












