package ejLegislacion;

public abstract  class Legislador extends Persona {

    String provinciaQueRepresenta;

    public Legislador(String nombre, String provinciaQueRepresenta) {
        super(nombre);
        this.provinciaQueRepresenta= this.provinciaQueRepresenta;
    }

    public abstract String getCamaraEnQueTrabaja();


}
