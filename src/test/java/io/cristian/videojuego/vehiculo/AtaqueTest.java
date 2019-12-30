package io.cristian.videojuego.vehiculo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AtaqueTest {
    private Ataque ataque;
    private Jeep jeep;
    private Tanque tanque;
    private Motocicleta motocicleta;
    private Camion camion;
    private Bombardero bombardero;
    private Avion avion;
    private Crucero crucero;
    private PortaAvion portaAvion;
    @Before
    public void setUp() throws Exception {
        ataque = new Ataque();
        tanque = new Tanque(6,4,"Tanque sherman M4");
        jeep = new Jeep(4,2,"jeep de reconocimiento");
        motocicleta = new Motocicleta(2,0,"Motocileta Harley");
        camion = new Camion(10,3,"Camiòn de transporte de suministro HI");
        bombardero = new Bombardero(5,6,"Bombardero B56");
        avion = new Avion(30,10,"Speed fighter");
        crucero = new Crucero(50,20,"Crucero tipo Alabama");
        portaAvion = new PortaAvion(100,50,"Porta aviòn tipo Bismarck");

        ataque.adicionarVehiculo(jeep);
        ataque.adicionarVehiculo(tanque);
        ataque.adicionarVehiculo(motocicleta);
        ataque.adicionarVehiculo(bombardero);
        ataque.adicionarVehiculo(camion);
        ataque.adicionarVehiculo(avion);
        ataque.adicionarVehiculo(crucero);
        ataque.adicionarVehiculo(portaAvion);
    }

    @Test
    public void adicionarVehiculo() {
        Assert.assertTrue("el objeto no puede ser nulo",ataque.adicionarVehiculo(jeep));
    }

    @Test
    public void getNumPersonas() {
        Assert.assertEquals("el nùmero de personas no coincide",207,ataque.getNumPersonas());
    }
}