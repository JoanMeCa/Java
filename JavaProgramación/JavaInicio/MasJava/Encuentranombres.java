package JavaInicio.MasJava;

import java.util.Scanner;

public class Encuentranombres {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Ana", "Carlos", "Luisa", "Pedro"};
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe un nombre: ");
        String nombrebuscado = input.nextLine();
        boolean found = false;
        for (String nombre : nombres) {
            if (nombre.equalsIgnoreCase(nombrebuscado)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Nombre dentro de la base de datos.");
        } else {
            System.out.println("El nombre no se encuentra en la base de datos.");
        }
        input.close();
    }
}