package Slay_The_Spire_Electric_Bogaloo;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Personaje {
    private int puntosVida;
    private int energia;
    protected int bloqueo;
    private int danio;
    private boolean debil;
    private boolean vulnerable;

    public Personaje(int puntosVida, int energia, boolean debil, boolean vulnerable) {
        this.puntosVida = puntosVida;
        this.energia = energia;
        this.bloqueo = 0;
        this.danio = 0;
        this.debil = false;
        this.vulnerable = false;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public boolean getDebil() {
        return debil;
    }
    public void setDebil(boolean debil) {
        this.debil = debil;
    }

    public boolean getVulnerable() {
        return vulnerable;
    }
    public void setVulnerable(boolean vulnerable) {
        this.vulnerable = vulnerable;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(int bloqueo) {
        this.bloqueo = bloqueo;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }
    int blockedn = 0;
    int lifedn = 0;
    public void recibirDanio(int cantidad, String quienRecibe) {
        if (bloqueo > 0) {
            for (int i = 0; i < cantidad; i++) {
                if (bloqueo > 0) {
                    bloqueo--;
                    blockedn++;
                } else {
                    puntosVida -= (cantidad - i);
                    lifedn++;
                    break;
                }
            }
            System.out.println(quienRecibe + " absorbió " + blockedn + " puntos de daño.");
            System.out.println(quienRecibe + " recibió " + lifedn + " puntos de daño. Puntos de vida restantes: " + puntosVida);
        } else {
            // Infligir el daño directamente a la vida
            puntosVida -= cantidad;
            System.out.println(quienRecibe + " recibió " + cantidad + " puntos de daño. Puntos de vida restantes: " + puntosVida);
        }
        blockedn = 0;
        lifedn = 0;
    }
}

class Jugador extends Personaje {
    private Mazo mazo;
    private List<Carta> cartasEnMano;
    private Mazo mazoDescartes;

    public Jugador(int puntosVida, int energia, boolean debil, boolean vulnerable, Mazo mazo) {
        super(puntosVida, energia, debil, vulnerable);
        this.mazo = mazo;
        this.cartasEnMano = new ArrayList<>();
        this.mazoDescartes = new Mazo(new ArrayList<>());
    }

    public Mazo getMazo() {
        return mazo;
    }

    public Mazo getMazoDescartes() {
        return mazoDescartes;
    }

    public void descartarMano() {
        cartasEnMano.clear();;
    }

    public void aplicarBloqueo(int cantidad) {
        bloqueo += cantidad;
    }

    public void eliminarBloqueo() {
        bloqueo = 0;
    }

    public void realizarAtaque(Enemigo enemigo, int cantidad) {
        if (getDebil()) {
            enemigo.recibirDanio(cantidad / 2, "El enemigo");
        } else {
            enemigo.recibirDanio(cantidad, "El enemigo");
        }
    }


    public void realizarTurno(Enemigo enemigo) {
        // Establecer la intención del enemigo al inicio del turno del jugador
        enemigo.getAccion();
        setEnergia(3);
        eliminarBloqueo();

        // Imprimir estado inicial del jugador y del enemigo
        System.out.println("Estado del jugador - Puntos de vida: " + getPuntosVida() +
                " - Energía: " + getEnergia() + " - Bloqueo: " + getBloqueo() + " - Daño: " + getDanio() +  
                " - Débil: " + getDebil() + " - Vulnerable: " + getVulnerable());

        System.out.println("Estado del enemigo - Puntos de vida: " + enemigo.getPuntosVida() +
                " - Bloqueo: " + enemigo.getBloqueo() + " - Acción: " + enemigo.getAccion());


        // Mostrar las cartas en la mano al inicio del turno
        cartasEnMano = mazo.robarCartas(5);
        System.out.println("\nCartas en la mano:");
        for (int i = 0; i < cartasEnMano.size(); i++) {
            System.out.println((i + 1) + ". " + cartasEnMano.get(i).getEfecto() +
                    " - Costo de energía: " + cartasEnMano.get(i).getCostoEnergia());
        }

        // Turno del jugador
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Selecciona el número de la carta que quieres jugar (o 0 para terminar el turno): ");
            int cartaSeleccionada = scanner.nextInt();

            if (cartaSeleccionada == 0) {
                // El jugador termina su turno
                break;
            } else if (cartaSeleccionada >= 1 && cartaSeleccionada <= cartasEnMano.size()) {
                // Obtener la carta seleccionada
                Carta cartaJugada = cartasEnMano.get(cartaSeleccionada - 1);

                // Realizar la acción de la carta
                if (cartaJugada.getCostoEnergia() <= getEnergia()) {
                    realizarAccionCarta(cartaJugada, enemigo);
                    if (enemigo.getPuntosVida() <= 0) {
                        break; // Salir de la función realizarTurno
                    }

                    // Mostrar estado actualizado después de cada jugada
                    System.out.println("Estado del jugador - Puntos de vida: " + getPuntosVida() +
                            " - Energía: " + getEnergia() + " - Bloqueo: " + getBloqueo() + " - Daño: " + getDanio() +  
                            " - Débil: " + getDebil() + " - Vulnerable: " + getVulnerable());

                    System.out.println("Estado del enemigo - Puntos de vida: " + enemigo.getPuntosVida() +
                            " - Bloqueo: " + enemigo.getBloqueo() + " - Acción: " + enemigo.getAccion());

                    // Mostrar las cartas en la mano después de cada jugada
                    System.out.println("\nCartas en la mano:");
                    for (int i = 0; i < cartasEnMano.size(); i++) {
                        System.out.println((i + 1) + ". " + cartasEnMano.get(i).getEfecto() +
                                " - Costo de energía: " + cartasEnMano.get(i).getCostoEnergia());
                    }} else {
                    System.out.println("No tienes suficiente energía para jugar esa carta.");
                }
            } else {
                System.out.println("Selección inválida.");
            }
        }
        descartarMano();
        setDebil(false);
    }

    private void realizarAccionCarta(Carta carta, Enemigo enemigo) {
        // Reducir la energía del jugador según el costo de la carta
        setEnergia(getEnergia() - carta.getCostoEnergia());
        if (carta.getEfecto().equals("Otorga 5 puntos de bloqueo al jugador")) {
            aplicarBloqueo(5);
        }
        if (carta.getEfecto().equals("Hace 6 puntos de daño al enemigo")) {
            realizarAtaque(enemigo, 6);
        }
        if (carta.getEfecto().equals("Hace 32 puntos de daño al enemigo")) {
            realizarAtaque(enemigo, 32);
        }
        if (carta.getEfecto().equals("Recibe 3 puntos de daño, obtén 2 puntos de energía extra")) {
            recibirDanio(3, "Jugador");
            setEnergia(getEnergia() + 2);
        }
        cartasEnMano.remove(carta);
        mazoDescartes.agregarCartaAlDescarte(carta);
    }
}

class Enemigo extends Personaje {
    protected Jugador jugador;
    protected String accionIntencion;

    public Enemigo(int puntosVida, int energia, int bloqueo, boolean debil, boolean vulnerable, Jugador jugador) {
        super(puntosVida, energia, debil, vulnerable);
        this.jugador = jugador;
        this.accionIntencion = "Realizar una acción genérica";
    }

    public Jugador getJugador() {
        return jugador;
    }

    public String getAccion() {
        return accionIntencion;
    }

    public void aplicarBloqueo(int cantidad) {
        bloqueo += cantidad;
    }

    public void eliminarBloqueo() {
        bloqueo = 0;
    }
}

class AcidSlime extends Enemigo {

    private boolean lick; // Variable para determinar si el AcidSlime usará Lick

    public AcidSlime(Jugador jugador) {
        super(20, 0, 0, false, false, jugador);
        establecerIntencion(); // Establecer la intención al inicio
    }

    private void establecerIntencion() {
        lick = estaLick();
        accionIntencion = "El enemigo va a usar " + (lick ? "Lick: Te otorga 1 Débil" : "Tackle: Te hace 3 puntos de daño");
    }

    @Override
    public String getAccion() {
        return accionIntencion;
    }

    public void realizarAccion() {
        // Elegir aleatoriamente entre "Lick" y "Tackle"
        int cantidadDanio;
        if (lick) {
            System.out.println("Acid Slime usó Lick. Te otorga 1 Débil.");
            debilitarJugador();
            cantidadDanio = 0; // No inflige daño con Lick
        } else {
            System.out.println("Acid Slime usó Tackle. Te ha inflingido 3 puntos de daño");
            cantidadDanio = 3; // Cantidad de daño con Tackle
        }
        getJugador().recibirDanio(cantidadDanio, "Jugador");
        // Actualizar la intención al finalizar el turno del jugador
        establecerIntencion();

    }

    private void debilitarJugador() {
        getJugador().setDebil(true);
    }


    private boolean estaLick() {
        // Lógica para determinar si el AcidSlime va a usar Lick
        Random random = new Random();
        return random.nextBoolean();
    }
}

class JawWorm extends Enemigo {

    private boolean chomp; // Variable para determinar si el AcidSlime usará Lick
    int fuerza = 0;

    public JawWorm(Jugador jugador) {
        super(46, 0, 0, false, false, jugador);
        establecerIntencion(); // Establecer la intención al inicio
    }

    private void establecerIntencion() {
        int dano = 12 + fuerza;
        chomp = estaChomp();
        accionIntencion = "El enemigo va a usar " + (chomp ? "Chomp: Te hace " + dano + " puntos de daño" : "Bellow: Gana 9 de bloqueo y 3 de fuerza");
    }

    @Override
    public String getAccion() {
        return accionIntencion;
    }

    public void realizarAccion() {
        int dano = 12 + fuerza;
        eliminarBloqueo();
        if (chomp) {
            System.out.println("Jaw Worm usó Chomp. Te ha inflingido" + dano + "puntos de daño.");
            getJugador().recibirDanio(dano, "Jugador");
        } else {
            System.out.println("Jaw Worm usó Bellow. Ha ganado 9 de bloqueo y su fuerza ha aumentado en 3.");
            aplicarBloqueo(9);
            fuerza++;
            fuerza++;
            fuerza++;
        }
        // Actualizar la intención al finalizar el turno del jugador
        establecerIntencion();

    }

    private boolean estaChomp() {
        // Lógica para determinar si el JawWorm va a usar Chomp
        Random random = new Random();
        return random.nextBoolean();
    }
}

class TheGuardian extends Enemigo {

    int fuerza = 0;
    int dano;
    int ultimaOpcion = 0;
    int opcionElegida = opcion();

    public TheGuardian(Jugador jugador) {
        super(150, 0, 0, false, false, jugador);
        ultimaOpcion = 0;
        establecerIntencion(); // Establecer la intención al inicio
    }

    private void establecerIntencion() {
        opcionElegida = opcion();
        if (opcionElegida == 1) {
            if (jugador.getVulnerable()) {
                dano = 20;
            } else {
                dano = 10;
            }
            accionIntencion = "El enemigo va a usar Roll Attack: Te hace " + dano + " puntos de daño";
        } else if (opcionElegida == 2) {
            accionIntencion = "El enemigo va a usar Charging Up: Gana 9 de bloqueo y se prepara para atacar...";
        } else if (opcionElegida == 3) {
            accionIntencion = "El enemigo va a usar Vent Steam: Te inflige 1 Débil y 1 Vulnerable";
        } else if (opcionElegida == 4) {
            if (jugador.getVulnerable()) {
                dano = 64;
            } else {
                dano = 32;
            }
            accionIntencion = "El enemigo va a usar Fierce Bash: Te inflige " + dano + " puntos de daño!";
        }
    }

    @Override
    public String getAccion() {
        return accionIntencion;
    }

    public void realizarAccion() {
        eliminarBloqueo();
        if (opcionElegida == 1) {
            if (jugador.getVulnerable()) {
                dano = 20;
            } else {
                dano = 10;
            }
            System.out.println("The Guardian usó Roll Attack. Te ha infligido " + dano + " puntos de daño.");
            getJugador().recibirDanio(dano, "Jugador");
            jugador.setVulnerable(false);
        } else if (opcionElegida == 2) {
            System.out.println("The Guardian usó Charging Up. Ha ganado 9 de bloqueo y se prepara para un poderoso ataque...");
            aplicarBloqueo(9);
            jugador.setVulnerable(false);
        } else if (opcionElegida == 3) {
            System.out.println("The Guardian usó Vent Steam. Te ha infligido Débil y Vulnerable.");
            debilitarJugador();
        } else if (opcionElegida == 4) {
            if (jugador.getVulnerable()) {
                dano = 64;
            } else {
                dano = 32;
            }
            System.out.println("The Guardian usó Fierce Bash. Te ha infligido " + dano + " puntos de daño.");
            getJugador().recibirDanio(dano, "Jugador");
            jugador.setVulnerable(false);
        }
    
        // Actualizar la intención al finalizar el turno del jugador
        establecerIntencion();
    }

    private void debilitarJugador() {
        getJugador().setDebil(true);
        getJugador().setVulnerable(true);
    }

    private int opcion() {
        if (ultimaOpcion == 2) {
            ultimaOpcion = 4;
            return 4;
        } else {
            Random random = new Random();
            int nuevaOpcion;
            nuevaOpcion = random.nextInt(3) + 1;
            ultimaOpcion = nuevaOpcion;
            return nuevaOpcion;
        }
    }
}
