package Slay_The_Spire;

public class Movimientos {
    private int numeroDeMovimientos;
    private int poder;
    private int tipo;
    private String efecto;

    // Constructor
    public Movimientos(int numeroDeMovimientos, int poder, int tipo, String efecto) {
        this.numeroDeMovimientos = numeroDeMovimientos;
        this.poder = poder;
        this.tipo = tipo;
        this.efecto = efecto;
    }

    // Métodos para obtener atributos
    public int obtenerNumeroDeMovimientos() {
        return this.numeroDeMovimientos;
    }

    public int obtenerPoder() {
        return this.poder;
    }

    public int obtenerTipo() {
        return this.tipo;
    }

    public String obtenerEfecto() {
        return this.efecto;
    }

    // Métodos estáticos para crear instancias de Movimientos directamente
    public static Movimientos Tackle() {
        return new Movimientos(1, 3, 1, "Te inflinge 3 puntos de daño");
    }

    public static Movimientos Lick() {
        return new Movimientos(2, 1, 2, "Te inflinge 1 Débil");
    }
}