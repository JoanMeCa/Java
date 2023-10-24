package JavaInicio;

import java.util.Scanner;

public class Actividad027 {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Escribe un número: ");
            int numero = Integer.parseInt(input.nextLine());
            long factorial = 1;
            for(int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es " + factorial);
            input.close();
    }
}
