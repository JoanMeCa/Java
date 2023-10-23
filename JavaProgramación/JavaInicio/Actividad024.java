package JavaInicio;

import java.util.Scanner;

public class Actividad024 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la elección del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Ingresa la operación que deseas realizar: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                Sumar();
                break;
            case 2:
                Restar();
                break;
            case 3:
                Multiplicar();
                break;
            case 4:
                Dividir();
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        // Cierra el objeto Scanner
        scanner.close();
    }
    public static void Sumar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.println(num1 + " más " + num2 + " iguala a " + sum);
        scanner.close();
    }
        public static void Restar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double rest = num1 - num2;
        System.out.println(num1 + " menos " + num2 + " iguala a " + rest);
        scanner.close();
    }
        public static void Multiplicar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double mult = num1 * num2;
        System.out.println(num1 + " por " + num2 + " iguala a " + mult);
        scanner.close();
    }
        public static void Dividir() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double div = num1 / num2;
        System.out.println(num1 + "entre " + num2 + " iguala a " + div);
        scanner.close();
    }
}
