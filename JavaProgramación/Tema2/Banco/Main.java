package Tema2.Banco;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Cuenta usando el constructor con parámetros
        Cuenta miCuenta = new Cuenta("Juan Pérez", "123456789", 0.03, 1000.0);

        // Imprimir los detalles iniciales de la cuenta
        System.out.println("Detalles iniciales de la cuenta:");
        mostrarDetallesCuenta(miCuenta);

        // Realizar algunas operaciones (ingresos, reintegros, transferencia) para probar la funcionalidad
        miCuenta.ingreso(500.0);
        miCuenta.reintegro(200.0);

        Cuenta otraCuenta = new Cuenta("María López", "987654321", 0.02, 1500.0);
        miCuenta.transferencia(otraCuenta, 300.0);

        // Imprimir los detalles de la cuenta después de las operaciones
        System.out.println("\nDetalles de la cuenta después de las operaciones:");
        mostrarDetallesCuenta(miCuenta);
        mostrarDetallesCuenta(otraCuenta);
    }

    // Método auxiliar para mostrar los detalles de una cuenta
    private static void mostrarDetallesCuenta(Cuenta cuenta) {
        System.out.println("Nombre del cliente: " + cuenta.getNombreCliente());
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta.getTipoInteres());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("--------------");
    }
}
