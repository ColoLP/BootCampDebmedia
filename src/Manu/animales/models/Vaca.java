package Manu.animales.models;

public class Vaca extends Animal implements Comer {


    @Override
    public void hablar() {
        System.out.println("muu");
    }

    @Override
    public void comerCarne() {
        System.out.println("que horror la carne, canivales, muu");
    }

    @Override
    public void comerHierva() {
        System.out.println("mmm pastito, muu");

    }
}
