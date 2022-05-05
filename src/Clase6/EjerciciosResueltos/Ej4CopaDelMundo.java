package Clase6.EjerciciosResueltos;


/*
* Use Map para completar las siguientes funciones:
*
  1. Lea en una secuencia desde la línea de comando, que representa un año, y haga saber qué equipo es el campeón de la Copa del Mundo en ese año.
  * Si la Copa del Mundo no se celebra ese año, salida: No se celebra la Copa del Mundo.

  2. Sobre la base del mapa original de la Copa del Mundo, se agregan las siguientes funciones: leer el nombre de un equipo y
* generar una lista del año en que el equipo ganó el campeonato. Por ejemplo, si lee "Brasil", debe mostrar 1958 1962 1970 1994 2002 Si lee
* "Países Bajos", debe mostrar
* */

import java.util.*;

public class Ej4CopaDelMundo {

    private static HashMap<Integer,String> map = new HashMap<Integer,String>();

    public static void main(String[] args) {

        llenoLaCopaDelMundo();

        System.out.println ("Ingrese el año:");
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer,String> entry = (Map.Entry<Integer,String>)it.next();
            if(entry.getKey()==inputNum)
            {
                System.out.println (entry.getKey () + "El que ganó la Copa del Mundo en el año es:" + entry.getValue ());
            }
        }
        String temp = sc.nextLine();
        System.out.println ("Ingrese el nombre del país");
        String inputStr = sc.nextLine();
        // Set<Map.Entry<Integer,String>>  set1 = map.entrySet();
        Iterator it1 = set.iterator();
        System.out.print ("El año de ganar el campeonato:");
        int flag = 0;
        while(it1.hasNext())
        {
            Map.Entry<Integer,String> entry1 = (Map.Entry<Integer,String>)it1.next();
            if(entry1.getValue().equals(inputStr))
            {
                System.out.print(entry1.getKey()+" ");
                flag++;
            }
        }
        if(flag==0)
        {
            System.out.println ("No he ganado el Mundial");
        }
    }

    private static void llenoLaCopaDelMundo() {
        map.put (1930, "Uruguay");
        map.put (1934, "Italia");
        map.put (1938, "Italia");
        map.put (1950, "Uruguay");
        map.put (1954, "Alemania Occidental");
        map.put (1958, "Brasil");
        map.put (1962, "Brasil");
        map.put (1966, "Inglaterra");
        map.put (1970, "Brasil");
        map.put (1974, "Alemania Occidental");
        map.put (1978, "Argentina");
        map.put (1982, "Italia");
        map.put (1986, "Argentina");
        map.put (1990, "Alemania Occidental");
        map.put (1994, "Brasil");
        map.put (1998, "Francia");
        map.put (2002, "Brasil");
        map.put (2006, "Italia");
        map.put (2010, "España");
        map.put (2014, "Alemania");
    }

}
