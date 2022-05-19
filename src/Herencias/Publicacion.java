package Herencias;

public class Publicacion {
    private String codigo;
    private String titulo;
    private int anio;

    public Publicacion(String codigo, String titulo, int anio) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                '}';
    }
}

interface Prestable {
    void prestar();

    void devolver();

    boolean prestado();

}

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(String codigo, String titulo, int anio) {
        super(codigo, titulo, anio);
        prestado = false;
    }

    @Override
    public void prestar() {
        prestado = true;

    }

    @Override
    public void devolver() {
        prestado = false;

    }

    @Override
    public boolean prestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "prestado=" + prestado +
                '}';
    }
}



