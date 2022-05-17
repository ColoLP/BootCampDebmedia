package Modelos;

public class Diputado extends Legislador {
    //Atributos
    String camara="Baja";

    //Constructor

    public Diputado() {

    }

    public Diputado(int edad, String nombre, String provinciaQueRepresenta, String bloque, long sueldo, int abstenciones) {
        super(edad, nombre, provinciaQueRepresenta, bloque, sueldo, abstenciones);

    }

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
