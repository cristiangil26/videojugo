package io.cristian.videojuego.vehiculo;

import io.cristian.videojuego.armamento.Ametralladora;
import io.cristian.videojuego.armamento.Armamento;
import io.cristian.videojuego.armamento.Bomba;
import io.cristian.videojuego.armamento.Cuchillo;
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
    private ArrayList<Armamento> armamentoUno;
    private ArrayList<Armamento> armamentoDos;
    private ArrayList<Armamento> armamentoTres;
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
        armamentoUno = new ArrayList<Armamento>();
        armamentoDos = new ArrayList<Armamento>();
        armamentoTres = new ArrayList<Armamento>();
        armamentoDos.add(new Bomba(20));
        armamentoUno.add(new Ametralladora(10));
        armamentoTres.add(new Cuchillo(5));

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

    @Test
    public void capacidadCarga() {
        Assert.assertEquals("la capacidad total en toneladas no coinciden",95.0,ataque.capacidadCarga(),0);
    }

    @Test
    public void ataqueAmetralladora() {
        motocicleta.setArmamentos(armamentoUno);
        Assert.assertEquals("el ataque de los vehículos que poseen ametralladores no es el correcto",
                "Motocileta Harley disparar ráfagas de balas ",ataque.ataqueAmetralladora());
    }

    @Test
    public void ataqueBombarderos() {
        avion.setArmamentos(armamentoDos);
        Assert.assertEquals("el ataque de los bombarderos no es igual",
                "Speed fighter bomba soltar a discresión ",ataque.ataqueBombarderos());
    }

    @Test
    public void ataqueCuchillo() {
        motocicleta.setArmamentos(armamentoTres);
        Assert.assertEquals("el ataque de los vehículos que tiene cuchillo",
                "Motocileta Harley ataque con cuchillo ",ataque.ataqueCuchillo());
    }
}