package io.cristian.videojuego.vehiculo;

import io.cristian.videojuego.armamento.Armamento;

import java.util.ArrayList;

public class Vehiculo {
    private int numPersonas;
    private double capacidadToneladas;
    private String tipo;
    private ArrayList<Armamento> armamentos;

    public Vehiculo(int numPersonas, double capacidadToneladas, String tipo) {
        this.numPersonas = numPersonas;
        this.capacidadToneladas = capacidadToneladas;
        this.tipo = tipo;
        armamentos = new ArrayList<Armamento>();
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

    public ArrayList<Armamento> getArmamentos() {
        return armamentos;
    }

    public void setArmamentos(ArrayList<Armamento> armamentos) {
        this.armamentos = armamentos;
    }
}
