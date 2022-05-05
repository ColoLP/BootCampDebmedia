package EjerciciosPrueba;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ResolucionEjercicio2 {

    public static void main(String[] args)
    {

        // método uno:
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> al = new LinkedList<String>();
        /*for(int i=0;i<strs.length;i++)
        {
            al.add(strs[i]);
        }
        for(int j=0;j<al.size();j++)
        {
            for(int k=j+1;k<al.size();k++)
            {
                if(al.get(j).equals(al.get(k)))
                {
                    al.remove(k);
                }
            }
        }
        Iterator it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }*/

        // Método 2: usar Set directamente
        LinkedHashSet<String> al1 = new LinkedHashSet<String>();
        al1.add("12345");
        al1.add("67891");
        // Debido a que el método equals del objeto String es determinar si dos cadenas son iguales, no hay necesidad de reescribir el método equals
        al1.add("12347809933");
        al1.add("98765432102");
        al1.add("67891");
        al1.add("12347809933");
        Iterator it1 = al1.iterator();
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
    }
}
