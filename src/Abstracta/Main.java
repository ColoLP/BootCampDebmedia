package Abstracta;

public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro();
        hablarAnimal(perro);
        comerAnimal(perro);
        Gato gato = new Gato();
        hablarAnimal(gato);
        comerAnimal(gato);
        Vaca vaca = new Vaca();
        hablarAnimal(vaca);
        comerAnimal(vaca);
    }

    private static void hablarAnimal(Animal a){
        a.hablar();
    }

    private static void comerAnimal(Animal a){
        if(a.getClass() == Vaca.class){
            a.comerHierba();a();
        }else if(a.getClass() == Perro.class || a.getClass() == Gato.class){
            a.comerCarne();
        }
    }
}