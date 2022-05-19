package AgusGomez.legisladores;

import AgusGomez.legisladores.models.Diputado;
import AgusGomez.legisladores.models.Legislador;
import AgusGomez.legisladores.models.Senador;

import java.util.ArrayList;
import java.util.Iterator;

public class TestLegisladores {

    public static void main(String[] args) {

        Diputado diputado1 = new Diputado("Anibal", "Pachano", 45);
        diputado1.setProvinciaQueRepresenta("Salta");
        Diputado diputado2 = new Diputado("Oliver", "Giroud", 54);
        diputado2.setProvinciaQueRepresenta("Misiones");
        Senador senador1 = new Senador("Luis", "Majul", 55);
        senador1.setProvinciaQueRepresenta("Buenos Aires");
        Senador senador2 = new Senador("Bruce", "Willis", 62);
        senador2.setProvinciaQueRepresenta("Neuquén");

        ArrayList<Legislador> arrLegis = new ArrayList<>();
        arrLegis.add(diputado1);
        arrLegis.add(senador1);
        arrLegis.add(diputado2);
        arrLegis.add(senador2);

        Iterator<Legislador> it = arrLegis.iterator();

        for (int i = 0; i < arrLegis.size(); i++){
            System.out.println(it.next().toString()
            );
        }
    }
}
