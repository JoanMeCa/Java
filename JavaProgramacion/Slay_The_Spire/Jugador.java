package Slay_The_Spire;

public class Jugador {
    private String Nombre;
    private int Vida;
    private final int EnergiaMaxima = 3;
    private int bloqueo;

    // Constructor
    public Jugador(String nombre, int vida) {
        this.Nombre = nombre;
        this.Vida = vida;
        this.bloqueo = 0; // Inicializar bloqueo en 0
    }

    // Métodos para obtener atributos
    public String obtenerNombre() {
        return this.Nombre;
    }

    public int obtenerVida() {
        return this.Vida;
    }

    public int obtenerEnergiaMaxima() {
        return this.EnergiaMaxima;
    }

    public int obtenerBloqueo() {
        return this.bloqueo;
    }

    // Método para aumentar el bloqueo
    public void aumentarBloqueo(int cantidad) {
        this.bloqueo += cantidad;
    }
}