package Reloj;

public class Pruebas {
    public static void main(String[] args) {
        // Crear un reloj con el constructor vacío
        Reloj relojVacio = new Reloj();
        System.out.println("Reloj Vacío (24h):");
        relojVacio.mostrarHora24();
        System.out.println("Reloj Vacío (12h):");
        relojVacio.mostrarHora12();
        System.out.println();

        // Crear un reloj con el constructor con parámetros
        Reloj relojPersonalizado = new Reloj(15, 45, 30);
        System.out.println("Reloj Personalizado (24h):");
        relojPersonalizado.mostrarHora24();
        System.out.println("Reloj Personalizado (12h):");
        relojPersonalizado.mostrarHora12();
    }
}