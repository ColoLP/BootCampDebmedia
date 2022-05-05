package EjerciciosResueltos.AgusGomez.Models;

public class Biblioteca {

    //Atributos

    private String nombre;
    private int codigo;
    private int anoPublicacion;

    //Constructores

    public Biblioteca(String nombre, int codigo, int anoPublicacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.anoPublicacion = anoPublicacion;
    }

    //Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    //Metodos
}
