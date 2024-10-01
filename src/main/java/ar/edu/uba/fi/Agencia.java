package ar.edu.uba.fi;

import java.util.ArrayList;

public class Agencia {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();

    public void registrarVehiculo(Vehiculo unVehiculo) {
        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo.esIgualA(unVehiculo)){
                throw new VehiculoYaRegistradoException();
            }
        }
        vehiculos.add(unVehiculo);
    }

    public void registrarInmueble(Inmueble unInmueble) {
        for(Inmueble inmueble: inmuebles){
            if(inmueble.esIgualA(unInmueble)){
                throw new InmuebleYaRegistradoException();
            }
        }
        inmuebles.add(unInmueble);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Double calcularAlquilerParaCliente(Cliente unCliente) {
        for (Cliente cliente: clientes){
            if(cliente.esIgualA(unCliente)){
                return cliente.calcularPrecioAlquileres();
            }
        }
        throw new ClienteNoRegistradoException();
    }

    public void registrarAlquilerVehiculo(Cliente unCliente, Vehiculo unVehiculo, int dias) {
        Cliente cliente = buscarCliente(unCliente);
        Vehiculo vehiculo = buscarVehiculo(unVehiculo);

        cliente.registrarAlquilerVehiculo(vehiculo, dias);
    }

    public void registrarAlquilerInmueble(Cliente unCliente, Inmueble unInmueble, int dias) {
        Cliente cliente = buscarCliente(unCliente);
        Inmueble inmueble = buscarInmueble(unInmueble);

        cliente.registrarAlquilerInmueble(inmueble, dias);
    }

    private Vehiculo buscarVehiculo(Vehiculo unVehiculo) {
        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo.esIgualA(unVehiculo)){
                return vehiculo;
            }
        }
        throw new VehiculoNoRegistradoException();
    }

    private Inmueble buscarInmueble(Inmueble unInmueble) {
        for (Inmueble inmueble : inmuebles) {
            if (inmueble.esIgualA(unInmueble)) {
                return inmueble;
            }
        }
        throw new InmuebleNoRegistradoException();
    }

    private Cliente buscarCliente(Cliente unCliente) {
        for(Cliente cliente: clientes){
            if(cliente.esIgualA(unCliente)){
                return cliente;
            }
        }
        throw new ClienteNoRegistradoException();
    }

    public Double calcularAlquilerTotal() {
        double suma = 0;
        for(Cliente cliente: clientes){
            suma += cliente.calcularPrecioAlquileres();
        }
        return suma;
    }


}
