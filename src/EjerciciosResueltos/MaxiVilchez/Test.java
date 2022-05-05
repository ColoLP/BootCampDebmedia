package EjerciciosResueltos.MaxiVilchez;

import EjerciciosResueltos.MaxiVilchez.Interfaces.IEdificio;
import EjerciciosResueltos.MaxiVilchez.Models.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        ArrayList<IEdificio> edificios = new ArrayList<>();

        edificios.add(new Polideportivo(1,"Polideportivo River Plate",200.00));
        edificios.add(new Polideportivo(2,"Polideportivo DebMedia", 150.00));
        edificios.add(new Polideportivo(50,"Polideportivo Club Atletico Static Void", 300.00));
        edificios.add(new Oficinas(10,165.00));
        edificios.add(new Oficinas(4,60.587));

        Iterator<IEdificio> edificiosIterator = edificios.iterator();
        Object edificioIterando;

        while(edificiosIterator.hasNext()) {
            edificioIterando = edificiosIterator.next();
            System.out.println(edificioIterando.toString());
            //Este to string debe ser el primitivo heredado de la Clase Objeto
            //¨Porque el metodo .getSuperficieEdificio no funciona
        }

        System.out.println("Que superficie tiene cada edificio?");
        for (int i = 0; i < edificios.size(); i++) {
            System.out.println("El edificio " + (i+1) +" tiene " + edificios.get(i).getSuperficieEdificio() + "mts^2");
        }

    }
}
