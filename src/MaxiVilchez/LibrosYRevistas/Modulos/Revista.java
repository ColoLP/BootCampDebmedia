package MaxiVilchez.LibrosYRevistas.Modulos;

public class Revista extends Literatura {
    //Atributos------------------
    int numeroRevista;

    //Constructores--------------
    public Revista(String titulo,int codigo, int anioPublicacion, int numeroRevista) {
        super(titulo, codigo, anioPublicacion);
        this.numeroRevista=numeroRevista;
    }

    //Setters,Getters------------

    public int getNumeroRevista() {
        return numeroRevista;
    }

    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    //Metodos--------------------

    @Override
    public String toString() {
        return "Revista{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", numeroRevista=" + numeroRevista +
                '}';
    }
}
