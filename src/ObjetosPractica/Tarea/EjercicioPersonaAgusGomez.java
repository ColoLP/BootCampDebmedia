package ObjetosPractica.Tarea;

import ObjetosPractica.Tarea.Model.PersonaAgustinGomez;
import ObjetosTeoria.Modelos.Persona;

import java.util.Scanner;

public class EjercicioPersonaAgusGomez {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un nombre (1): ");
        String nombre1 = teclado.next();
        System.out.print("Ingrese una edad (1): ");
        int edad1 = teclado.nextInt();
        System.out.print("Ingrese sexo, M (masculino) o F (femenino) (1): ");
        char sexo1 = teclado.next().charAt(0);
        System.out.print("Ingrese peso (1): ");
        double peso1 = teclado.nextDouble();
        System.out.print("Ingrese altura (1): ");
        double altura1 = teclado.nextDouble();

        PersonaAgustinGomez persona1 = new PersonaAgustinGomez(nombre1, edad1, sexo1, peso1, altura1);

        System.out.print("Ingrese un nombre (2): ");
        String nombre2 = teclado.next();
        System.out.print("Ingrese una edad (2): ");
        int edad2 = teclado.nextInt();
        System.out.print("Ingrese sexo, M (masculino) o F (femenino) (2): ");
        char sexo2 = teclado.next().charAt(0);

        PersonaAgustinGomez persona2 = new PersonaAgustinGomez(nombre2, edad2, sexo2);
        persona2.setPesoK(76.8);
        persona2.setAlturaM(1.84);

        PersonaAgustinGomez persona3 = new PersonaAgustinGomez();
        persona3.setNombre("Diego");
        persona3.setEdad(25);
        persona3.setSexo('M');
        persona3.setPesoK(109.3);
        persona3.setAlturaM(1.78);

        System.out.println();

        System.out.println("El DNI de la persona 1 es: " + persona1.getDni());
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

    }

}
