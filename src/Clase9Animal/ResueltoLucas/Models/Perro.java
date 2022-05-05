package Clase9Animal.ResueltoLucas.Models;

public class Perro extends Animal {

    @Override
    public void hablar() {
        System.out.println("Soy un rrope!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Hola, si como carne me gusta mucho.");
    }

    @Override
    public void comerHierva() {
        System.out.println("Unimplemented Method");
    }
}
