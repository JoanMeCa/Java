package JavaInicio.Actividades;

import java.util.Scanner;

public class Actividadpostexamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el precio del plato: ");
        double precio = Double.parseDouble(scanner.nextLine());
        double total = 0;
        while (precio > 0) {
            total = precio + total;
            System.out.println("Introduzca el precio del siguiente plato: ");
            precio = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("El precio total de la comida es de: " + total + " euros.");
        scanner.close();
    }
}
