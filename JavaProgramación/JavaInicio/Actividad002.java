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
public class Actividad002 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Escribe dos números: ");
            int numero1 = Integer.parseInt(input.nextLine());
            int numero2 = Integer.parseInt(input.nextLine());
            System.out.println("Has introducido: " + numero1 + " y " + numero2);
    }
}
