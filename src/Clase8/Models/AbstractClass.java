package Clase8.Models;

import java.util.Date;

public abstract class AbstractClass {
    // declaraciones de miembros de la clase
    int num;
    Date fecha;

    public AbstractClass(){

    }
    // declaración e implementación de métodos normales
    void metodo1(){
        System.out.println("Hola compañeros");
    }

    //Declaración de métodos Abstractos
    abstract void metodo2();
    abstract void metodo3();
}
