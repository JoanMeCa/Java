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
public class Actividad012 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un carácter: ");
        char caracter = scanner.next().charAt(0);
        if (Character.isUpperCase(caracter)) {
            System.out.println(caracter + " está en mayúscula.");
        } else {
            System.out.println(caracter + " está en minúscula.");
        }
        scanner.close();
    }
}
