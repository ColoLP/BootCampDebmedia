package Clase9Animal.ResueltoLucas.Models;

public class Gato extends Animal{
    @Override
    public void hablar() {
        System.out.println("Soy un toga!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Puedo comer 1/2 kilo de carne");
    }

    @Override
    public void comerHierva() {
        System.out.println("No gracias, no soy vegetariano");
    }
}
