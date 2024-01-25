package JavaInicio.Actividades;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int Intentos = 0;
        int Aciertos = 0;
        String[] palabras = {"casa", "gato", 
                            "perro", "sol", 
                            "luz", "mesa", 
                            "silla", "cama", 
                            "vino", "uva", 
                            "lago", "arco", 
                            "rosa", "oro", 
                            "piel", "lana", 
                            "mariposa", "ave"};
        int palabraal = random.nextInt(palabras.length);
        String palabra = palabras[palabraal];
        boolean[] letrasAdivinadas = new boolean[palabra.length()];
        while (Intentos < 5) {
            System.out.println("Palabra a adivinar: " + obtenerPalabraAdivinada(palabra, letrasAdivinadas));
            System.out.println("Introduce una letra: ");
            char letra = input.next().charAt(0);

            boolean letraAdivinada = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (letra == palabra.charAt(i) && !letrasAdivinadas[i]) {
                    letrasAdivinadas[i] = true;
                    letraAdivinada = true;
                    Aciertos++;
                }
            }

            if (!letraAdivinada) {
                System.out.println("La letra introducida no se encuentra en la palabra.");
                Intentos++;
            }

            if (Aciertos == palabra.length()) {
                System.out.println("¡Felicidades! Acertaste todas las letras.");
                System.out.println("La palabra era " + palabra);
                System.exit(0);
            }
        }
        System.out.println("¡Gastaste los 5 intentos! Perdiste...");
        System.out.println("¡Vuelve a intentarlo!");
        input.close();
        
    }
    private static String obtenerPalabraAdivinada(String palabra, boolean[] letrasAdivinadas) {
        StringBuilder palabraAdivinada = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {
            if (letrasAdivinadas[i]) {
                palabraAdivinada.append(palabra.charAt(i));
            } else {
                palabraAdivinada.append("_");
            }
        }

        return palabraAdivinada.toString();
    }
}
