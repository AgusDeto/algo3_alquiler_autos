package ar.edu.uba.fi;

public class Cabania extends Inmueble{
    private final int cantInquilinos;

    public Cabania(String direccion, int cantInquilinos) {
        super(direccion);
        this.cantInquilinos = cantInquilinos;
    }

    public double alquilarPorDias(int dias){
        return dias * (cantInquilinos^2);
    }
}
