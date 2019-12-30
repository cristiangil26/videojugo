package io.cristian.videojuego.vehiculo;

public class Vehiculo {
    private int numPersonas;
    private double capacidadToneladas;
    private String tipo;

    public Vehiculo(int numPersonas, double capacidadToneladas, String tipo) {
        this.numPersonas = numPersonas;
        this.capacidadToneladas = capacidadToneladas;
        this.tipo = tipo;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public String getTipo() {
        return tipo;
    }
}
