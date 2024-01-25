/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaInicio.Actividades;
import java.util.Scanner;

/**
 *
 * @author Party
 */
public class Actividad008 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la elección del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué figura deseas calcular el área?");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Pentágono");
        System.out.print("Ingresa el número de la figura: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                calcularAreaTriangulo();
                break;
            case 2:
                calcularAreaCuadrado();
                break;
            case 3:
                calcularAreaPentagono();
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        // Cierra el objeto Scanner
        scanner.close();
    }

    public static void calcularAreaCuadrado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la longitud del lado del cuadrado en metros: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area + " metros cuadrados");
        // Cierra el objeto Scanner
        scanner.close();
    }

    public static void calcularAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base del triángulo en metros: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa la altura del triángulo en metros: ");
        double altura = scanner.nextDouble();
        double area = 0.5 * base * altura;
        System.out.println("El área del triángulo es: " + area + " metros cuadrados");
        // Cierra el objeto Scanner
        scanner.close();
    }

    public static void calcularAreaPentagono() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la longitud de un lado del pentágono en metros: ");
        double lado = scanner.nextDouble();
        System.out.print("Ingresa la apotema del pentágono en metros: ");
        double apotema = scanner.nextDouble();
        double perimetro = 5 * lado;
        double area = (perimetro * apotema) / 2;
        System.out.println("El área del pentágono es: " + area + " metros cuadrados");
        // Cierra el objeto Scanner
        scanner.close();
    }
}