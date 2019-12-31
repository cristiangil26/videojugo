package io.cristian.videojuego.armamento;

import io.cristian.videojuego.interfaces.Ametrallable;

public class Ametralladora extends Armamento implements Ametrallable {
    public Ametralladora(int numeroMuniciones) {
        super(numeroMuniciones);
    }

    public String doShoot() {
        return "disparar ráfagas de balas";
    }
}
