package io.cristian.videojuego.armamento;

public class Armamento {
    private int numeroMuniciones;

    public Armamento(int numeroMuniciones) {
        this.numeroMuniciones = numeroMuniciones;
    }

    public int getNumeroMuniciones() {
        return numeroMuniciones;
    }

    public void setNumeroMuniciones(int numeroMuniciones) {
        this.numeroMuniciones = numeroMuniciones;
    }
}
