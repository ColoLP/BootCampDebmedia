package Manu.animales.models;

public class Vaca extends Animal implements Comer {


    @Override
    public void hablar() {
        System.out.println("muu");
    }

    @Override
    public void comerCarne() {
        System.out.println("que horror la carne, canivales, muu");
        System.out.println("DEtesto  la carne, canivales, muu");
        System.out.println("Ojala los castigue la virgencita, muu");
    }

    @Override
    public void comerHierva() {
        System.out.println("mmm pastito, muu");
        System.out.println("Soy la vaca lola");
        System.out.println("Tengo 4 estomagos, cuantos estomagos tenes? ");

    }
}
