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
public class Actividad003 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Escribe un número: ");
            int numero = Integer.parseInt(input.nextLine());
            int doble = numero * 2;
            int triple = numero * 3;
            System.out.println("El doble de " + numero + " es " + doble + " y el triple es " + triple);
    }
}
