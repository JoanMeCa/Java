package Slay_The_Spire;

import java.util.ArrayList;
import java.util.List;

public class Enemigos {
    private String nombre;
    private int vida;
    private List<Movimientos> movimientos;

    // Constructor
    public Enemigos(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
        this.movimientos = new ArrayList<>();
    }

    // Método para agregar movimientos al enemigo
    public void agregarMovimiento(Movimientos movimiento) {
        this.movimientos.add(movimiento);
    }

    // Métodos para obtener atributos
    public String obtenerNombre() {
        return this.nombre;
    }

    public int obtenerVida() {
        return this.vida;
    }

    public List<Movimientos> obtenerMovimientos() {
        return this.movimientos;
    }

}