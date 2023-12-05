package JavaInicio.Actividades;

import java.util.Scanner;

public class Actividad026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerosPositivos = 0;
        int numerosNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                numerosPositivos++;
            } else if (numero < 0) {
                numerosNegativos++;
            }
        }

        System.out.println("Números positivos introducidos: " + numerosPositivos);
        System.out.println("Números negativos introducidos: " + numerosNegativos);

        scanner.close();
    }
}
