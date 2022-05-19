package Modelos;

public class Senador extends Legislador {
    //Atributos
    private String camara="Alta";

    //Constructores
    public Senador() {
    }

    public Senador(int edad, String nombre, String provinciaQueRepresenta, String bloque, long sueldo, int abstenciones) {
        super(edad, nombre, provinciaQueRepresenta, bloque, sueldo, abstenciones);

    }
    //Setters y Getters

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    //Metodos
    @Override
    public String getCamaraEnQueTrabaja() {
        return getCamara();
    }

    @Override
    public String toString() {
        return super.toString() +
                " camara= " + getCamaraEnQueTrabaja();
    }
}
