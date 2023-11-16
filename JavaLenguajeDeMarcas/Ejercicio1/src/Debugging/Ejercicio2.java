package Debugging;

public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena1 = "prueba";
        String cadena2 = "Prueba";

        if (sonIguales(cadena1, cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }

    public static boolean sonIguales(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }
}
