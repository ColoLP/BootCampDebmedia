package MaxiVilchez.LibrosYRevistas.Modulos;


public class Libro extends Literatura implements IPrestable {

    //Atributos--------------------
    boolean prestado;

    //Constructores----------------
    public Libro(String titulo, int codigo, int anioPublicacion) {
        super(titulo, codigo, anioPublicacion);
        boolean prestado = false;
    }

    //Setters,Getters---------------

    public boolean isPrestado() {
        return prestado;
    }

    //Metodos-----------------------

    @Override
    public String toString() {
        return "Libro{" +
                "prestado=" + this.prestado +
                ", titulo='" + this.titulo + '\'' +
                ", codigo=" + this.codigo +
                ", anioPublicacion=" + this.anioPublicacion +
                '}';
    }

    //Metodos Interfaz
    @Override
    public void prestar() {
        if (this.prestado==true){
            System.out.println("Este libro ya fue prestado.");
        } else {
            this.prestado = true;
        }
    }

    @Override
    public void devolver() {
        if (this.prestado!=true){
            System.out.println("Este libro ya fue devuelto.");
        } else {
            this.prestado=false;
        }
    }

    @Override
    public boolean prestado() {
        return this.prestado;

    }
}
