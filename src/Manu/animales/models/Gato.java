package Manu.animales.models;

public class Gato extends Animal implements Comer {
    @Override
    public void hablar() {
        System.out.println("miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("que rica la carne, miau");
    }

    @Override
    public void comerHierva() {
        System.out.println("no tan rica la verdura che, miau");

    }
}
