package JavaInicio;
import java.util.Scanner;

public class Actividad014 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un carácter: ");
        Character caracter = scanner.next().charAt(0);
        System.out.println("Escriba otro carácter: ");
        Character caracter1 = scanner.next().charAt(0);
        if (caracter.equals(caracter1)) {
            System.out.println("Los dos carácteres son iguales");
        } else {
            System.out.println("Los dos carácteres no son los mismos");
        }
        scanner.close();
    }
}
