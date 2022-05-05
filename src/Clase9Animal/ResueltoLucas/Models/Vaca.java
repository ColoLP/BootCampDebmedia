package Clase9Animal.ResueltoLucas.Models;

public class Vaca extends Animal {
    @Override
    public void hablar() {
        System.out.println("Soy una vaca");
    }

    @Override
    public void comerCarne() {
        System.out.println("No como Carne.");
    }

    @Override
    public void comerHierva() {
        System.out.println("Me gusta mucho la hierva");
    }
}
