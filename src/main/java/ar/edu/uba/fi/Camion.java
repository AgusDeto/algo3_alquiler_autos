package ar.edu.uba.fi;

public class Camion {
    private Patente patente;
    private int PMA;

    public Camion(Patente patente, int PMA) {

        this.patente = patente;
        this.PMA = PMA;
    }

    public Double alquilarPor(int cantidadDias) {
        return base(cantidadDias) + pma(cantidadDias);
    }

    private Double pma(int cantidadDias) {
        return 300.0 * 1000 * cantidadDias;
    }

    private Double base(int cantidadDias) {
        return 500.0 * cantidadDias;
    }
}