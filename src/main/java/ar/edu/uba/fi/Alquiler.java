package ar.edu.uba.fi;

public class Alquiler {


    private final Vehiculo vehiculo;
    private final int dias;
    private final Inmueble inmueble;

    public Alquiler(Vehiculo vehiculo, int dias) {
        this.vehiculo = vehiculo;
        this.dias = dias;
        this.inmueble = null;
    }

    public Alquiler(Inmueble inmueble, int dias) {
        this.vehiculo = null;
        this.dias = dias;
        this.inmueble = inmueble;
    }

    public double calcularPrecio() {
        if(this.inmueble == null){
            return vehiculo.alquilarPorDias(dias);
        }
        else{
            return inmueble.alquilarPorDias(dias);
        }
    }
}
