package JavaInicio.Actividades;

import java.util.Scanner;

public class Actividad000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un string: ");
        String inputString = scanner.nextLine();
        char[] caracteres = inputString.toCharArray();
        int conteo = 0;
        for (char caracter : caracteres) {
            if (Character.toUpperCase(caracter) == 'O') {
                conteo++;
            }
        }
        System.out.println("En el string introducido hay un total de " + conteo + " o's.");
        scanner.close();
    }
}
