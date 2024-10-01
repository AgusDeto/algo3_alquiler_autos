package ar.edu.uba.fi;

public class Departamento extends Inmueble{

    private final int metrosCuadrados;

    public Departamento(String direccion, int metrosCuadrados){
        super(direccion);
        this.metrosCuadrados = metrosCuadrados;
    }

    public double alquilarPorDias(int dias){
        return metrosCuadrados * dias;
    }
}
