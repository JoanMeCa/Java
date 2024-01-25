package JavaInicio.Actividades;

import java.util.Scanner;

public class Actividad013 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un carácter: ");
        char caracter = scanner.next().charAt(0);
        System.out.println("Escriba otro carácter: ");
        char caracter1 = scanner.next().charAt(0);
        if (caracter == caracter1) {
            System.out.println("Los dos carácteres son iguales");
        } else {
            System.out.println("Los dos carácteres no son los mismos");
        }
        scanner.close();
    }
}
