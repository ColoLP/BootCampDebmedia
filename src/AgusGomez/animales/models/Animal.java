package AgusGomez.animales.models;

import AgusGomez.animales.interfaces.Carne;
import AgusGomez.animales.interfaces.Hierba;

abstract public class Animal {

    //Atributos
    private String colorDePelo;
    private String nombre;
    private int edad;

    //Constructores

    public Animal() {
    }

    public Animal(String colorDePelo, String nombre, int edad) {
        this.colorDePelo = colorDePelo;
        this.nombre = nombre;
        this.edad = edad;
    }


    //Getters & Setters

    public String getColorDePelo() {
        return colorDePelo;
    }

    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Métodos
    public abstract String hablar();

    public static void hablarAnimal(Animal a){
        a.hablar();
    }

    public static String comerAnimal(Animal a){
        if (a.getClass() == Perro.class || a.getClass() == Gato.class ){
            ((Carne) a).comerCarne();
        }else if (a.getClass() == Vaca.class){
            ((Hierba) a).comerHierba();
        }
        return null;
    }

}
