package Abstracta;

public class Gato extends Animal{
    @Override
    public void hablar() {
        System.out.println("Raaaaaauuuul!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Como carne");
    }

    @Override
    public void comerHierba() {
        System.out.println("No como hierba");
    }
}