package JavaInicio.MasJava.WTF;

import java.util.Scanner;

public class Encuentranombres {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Ana", "Carlos", "Luisa", "Pedro"};
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe el inicio de un nombre: ");
        String inicioNombre = input.nextLine().toUpperCase();
        boolean found = false;

        for (String nombre : nombres) {
            if (nombre.toUpperCase().equals(inicioNombre)) {
                found = true;
                System.out.println("Nombre encontrado: " + nombre);
                break; // No necesitas seguir buscando si ya encontraste una coincidencia exacta.
            } else if (nombre.toUpperCase().startsWith(inicioNombre)) {
                System.out.println("Posible nombre: " + nombre);
            }
        }

        if (!found) {
            System.out.println("El nombre no está en la base de datos.");
        }

        input.close();
    }
}