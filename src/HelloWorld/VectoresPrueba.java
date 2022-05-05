package HelloWorld;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class VectoresPrueba {
    private Scanner teclado;
    private String[] nombres;
    private float[] sueldos;

    public void cargar() {
        teclado=new Scanner(System.in);
        nombres=new String[5];
        sueldos=new float[5];
        for(int f=0;f<nombres.length;f++) {
            System.out.print("Ingrese el nombre del empleado:");
            nombres[f]=teclado.next();
            System.out.print("Ingrese el sueldo:");
            sueldos[f]=teclado.nextFloat();
        }
    }

    public void mayorSueldo() {
        float mayor;
        int pos;
        mayor=sueldos[0];
        pos=0;
        for(int f=1;f<nombres.length;f++) {
            if (sueldos[f]>mayor) {
                mayor=sueldos[f];
                pos=f;
            }
        }

        System.out.println("El empleado con sueldo mayor es "+nombres[pos]);
        System.out.println("Tiene un sueldo:"+convertir(mayor));
    }

    public void menorSueldo(){
        float menor;
        int pos;
        menor=sueldos[0];
        pos=0;
        for(int f=1;f<nombres.length;f++) {
            if (sueldos[f]<menor) {
                menor=sueldos[f];
                pos=f;
            }
        }

        System.out.println("El empleado con sueldo menor es " + nombres[pos]);
        System.out.println("Tiene un sueldo:" + convertir(menor));
    }

    public static String convertir(double val){
        Locale.setDefault(Locale.US);
        DecimalFormat num = new DecimalFormat("#,###.00");
        return num.format(val);
    }

    public static void main(String[] ar) {
        VectoresPrueba pv = new VectoresPrueba();
        pv.cargar();
        pv.mayorSueldo();
        pv.menorSueldo();
    }
}
