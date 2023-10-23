/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaInicio;
import java.util.Scanner;

/**
 *
 * @author Party
 */
public class Actividad007 {
        public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de euros a convertir
        System.out.print("Introduce la cantidad de euros: ");
        double euros = scanner.nextDouble();

        // Realizar la conversión a pesetas (1 euro = 166.386 pesetas)
        double pesetas = euros * 166.386;

        // Mostrar el resultado de la conversión
        System.out.println(euros + " euros equivalen a " + pesetas + " pesetas.");

        // Cierra el objeto Scanner
        scanner.close();
    }
}
