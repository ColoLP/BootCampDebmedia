package Clase8.Teoria.TryCatch;

import java.io.*;

/*
Las excepciones no verificadas son aquellas que dejan al programador tomar la decisión de la conveniencia de atraparla o no.

Todas las excepciones vistas hasta ahora son 'no verificadas': InputMismatchException, ArithmeticException, NumberFormatException y IndexOutOfBoundsException.
Existen en el API de Java muchas otras excepciones de este tipo.

Si queremos una lista completa de excepciones no verificadas en Java podemos visitar la documentación oficial: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=83&codigo=163&inicio=80#:~:text=Las%20excepciones%20no,java.lang.RuntimeException.
Todas estas clases heredan de la clase java.lang.RuntimeException
*/
public class ExcepcionVerificada {
    public static void main(String[] ar) {
        //Podemos no utilizar el tryCatch y dejar que la JVM arroje el error y pare el programa.

        try {
            FileWriter fw = new FileWriter(new File("datos.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Línea 1");
            bw.newLine();
            bw.write("Línea 2");
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Problemas en la creación del archivo");
            System.out.println(ex.getMessage());
        }
        try {
            FileReader fr = new FileReader(new File("datos.txt"));
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            System.out.println("Problemas con la lectura del archivo");
            System.out.println(ex.getMessage());
        }
        /*
        En éste caos, tenemos los metodos utilizando le throw y no es necesario usar trycatch tampoco.
        public static void crear() throws IOException {
            FileWriter fw = new FileWriter(new File("datos.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Línea 1");
            bw.newLine();
            bw.write("Línea 2");
            bw.close();
            fw.close();
        }

        public static void leer() throws IOException {
            FileReader fr = new FileReader(new File("datos.txt"));
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            fr.close();
        }

        public static void main(String[] ar) throws IOException {
            crear();
            leer();
        }*/


    }
}
