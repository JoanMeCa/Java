import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear las cartas del jugador
        Carta strike = new Carta(1, "Hace 6 puntos de daño al enemigo");
        Carta defend = new Carta(1, "Otorga 5 puntos de bloqueo al jugador");
        Carta bloodletting = new Carta(0, "Recibe 3 puntos de daño, obtén 2 puntos de energía extra");
        Carta bludgeon = new Carta(3, "Hace 32 puntos de daño al enemigo");

        // Crear el mazo del jugador
        List<Carta> mazoJugador = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            mazoJugador.add(strike);
            mazoJugador.add(defend);
        }
        mazoJugador.add(bloodletting);
        mazoJugador.add(bludgeon);

        // Barajar el mazo del jugador
        Mazo mazoJugadorObj = new Mazo(mazoJugador);

        // Crear al jugador
        Jugador jugador = new Jugador(80, 3, false, false, mazoJugadorObj);

        // Crear al enemigo
        AcidSlime acidSlime = new AcidSlime(jugador);

        JawWorm jawWorm = new JawWorm(jugador);

        TheGuardian theGuardian = new TheGuardian(jugador);
        
        System.out.println("Ironclad, debes detener The Spire...");
        System.out.println("Suerte en tus viajes...");
        scanner.nextLine();
        System.out.println("*Avanzas hacia The Spire*");
        scanner.nextLine();
        System.out.println("Te encuentras con un Acid Slime!");
        scanner.nextLine();
        // Bucle de juego
        while (jugador.getPuntosVida() > 0 && acidSlime.getPuntosVida() > 0) {
            // Turno del jugador
            jugador.realizarTurno(acidSlime);
        
            if (acidSlime.getPuntosVida() <= 0) {
                System.out.println("¡Has ganado! Avanzas al siguiente piso....");
                break; // Salir del bucle si el enemigo ha perdido
            }
            // Turno del enemigo
            acidSlime.realizarAccion();
            if (jugador.getPuntosVida() <= 0) {
                System.out.println("¡Has perdido! The Spire esta decepcionada con tu ineptitud.");
                System.exit(0); // Salir del bucle si el jugador ha perdido
            }

        }
        if (jugador.getPuntosVida() < 80) {
            jugador.setPuntosVida(jugador.getPuntosVida() + 6);
            if (jugador.getPuntosVida() >= 80) {
                jugador.setPuntosVida(80);
            }
        }
        System.out.println("Mientras avanzas, observas a una criatura consumiendo un cuerpo...");
        scanner.nextLine();
        System.out.println("El Jaw Worm te ataca!");
        scanner.nextLine();

        while (jugador.getPuntosVida() > 0 && jawWorm.getPuntosVida() > 0) {
            // Turno del jugador
            jugador.realizarTurno(jawWorm);
        
            if (jawWorm.getPuntosVida() <= 0) {
                System.out.println("¡Has ganado! El siguiente piso es imponente....");
                break; // Salir del bucle si el enemigo ha perdido
            }
            // Turno del enemigo
            jawWorm.realizarAccion();
            if (jugador.getPuntosVida() <= 0) {
                System.out.println("¡Has perdido! The Spire se nutre con tu muerte.");
                System.exit(0); // Salir del bucle si el jugador ha perdido
            }

        }
        if (jugador.getPuntosVida() < 80) {
            jugador.setPuntosVida(jugador.getPuntosVida() + 6);
            if (jugador.getPuntosVida() >= 80) {
                jugador.setPuntosVida(80);
            }
        }
        System.out.println("Al abrir la puerta, no ves más que una pila de placas de metal...");
        scanner.nextLine();
        System.out.println("Mientras investiga, ves a la pila moverse, y empieza a atacarte!");
        scanner.nextLine();

        while (jugador.getPuntosVida() > 0 && theGuardian.getPuntosVida() > 0) { //Problemas con el boss
            // Turno del jugador
            jugador.realizarTurno(theGuardian);
        
            if (theGuardian.getPuntosVida() <= 0) {
                System.out.println("¡Has ganado! Pero, ¿que hacías aquí en primer lugar? No eres capaz de recordarlo....");
                System.out.println("Lentamente cierras los ojos, y desapareces junto The Spire...");
                break; // Salir del bucle si el enemigo ha perdido
            }
            // Turno del enemigo
            theGuardian.realizarAccion();
            if (jugador.getPuntosVida() <= 0) {
                System.out.println("¡Has perdido! Tan cerca... ");
                System.out.println("Pero The Spire prosigue con su camino.");
                break; // Salir del bucle si el jugador ha perdido
            }

        }


    }
}
