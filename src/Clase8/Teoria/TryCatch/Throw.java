package Clase8.Teoria.TryCatch;

import Clase8.Models.PersonaAdulta;
/*
    Hemos visto hasta ahora cual es la sintaxis para capturar excepciones que lanzan métodos.
    Ahora veremos como podemos lanzar una excepción para que sea eventualmente capturada posteriormente.

    Hay que definir con juicio que métodos de una clase deben lanzar excepciones cuando el dato es incorrecto debido que luego se hace más difícil consumir dicho método.

    Aquellas partes críticas de nuestras clases pueden lanzar excepciones para que sean más robustas.
    Por ejemplo si tenemos una clase 'ClienteBanco' y queremos controlar que nunca pueda sacar más dinero del que tiene depositado,
    el método extraer puede lanzar una excepción evitando que quede en negativo el monto del cliente.
*/
public class Throw {
    public static void main(String[] ar) {
        try {
            PersonaAdulta persona1 = new PersonaAdulta("Ana", 50);
            persona1.imprimir();
            PersonaAdulta persona2 = new PersonaAdulta("Juan", 13);
            persona2.imprimir();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
