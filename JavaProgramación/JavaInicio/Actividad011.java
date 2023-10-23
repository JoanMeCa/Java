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
public class Actividad011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique un número:");
        double num = scanner.nextDouble();
        if (num % 2 == 0) {
            System.out.println(num + " es un número par.");
        } else {
            System.out.println(num + " es un número impar.");
        }
        scanner.close();
    }
}
