package JavaInicio.Actividades;

import java.util.Random;
import java.util.Scanner;

public class Juegonumericos {
    //Adiinar numero
    //Generar numero entre 0 y 50
    //Cada turno se pregunta el N y se compara
    //Te dice si es menor o mayor que le numero generado
    //El programa termina cuando aciertas o cuando fallas 5 veces
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(51);
        Scanner input = new Scanner(System.in);

        int Intentos = 0;
        while (Intentos < 5) {
            System.out.println("Introduce el número: ");
            int guess = input.nextInt();
            if (guess == numero) {
                System.out.println("¡Felicidades! ¡Has acertado!");
                System.out.println("Fin del juego");
                System.exit(0);
            }
            if (guess > numero) {
                System.out.println("El número introducido es mayor de lo esperado.");
                Intentos++;
            }
            if (guess < numero) {
                System.out.println("El numero introducido es menor de lo esperado");
                Intentos++;
            }
        }
        System.out.println("¡Gastaste los 5 intentos! Perdiste...");
        System.out.println("¡Vuelve a intentarlo!");
        input.close();
        
    }
}
