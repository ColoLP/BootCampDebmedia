package MaxiVilchez.LibrosYRevistas.Modulos;

public class Literatura {
    //Atributos------------------
    int codigo;
    String titulo;
    int anioPublicacion;

    // Constructores-------------
    public Literatura(String titulo, int codigo, int anioPublicacion){
        this.titulo=titulo;
        this.codigo=codigo;
        this.anioPublicacion=anioPublicacion;
    }
    //Setters,Getters-------------

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    //Metodos--------------------
    public int leerAnioPublicacion(){
        return this.anioPublicacion;
    }
    public int leerCodigo(){
        return this.codigo;
    }
}
//Atributos--------------------
