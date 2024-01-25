package JavaExamen;
import java.util.Scanner;
/**
 * Primer examen de Programación - DAM
 * @autor Joan Menéndez Calafell
 * @fecha 26/10/2023 
 */
public class ExamenProg1 {

    /* No tocar este método */
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("-1r Examen de programación 2023/24-");
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 1: ");
        ejercicio1();
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 2: ");
        ejercicio2();
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 3: ");
        ejercicio3();
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 4: ");
        ejercicio4();
    }
    
    /**
     * Enunciado:
     * Calcula el Area de un cuadrado equilátero a partir de uno de sus lados.
     * **
     * Nota: Puedes definir el valor del lado como una variable (no usar Scanner).
     * Nota: Se debe utilizar System.out.print para notificar al usuario.
     * Nota: Ejercicio de clase.
     */
    private static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca uno de los lados del cuadrado en cm: ");
        double lado  = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("El área del cuadrado es de " + area + " cm.");
        scanner.close();
        // Escribe aqui el codigo del ejercicio 1
    }
    
    /**
     * Enunciado:
     * Queremos saber la nota final de un alumno
     * Además, queremos saber si aprobará o no la asignatura
     * El alumno posee 3 notas: 
     * Nota del 1r examen 25%, nota del 2o examen 25% i nota de la práctica 50%
     * Si la media del alumno es superior a 4.5, el alumno estará aprobado.
     * **
     * Nota: Puedes definir las 3 notas como variables (no usar Scanner).
     * Nota: Se debe utilizar System.out.print para notificar al usuario.
     */
    private static void ejercicio2() {
        // Escribe aqui el codigo del ejercicio 2
        double nota1 = 2.5;
        double nota2 = 2.5;
        double nota3 = 5;
        double notafinal = (nota1 + nota2 + nota3)/3;
        if (notafinal > 4.5) {
            System.out.println("El alumno ha aprobado la asignatura con un " + notafinal + ".");
        }
        else {
            System.out.println("El alumno ha suspenido la asignatura con un " + notafinal + ".");
        }
    }
    
    /**
     * Enunciado:
     * Crear un contador del 0 al 20, pero que este cuente de 2 en 2
     * Ejemplo: 0, 2, 4, 6, 8, 10, 12, ...
     * **
     * Pista: Utilizar un bucle while() o for().
     */
    private static void ejercicio3() {
        // Escribe aqui el codigo del ejercicio 3
        int num = 0;
        while (num <= 20) {
            System.out.println(num);
            num++;
            num++;
        }
    }
    
    /**
     * Enunciado:
     * Queremos que a partir de una frase, se cuenten las vocales que contiene
     * Ejemplo: "Hola mundo" - Posee 4 vocales.
     * **
     * Nota: Definir un String con la frase a utilizar (no usar Scanner).
     * Utilizar la función .toCharArray(); para convertir el String a un char[]
     * Pista: Iterar cada char del array para detectar cuantas vocales hay.
     */
    private static void ejercicio4() {
        // Escribe aqui el codigo del ejercicio 4
        String texto = "Hola Mundo";
        System.out.println(texto);
        int vocales = 0;
        texto = texto.toLowerCase();
        char letra[] = texto.toCharArray();
        for (char caracter : letra) {
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                vocales++;
            }
        }
        System.out.println("Hay un total de " + vocales + " vocales en el string.");
    }
    
}
