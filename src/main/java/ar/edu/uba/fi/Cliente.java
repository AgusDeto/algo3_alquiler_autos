package ar.edu.uba.fi;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final String nombre;
    private ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void registrarAlquilerVehiculo(Vehiculo vehiculo, int dias) {
        alquileres.add(new Alquiler(vehiculo,dias));
    }

    public void registrarAlquilerInmueble(Inmueble inmueble, int dias) {
        alquileres.add(new Alquiler(inmueble,dias));
    }

    public Double calcularPrecioAlquileres() {
        double suma = 0;
        for (Alquiler alquiler: alquileres){
            suma += alquiler.calcularPrecio();
        }
        return suma;
    }

    public boolean esIgualA(Cliente unCliente) {
        return unCliente.tieneNombre(nombre);
    }

    private boolean tieneNombre(String unNombre) {
        return (unNombre == nombre);
    }
}
