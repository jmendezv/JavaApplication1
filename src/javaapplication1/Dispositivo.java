/*
 *
 */
package javaapplication1;

/**
 *
 * @author pep
 *
 * Propiedades:
 *
 * - RAM - Tipo (i5, i7, i9 ...) - Velocidad procesador - Tarjeta grafica
 * (Tiene/No tiene) - Puertos USB
 *
 * Constructor/es
 *
 * Getters/Setters
 *
 * toString()
 *
 * Métodos
 *
 * - overclocking aumenta la velocidad del procesador - encender - apagar
 *
 */
public class Dispositivo {

    // Constantes
    private static double MAX_VELOCIDAD_PROCESADOR = 4.5;

    // Propietats
    private int RAM;
    private boolean tarjetaGrafica;
    private int puertosUsb;
    private double velocidadProcessador;
    private String tipoProcesador;
    // true es encendido
    private boolean estado = false;
    private int conectados = 0;

    // Constructor/es
    public Dispositivo(
            int RAM,
            boolean tarjetaGrafica,
            int puertosUsb,
            double velocidadProcessador,
            String tipoProcesador) {

        this.RAM = RAM;
        this.tarjetaGrafica = tarjetaGrafica;
        this.puertosUsb = puertosUsb;
        this.velocidadProcessador = velocidadProcessador;
        this.tipoProcesador = tipoProcesador;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public boolean isTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(boolean tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public int getPuertosUsb() {
        return puertosUsb;
    }

    public void setPuertosUsb(int puertosUsb) {
        this.puertosUsb = puertosUsb;
    }

    public double getVelocidadProcessador() {
        return velocidadProcessador;
    }

    public void setVelocidadProcessador(double velocidadProcessador) {
        this.velocidadProcessador = velocidadProcessador;
    }

    public String getTipoProcesador() {
        return tipoProcesador;
    }

    public void setTipoProcesador(String tipoProcesador) {
        this.tipoProcesador = tipoProcesador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "RAM=" + RAM + ", tarjetaGrafica=" + tarjetaGrafica + ", puertosUsb=" + puertosUsb + ", velocidadProcessador=" + velocidadProcessador + ", tipoProcesador=" + tipoProcesador + ", estado=" + estado + ", conectados=" + conectados + '}';
    }



    public void enciende() {
        estado = true;
    }

    public void apaga() {
        estado = false;
    }

    public void overclocking() {
        if (estado) {
            this.velocidadProcessador = Math.min(MAX_VELOCIDAD_PROCESADOR,
                    velocidadProcessador * 1.5);
        }
    }
    
    // reset
    public void reset() {
        if(estado) {
            estado = false;
            estado = true;
        }
    }
    
    public void conectar() {
        if (conectados < puertosUsb) {
            conectados++;
        }
    }
    
    public void desconecta() {
        if (conectados > 0) {
            conectados--;
        }
    }

    public static void main(String[] args) {
        Dispositivo disp = new Dispositivo(32, true, 4, 2.2, "I9");
        System.out.println(disp);
        disp.conectar();
        disp.conectar();
        disp.conectar();
        disp.conectar();
        disp.conectar();
        disp.conectar();
        System.out.println(disp);
        disp.desconecta();
        disp.desconecta();
        disp.desconecta();
        disp.desconecta();
        disp.desconecta();
        disp.desconecta();
        System.out.println(disp);
        
        
        
    }

}
