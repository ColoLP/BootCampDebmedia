package debmedia.ejercicios.legisladores.models;

abstract public class Legislador extends Persona {

    //Atributos
    private String provinciaQueRepresenta;

    //Constructores
    public Legislador(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    //Getters & Setters

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    //Métodos
    public abstract String getCamaraEnQueTrabaja();
}
