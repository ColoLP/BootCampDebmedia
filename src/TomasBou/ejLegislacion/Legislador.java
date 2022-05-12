package TomasBou.ejLegislacion;

public abstract  class Legislador extends Persona {

    String provinciaQueRepresenta;

    public Legislador(String nombre, String provinciaQueRepresenta) {
        super(nombre);
        this.provinciaQueRepresenta= provinciaQueRepresenta;
    }

    public abstract String getCamaraEnQueTrabaja();


}
