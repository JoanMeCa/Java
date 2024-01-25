package Slay_The_Spire_Electric_Bogaloo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas;
    private List<Carta> descartes;

    public Mazo(List<Carta> cartas) {
        this.cartas = new ArrayList<>(cartas);
        this.descartes = new ArrayList<>();
        barajarMazo();
    }

    public void agregarCartasAlMazo(List<Carta> cartas) {
        this.cartas.addAll(cartas);
    }

    public void agregarCartaAlDescarte(Carta carta) {
        descartes.add(carta);
    }

    public void rellenarDesdeDescartesYBarajar() {
        cartas.addAll(descartes);
        descartes.clear();
        barajarMazo();
    }

    public List<Carta> robarCartas(int cantidad) {
        // Verificar si el mazo tiene al menos una carta antes de intentar robar
        if (cartas.isEmpty()) {
            // Barajar el mazo si está vacío y rellenar desde descartes
            rellenarDesdeDescartesYBarajar();
        }
    
        List<Carta> cartasRobadas = new ArrayList<>();
        for (int i = 0; i < cantidad && !cartas.isEmpty(); i++) {
            Carta cartaRobada = cartas.remove(0);
            cartasRobadas.add(cartaRobada);
            // Añadir la carta robada al mazo de descartes
            descartes.add(cartaRobada);
        }
    
        // Barajar nuevamente si el mazo se queda sin cartas después de robar
        if (cartas.isEmpty()) {
            rellenarDesdeDescartesYBarajar();
        }
    
        return cartasRobadas;
    }
    
    private void barajarMazo() {
        // Implementar lógica para barajar el mazo
        Collections.shuffle(cartas);
    }
    
}