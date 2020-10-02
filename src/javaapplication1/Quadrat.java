/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * https://www.vogella.com/tutorials/JUnit/article.html
 */
package javaapplication1;

class Coordenada {

    private double x;
    private double y;

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordenada{" + "x=" + x + ", y=" + y + '}';
    }

}

/**
 *
 * @author pep
 */
public class Quadrat {

    private Coordenada coordenada;
    private double costat;

    public Quadrat(Coordenada coordenada, double costat) {
        this.coordenada = coordenada;
        this.costat = costat;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public double getCostat() {
        return costat;
    }

    public void setCostat(double costat) {
        this.costat = costat;
    }

    @Override
    public String toString() {
        return "Quadrat{" + "coordenada=" + coordenada + ", costat=" + costat + '}';
    }

    public double area() {
        return costat * costat;
    }

    public double perimetre() {
        return 4 * costat;
    }

    public Coordenada cantonadaInferiorDreta() {
        return new Coordenada(coordenada.getX() + costat, coordenada.getY() + costat);
    }

    public boolean interior(Coordenada punt) {
        Coordenada fin = cantonadaInferiorDreta();
        if (punt.getX() >= coordenada.getX() && punt.getY() >= coordenada.getY()) {
            if (punt.getX() <= fin.getX() && punt.getY() <= fin.getY()) {
                return true;
            }
        }
        return false;
    }
    
    // Homework
    public boolean exterior(Coordenada punt) {
        return false;
    }
}
