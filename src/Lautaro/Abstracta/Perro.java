package Lautaro.Abstracta;

public class Perro extends Animal {

    @Override
    public void hablar() {
        System.out.println("Guau Guau!!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Como carne");
    }

    @Override
    public void comerHierba() {
        System.out.println("No como carne");
    }
}