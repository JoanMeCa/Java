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
public class Actividad006 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa la velocidad en kilómetros por hora (km/h): ");
        double kilometersPerHour = scanner.nextDouble();

        // Aplicamos la fórmula para convertir km/h a m/s
        double metersPerSecond = kilometersPerHour * (1000.0 / 3600.0);

        System.out.println(kilometersPerHour + " km/h equivale a " + metersPerSecond + " m/s.");

        // Cierra el objeto Scanner
        scanner.close();
    }
}
