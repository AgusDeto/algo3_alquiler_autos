package ar.edu.uba.fi;

public abstract class Inmueble implements Alquilable{

    protected String direccion;

    public Inmueble(String direccion){this.direccion = direccion;}

    public abstract double alquilarPorDias(int dias);

    public boolean esIgualA(Inmueble otroInmueble){return otroInmueble.tieneMismaDireccion(this.direccion);}

    private boolean tieneMismaDireccion(String direccion){return this.direccion == direccion;}
}
