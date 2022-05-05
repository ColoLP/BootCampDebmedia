package ObjetosTeoria.Modelos;

import ObjetosTeoria.IRoberto;

public class Manzana extends Fruta implements IRoberto {

    private String nombre;

    public Manzana(String nombre) {
        this.nombre = nombre;
    }

    public Manzana(String color, String forma, double peso, double altura, double base, String nombre) {
        super(color, forma, peso, altura, base);
        this.nombre = nombre;
    }

    @Override
    public double getPeso() {
        return super.getPeso() * 25;
    }



    @Override
    public String getNombreRoberto() {
        return "Juan Carlos";
    }

}
