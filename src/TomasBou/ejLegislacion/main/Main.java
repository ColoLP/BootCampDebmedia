package TomasBou.ejLegislacion.main;

import TomasBou.ejLegislacion.Diputado;
import TomasBou.ejLegislacion.Legislador;
import TomasBou.ejLegislacion.Senador;

import java.util.ArrayList;

public class Main {

   static  ArrayList <Legislador> legisladores=new ArrayList<>();
    public static void main(String[] args) {


        Diputado d1=new Diputado("Fredo","La Pampa");
        Diputado d2=new Diputado("Perez","Cordoba");
        Diputado d3=new Diputado("Messi","Santa Fe");

        Senador s1=new Senador("Jetox","Salta");
        Senador s2=new Senador("Galindes","Formosa");
        Senador s3=new Senador("bonaerense","Buenos Aires");

        legisladores.add(d1);
        legisladores.add(d2);
        legisladores.add(d3);
        legisladores.add(s1);
        legisladores.add(s2);
        legisladores.add(s3);

        mostrarLegisladores();
    }

    private static void mostrarLegisladores() {
        for (Legislador l:legisladores) {
            System.out.println("Legislador "+l.getNombre());
            System.out.println("Trabaja en "+l.getCamaraEnQueTrabaja());
        }
    }


}
