package Lautaro.Abstracta;

public class Vaca extends Animal {
    @Override
    public void hablar() {
        System.out.println("Muuuuuuu");
    }

    @Override
    public void comerCarne() {
        System.out.println("No como Carne.");
    }

    @Override
    public void comerHierba() {
        System.out.println("Como hierba");
    }
}