package Manu.animales.models;

public class Vaca extends Animal implements Comer {


    public Vaca(int edad, String colorDePelo, String nombre) {
        super(edad, colorDePelo, nombre);
    }

    @Override
    public String toString() {
        return "Vaca{" +
                "edad=" + edad +
                ", colorDePelo='" + colorDePelo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void hablar() {
        System.out.println("Muu!");
    }

    @Override
    public void comerCarne() {
        System.out.println("que horror la carne, canibales, muu");
        System.out.println("DEtesto  la carne, canibales, muu");
        System.out.println("Ojala los castigue la virgencita, muu");
    }

    @Override
    public void comerHierva() {
        System.out.println("mmm pastito, muu");
        System.out.println("Soy la vaca lola");
        System.out.println("Tengo 4 estomagos, cuantos estomagos tenes? ");

    }
}
