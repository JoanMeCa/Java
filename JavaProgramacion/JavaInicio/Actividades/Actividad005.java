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
public class Actividad005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indique el radio del círculo: ");
        int radio = Integer.parseInt(input.nextLine());
        int circum = radio * 2;
        double longitud = circum * Math.PI;
        double area = radio * radio * Math.PI;
        System.out.println("La longitud del circulo es de: " + longitud + " centímetros, y el área es de: " + area + " centímetros.");
        input.close();
            
    }
}
