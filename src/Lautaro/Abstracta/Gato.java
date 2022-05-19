package Lautaro.Abstracta;

public class Gato extends Animal{
    @Override
    public void hablar() {
        System.out.println("Raaaaaauuuul!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Como carne de vaca");
        System.out.println("Come carne de pollo");
        System.out.println("Como pescado");
    }

    @Override
    public void comerHierba() {
        System.out.println("No como hierba");
    }


}