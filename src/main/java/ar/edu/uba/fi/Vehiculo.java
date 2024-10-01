package ar.edu.uba.fi;

public abstract class Vehiculo implements Alquilable{
    protected String patente;

    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public abstract double alquilarPorDias(int dias);

    public boolean esIgualA(Vehiculo unVehiculo){
        return unVehiculo.tieneMismaPatente(this.patente);
    }

    private boolean tieneMismaPatente(String patente){
        return (this.patente == patente);
    }
}
