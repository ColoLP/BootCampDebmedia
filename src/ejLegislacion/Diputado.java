package ejLegislacion;

public class Diputado extends Legislador{

    public Diputado(String nombre,String provinciaQueRepresenta) {
        super(nombre, provinciaQueRepresenta);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "camara de Diputados";
    }
}
