package Slay_The_Spire;

import java.util.ArrayList;
import java.util.List;

public class Mazo {
    private List<Cartas> cartasEnMazo;

    // Constructor que inicializa el mazo con cartas específicas
    public Mazo() {
        this.cartasEnMazo = new ArrayList<>();
        inicializarMazoConCartasIniciales();
    }

    // Método para inicializar el mazo con cartas específicas
    private void inicializarMazoConCartasIniciales() {
        // Añade instancias predefinidas de cartas al mazo
        for (int i = 0; i < 4; i++) {
            cartasEnMazo.add(Cartas.Strike());
        }

        for (int i = 0; i < 4; i++) {
            cartasEnMazo.add(Cartas.Defend());
        }

        cartasEnMazo.add(Cartas.SwordBoomerang());
        cartasEnMazo.add(Cartas.Bloodletting());
    }

    // Método para obtener todas las cartas en el mazo
    public List<Cartas> obtenerCartasEnMazo() {
        return this.cartasEnMazo;
    }
}