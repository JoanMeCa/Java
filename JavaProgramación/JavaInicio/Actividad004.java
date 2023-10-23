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
public class Actividad004 {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Introduzca los grados en centígrados:  ");
            int numero = Integer.parseInt(input.nextLine());
            double faren = (numero * 9/5) + 32;
            System.out.println(+ numero + " grados centígrados son " + faren + " grados en farenheit ");
    }
}
