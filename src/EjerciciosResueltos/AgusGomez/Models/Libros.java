package EjerciciosResueltos.AgusGomez.Models;

import EjerciciosResueltos.AgusGomez.Interfaces.Prestable;

public class Libros extends Biblioteca implements Prestable {

    //Atributos

    private boolean prestado;

    //Constructores

    public Libros(String nombre, int codigo, int anoPublicacion) {
        super(nombre, codigo, anoPublicacion);
        this.prestado = false;
    }

    //Getters y Setters

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    //Métodos

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro: ").append(getNombre())
                .append("\nCódigo: ").append(getCodigo())
                .append("\nAño de publicación: ").append(getAnoPublicacion());
        if (prestado) {
            sb.append("\nEl libro está prestado.");
        } else {
            sb.append("\nEl libro está disponible para prestar.");
        }
        sb.append("\n=======================================");

        return sb.toString();
    }

    public void devuelveAnoLibro() {
        System.out.println("El año de publicación del libro '" + getNombre() + "' es: " + getAnoPublicacion());
    }

    public void devuelveCodigoLibro(){
        System.out.println("El código del libro '" + getNombre() + "' es: " + getCodigo());
    }

    @Override
    public boolean presta() {
        prestado = true;
        return prestado;
    }

    @Override
    public boolean devuelve() {
        prestado = false;
        return prestado;
    }

}
