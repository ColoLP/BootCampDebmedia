package Manu.animales.models;

public class Perro extends Animal implements Comer {

    @Override
    public void hablar() {
        System.out.println("guau");
    }

    @Override
    public void comerCarne() {
        System.out.println("que rica la carne, guau");
    }

    @Override
    public void comerHierva() {
        System.out.println("no tan rica la verdura che, guau");

    }
}
