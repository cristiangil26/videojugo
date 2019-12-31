package io.cristian.videojuego.armamento;

import io.cristian.videojuego.interfaces.Boomable;

public class Bomba extends Ametralladora implements Boomable {
    public Bomba(int numeroMuniciones) {
        super(numeroMuniciones);
    }

    public String doBoom() {
        return "bomba soltar a discresión";
    }
}
