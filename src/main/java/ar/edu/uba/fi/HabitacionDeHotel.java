package ar.edu.uba.fi;

public class HabitacionDeHotel extends Inmueble{
    private final int cantidadDeCamas;

    public HabitacionDeHotel(String direccion, int cantidadDeCamas){
        super(direccion);
        this.cantidadDeCamas = cantidadDeCamas;
    }

    public double alquilarPorDias(int dias){
        return cantidadDeCamas * (dias + 500);
    }
}
