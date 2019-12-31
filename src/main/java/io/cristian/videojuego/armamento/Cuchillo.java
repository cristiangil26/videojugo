package io.cristian.videojuego.armamento;

import io.cristian.videojuego.interfaces.Knifeable;

public class Cuchillo extends Ametralladora implements Knifeable {
    public Cuchillo(int numeroMuniciones) {
        super(numeroMuniciones);
    }

    public String doSlash() {
        return "ataque con cuchillo";
    }
}
