package Modelos;

public abstract class Legislador extends Persona{
    // Atributo
    private String provinciaQueRepresenta,bloque;
    private long sueldo;
    private int abstenciones;


    //Constructor
    public Legislador(){
    }

    public Legislador(int edad, String nombre, String provinciaQueRepresenta,String bloque, long sueldo, int abstenciones) {
        super(edad, nombre);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.sueldo = sueldo;
        this.abstenciones = abstenciones;
    }

    //Setters y getters

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

    public int getAbstenciones() {
        return abstenciones;
    }

    public void setAbstenciones(int abstenciones) {
        this.abstenciones = abstenciones;
    }


    // Metodos
    public String getCamaraEnQueTrabaja(){
        return "alguna";

    }

    @Override
    public String toString() {
        return super.toString() +
                " Provincia que representa='" + getProvinciaQueRepresenta() + '\'' +
                ", bloque='" + getBloque() + '\'' +
                ", sueldo=" + getSueldo() +
                ", abstenciones=" + getAbstenciones();

    }
}
