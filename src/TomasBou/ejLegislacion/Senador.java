package TomasBou.ejLegislacion;

public class Senador extends Legislador{


    public Senador(String nombre, String provinciaQueRepresenta) {
        super(nombre, provinciaQueRepresenta);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Camara de Senadores";
    }
}
