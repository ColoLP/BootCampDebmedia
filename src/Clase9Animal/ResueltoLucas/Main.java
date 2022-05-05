package Clase9Animal.ResueltoLucas;

import Clase9Animal.ResueltoLucas.Models.Animal;
import Clase9Animal.ResueltoLucas.Models.Gato;
import Clase9Animal.ResueltoLucas.Models.Perro;
import Clase9Animal.ResueltoLucas.Models.Vaca;

public class Main {

    public static void main(String[] args) {
        Perro rrope = new Perro();
        hablarAnimal(rrope);
        comerAnimal(rrope);
        Gato toga = new Gato();
        hablarAnimal(toga);
        comerAnimal(toga);
        Vaca vaca = new Vaca();
        hablarAnimal(vaca);
        comerAnimal(vaca);
    }

    private static void hablarAnimal(Animal a){
        a.hablar();
    }

    private static void comerAnimal(Animal a){
        if(a.getClass() == Vaca.class){
            a.comerHierva();
        }else if(a.getClass() == Perro.class || a.getClass() == Gato.class){
            a.comerCarne();
        }
    }
}
