package io.cristian.videojuego.vehiculo;

import io.cristian.videojuego.armamento.Ametralladora;
import io.cristian.videojuego.armamento.Armamento;
import io.cristian.videojuego.armamento.Bomba;

import java.util.ArrayList;

public class Ataque {

    ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public boolean adicionarVehiculo(Vehiculo vehiculo){
        if (vehiculo != null){
            vehiculos.add(vehiculo);
            return true;
        }
        return false;
    }

    public int getNumPersonas(){
        int sumaPersonas = 0;
        if(vehiculos.size() > 0){
            for (Vehiculo vehiculo: vehiculos){
                sumaPersonas+=vehiculo.getNumPersonas();
            }
        }
        return sumaPersonas;
    }
    public double capacidadCarga(){
        int capacidadcarga = 0;
        if(vehiculos.size() > 0){
            for (Vehiculo vehiculo: vehiculos){
                capacidadcarga+=vehiculo.getCapacidadToneladas();
            }
        }
        return capacidadcarga;
    }
    public String ataqueAmetralladora(){
        String ataque = "";
       for (Vehiculo vehiculo: this.getVehiculos()){
           for (Armamento armamento:vehiculo.getArmamentos()) {
               if(armamento instanceof Ametralladora) {
                   ataque += vehiculo.getTipo() +" "+(((Ametralladora) armamento).doShoot())+" ";
               }
           }
       }
       return ataque;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public static void main(String[] args) {
        Ataque ataque = new Ataque();
        Tanque tanque = new Tanque(6,4,"Tanque sherman M4");
        ArrayList<Armamento> armamentos = new ArrayList<Armamento>();
        armamentos.add(new Ametralladora(10));
        tanque.setArmamentos(armamentos);
        Jeep jeep = new Jeep(4,2,"jeep de reconocimiento");
        Motocicleta motocicleta = new Motocicleta(2,0,"Motocileta Harley");


        motocicleta.setArmamentos(armamentos);
        ataque.adicionarVehiculo(jeep);
        ataque.adicionarVehiculo(tanque);
        ataque.adicionarVehiculo(motocicleta);
        System.out.println("Ataque vehiculos que poseen ametralladoras:");
        System.out.println(ataque.ataqueAmetralladora());
    }
}
