package Clase8.Teoria.TryCatch;
/*
    La librería o API de Java proporciona gran cantidad de clases que manejan casi cualquier tipo de excepción,
    pero no estamos obligados a utilizar solo esas clases sino que podemos crear nuestras propias excepciones.

    Si queremos crear una excepción no verificada debemos heredar de RuntimeException y si queremos que sea verificada deberemos heredar de Exception o
    de alguna de sus subclases.

    Veamos con un ejemplo como crear una clase que herede de Exception, luego en otra clase lanzar una excepción de la nueva clase creada y finalmente llamar al
    método que lanza la excepción.
*/
public class PilaVaciaException extends Exception{
    public PilaVaciaException(String mensaje) {
        super("Carlitos Problema: " + mensaje);
    }
}
