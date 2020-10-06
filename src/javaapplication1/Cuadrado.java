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
public class Cuadrado {

    // Propiedades
    private double lado;
    private Coord coordenada;

    // Constructores
    public Cuadrado(Coord coordenada, double lado) {
        this.coordenada = coordenada;
        this.lado = lado;
    }

    public Cuadrado(double lado, double x, double y) {
        this.coordenada = new Coord(x, y);
        this.lado = lado;
    }

    // Getters/Setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + ", coordenada=" + coordenada + '}';
    }


    // Formula área del cuadrado
    public double calcArea() {
        return lado * lado;
    }

    // Fórmula perímetro del cuadrado
    public double calcPerimetro() {
        return lado * 4;
    }
    
    
    public Coord calcCoordenadaFinal() {
        return new Coord(coordenada.getX() + lado, coordenada.getY() + lado);
    }
    
    // Devuele true si el punto esta dentro de este cuadrado y false si no
    public boolean interior(Coord punto) {
        // ....
        return false;
    }

    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado(10.0, 3, 3);
        // Llama a toString()
        System.out.println(c1);
        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimetro());
    }

}
