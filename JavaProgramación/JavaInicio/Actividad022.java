package JavaInicio;
import java.util.Scanner;


public class Actividad022 {
    public static void main(String[] args) {
        int intentos = 3;
        String pass = "Awooga";
        Scanner scanner = new Scanner(System.in);

        while (!pass.equals("Eureka") && intentos > 0) {
            System.out.print("Introduzca la contraseña: ");
            pass = scanner.next();

            if (pass.equals("Eureka")) {
                System.out.println("Contraseña Correcta!");
            } else {
                System.out.println("ERROR: CONTRASEÑA INCORRECTA");
                intentos--;

                if (intentos <= 0) {
                    System.out.println("Has gastado todos los intentos, cerrando sistema.");
                } else {
                    System.out.println("Te quedan " + intentos + " intentos.");
                }
            }
        }

        scanner.close();
    }
}
