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
public class Detalle {
    private int id;
    private Item item;
    private int cantidad;

    public Detalle(int id, Item item, int cantidad) {
        this.id = id;
        this.item = item;
        this.cantidad = cantidad;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Detalle{" + "id=" + id + ", item=" + item + ", cantidad=" + cantidad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Detalle other = (Detalle) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
