package JavaInicio.Actividades;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Battleship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[][] tabla = {{true,false,false,false,false},
                             {true,false,false,true,true},
                             {true,false,false,false,false},
                             {true,false,true,true,true},
                             {false,false,false,false,false}}; // 1º = y 2º = x
        int intentos = 0;
        int aciertos = 0;
        Set<String> combinacionesIntentadas = new HashSet<>();
        while (intentos < 5) {
            System.out.println("Introduzca el eje x: ");
            int x = input.nextInt();
            x--;
            System.out.println("Introduzca el eje y: ");
            int y = input.nextInt();
            y--;
            String combinacion = x + "," + y;
            if (x >= 0 && x < tabla[0].length && y >= 0 && y < tabla.length) {
                if (tabla[y][x]) {
                    if (!combinacionesIntentadas.contains(combinacion)) {
                        System.out.println("Acierto");
                        aciertos++;
                        combinacionesIntentadas.add(combinacion);
                    } else {
                        System.out.println("Ya intentaste esta combinación.");
                    }
                } else {
                    System.out.println("Fallo");
                    intentos++;
                }
            } else {
                System.out.println("Los valores introducidos están fuera de rango. Deben estar entre 1 y " + (tabla.length) + ".");
            }
            if (aciertos == 9) {
                System.out.println("Has hundido todas las naves, felicidades!!!");
                System.exit(0);
            }
        }
        System.out.println("Agotaste los intentos.");
        input.close();
    }
}