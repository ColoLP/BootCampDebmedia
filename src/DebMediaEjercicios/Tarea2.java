package DebMediaEjercicios;

import java.util.LinkedList;

public class Tarea2 {
    private static String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
    private static LinkedList<String> list = new LinkedList<String>();

    public static void main(String[] args) {
        eliminarElementoRepetido();
        cargadeList();
    }
    public static void cargadeList() {
        for (int i = 0; i < strs.length; i++) {
            list.add(strs[i]);
        }
        System.out.println(list);
    }
    public static void eliminarElementoRepetido() {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 1 + i; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

