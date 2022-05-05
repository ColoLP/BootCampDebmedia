package Clase8.Teoria.TryCatch;

import java.io.*;

/*
    El manejo de excepciones en Java puede incluir otro bloque llamado 'finally':

    try {
    [instrucciones 1]
    } catch([excepción 1]) {
    [instrucciones 2]
    } finally {
    [instrucciones 3]
    }
    El objetivo de este bloque es liberar recursos que se solicitan en el bloque try.
    El bloque finally se ejecuta siempre, inclusive si se genera la captura de una excepción.

    Los recursos más comunes que se deben liberar son las conexiones a bases de datos, uso de archivos y conexiones de red.
    Un recurso que no se libera impide que otro programa lo pueda utilizar.
    Al disponer la liberación de recursos en el bloque 'finally' nos aseguramos que todo recurso se liberará, inclusive aunque se dispare una excepción.

    Tener en cuenta que si no se disparan ninguna excepción en un bloque try luego de esto se ejecuta el bloque 'finally'.

    El bloque finally es opcional y en el caso de estar presente se coloca después del último bloque catch.
*/
public class Finally {
    /*
    Crear un archivo de texto con dos líneas.
    Luego proceder a leer el contenido del archivo de texto y mostrarlo por pantalla.
    Asegurarse de liberar el archivo luego de trabajar con el mismo
    */

    public static void main(String[] ar) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(new File("datos.txt"));
            bw = new BufferedWriter(fw);
            bw.write("Línea 1");
            bw.newLine();
            bw.write("Línea 2");
        } catch (IOException ex) {
            System.out.println("Problemas en la creación del archivo");
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(new File("datos.txt"));
            br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Problemas con la lectura del archivo");
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
