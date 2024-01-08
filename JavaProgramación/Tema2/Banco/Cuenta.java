package Tema2.Banco;

public class Cuenta {
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    // Constructor por defecto
    public Cuenta() {
    }

    // Constructor con todos los parámetros
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    // Constructor copia
    public Cuenta(Cuenta otraCuenta) {
        this.nombreCliente = otraCuenta.nombreCliente;
        this.numeroCuenta = otraCuenta.numeroCuenta;
        this.tipoInteres = otraCuenta.tipoInteres;
        this.saldo = otraCuenta.saldo;
    }

    // Métodos setters/getters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos ingreso y reintegro
    public boolean ingreso(double cantidad) {
        if (cantidad >= 0) {
            this.saldo += cantidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean reintegro(double cantidad) {
        if (cantidad >= 0 && this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    // Método transferencia
    public boolean transferencia(Cuenta cuentaDestino, double cantidad) {
        // Verificar si hay saldo suficiente en la cuenta de origen
        if (cantidad >= 0 && this.saldo >= cantidad) {
            // Realizar la transferencia
            this.saldo -= cantidad;
            cuentaDestino.saldo += cantidad;
            return true;
        } else {
            return false;
        }
    }
}
