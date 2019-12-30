package io.cristian.videojuego.vehiculo;

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

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
