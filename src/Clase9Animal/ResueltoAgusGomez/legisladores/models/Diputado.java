package debmedia.ejercicios.legisladores.models;

public class Diputado extends Legislador {

    //Constructores
    public Diputado(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    //Métodos
    @Override
    public String getCamaraEnQueTrabaja() {
        return "Integrante de la Cámara de Diputados.";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(getNombre())
                .append("\nApellido: ").append(getApellido())
                .append("\nEdad: ").append(getEdad())
                .append("\n").append(getCamaraEnQueTrabaja())
                .append("\nRepresentando a la provincia de ").append(getProvinciaQueRepresenta())
                .append(".\n=============================");

        return sb.toString();
    }
}
