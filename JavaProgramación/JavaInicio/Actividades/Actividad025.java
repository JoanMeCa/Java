package JavaInicio.Actividades;

import java.util.Scanner;

public class Actividad025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una nota: ");
        int nota = scanner.nextInt();

        if (nota >= 5 && nota <= 10) {
            String correspondencia = "";

            if (nota == 5) {
                correspondencia = "Suficiente";
            } else if (nota == 6) {
                correspondencia = "Bien";
            } else if (nota == 7) {
                correspondencia = "Notable bajo";
            } else if (nota == 8) {
                correspondencia = "Notable alto";
            } else if (nota == 9) {
                correspondencia = "Excelente";
            } else {
                correspondencia = "Matrícula de honor";
            }

            System.out.println("La correspondencia de la nota " + nota + " es: " + correspondencia);
        } else if (nota < 5) {
            System.out.println("Suspens: valores menores de 5");
        } else {
            System.out.println("Nota no válida. Introduce una nota entre 5 y 10.");
        }

        scanner.close();
    }
}
