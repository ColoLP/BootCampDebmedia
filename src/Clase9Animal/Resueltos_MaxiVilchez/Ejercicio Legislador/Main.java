import Modelos.Legislador;
import Modelos.Diputado;
import Modelos.Senador;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Legislador[] listaLegisladores = new Legislador[5];
        listaLegisladores[0]= new Diputado(40,"Walter White","San Juan","Pollos hermanos",1500000,0);
        listaLegisladores[1]= new Diputado(30,"Lucas Galetti","Santa fe","Frente Java la victoria", 500789,0);
        listaLegisladores[2]= new Senador(55, "Satoshi Nakamoto","Tierra del fuego", "Bitcoiners unidos", 21000000, 365 );
        listaLegisladores[3]= new Diputado(78, "Alfredo Casero", "Static del Estero", "FIFO", 111111, 8);
        listaLegisladores[4]= new Senador(27, "Maximiliano Vilchez", "Buenos Aires", "Partido Junior", 0,1);

        for (int i = 0; i <listaLegisladores.length; i++) {
            System.out.println("El legislador " + listaLegisladores[i].getNombre() +
                    " trabaja en la camara " + listaLegisladores[i].getCamaraEnQueTrabaja());
        }


    }
}
