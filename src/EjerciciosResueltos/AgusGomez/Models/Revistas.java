package EjerciciosResueltos.AgusGomez.Models;

public class Revistas extends Biblioteca{
    //Atributos

    private int numero;

    //Constructores

    public Revistas(String nombre, int codigo, int anoPublicacion, int numero) {
        super(nombre, codigo, anoPublicacion);
        this.numero = numero;
    }

    //Getters y Setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Métodos

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Revista: ").append(getNombre())
                .append("\nCódigo: ").append(getCodigo())
                .append("\nAño de publicación: ").append(getAnoPublicacion())
                .append("\nNúmero: ").append(getNumero())
                .append("\n=======================================");

        return sb.toString();
    }

    public void devuelveAnoRev() {
        System.out.println("El año de publicación de la revista '" + getNombre() +  "' es: " + getAnoPublicacion());
    }

    public void devuelveCodigoRev() {
        System.out.println("El código de la revista '" + getNombre() + "' es: " + getCodigo());

    }
}
