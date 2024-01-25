package JavaInicio.ArraysLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Diasdelasemana {
    public static void main(String[] args) {
        ArrayList<String> Semana = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes"));
        Semana.add(4, "Juernes");
        System.out.println(Semana);
        ArrayList<String> listaDos = new ArrayList<>();
        listaDos.addAll(Semana);
        System.out.println(listaDos);
        Semana.addAll(listaDos);
        System.out.println(Semana);
        System.out.println(Semana.get(3) + " " +  Semana.get(4));
        System.out.println(Semana.get(0) + " " + Semana.get(Semana.size() - 1));
        boolean eliminado = false;
        for (int i = 0; i < Semana.size(); i++) {
            if (Semana.get(i).equals("Juernes")) {
            Semana.remove(i);
            System.out.println("Se ha eliminado 'Juernes' del array.");
            eliminado = true;
            i--;
        }};
        if (!eliminado) {
            System.out.println("No se ha eliminado ningún elemento del array.");
        }
        System.out.println(Semana);
        for (int i = 0; i < Semana.size(); i++) {
            System.out.println(Semana.get(i));
        }
        boolean lunes = false;
        int lunesm = 0;
        for (int i = 0; i < Semana.size(); i++) {
            if (Semana.get(i).equalsIgnoreCase("Lunes")) {
                lunes = true;
                lunesm++;
            }
        }
        if (lunes) {
            System.out.println("Se han encontrado " + lunesm + " Lunes en el array.");
        }
        for (int i = Semana.size() - 1; i >= 0; i--) {
            System.out.println(Semana.get(i));
        }
        Collections.sort(Semana);
        System.out.println(Semana);
        for (int i = Semana.size() - 1; i >= 0; i--) {
            Semana.remove(i);
        }
        System.out.println(Semana);
    }
}