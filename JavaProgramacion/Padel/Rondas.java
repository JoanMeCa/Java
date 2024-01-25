package Padel;
import java.util.List;
import java.util.Random;

class Ronda {
    private static int count = 1;
    private int id;
    private String nombreEquipo1;
    private String nombreEquipo2;
    private String resultado;

    public Ronda(String nombreEquipo1, String nombreEquipo2) {
        this.id = count++;
        this.nombreEquipo1 = nombreEquipo1;
        this.nombreEquipo2 = nombreEquipo2;
        this.resultado = determinarResultado();
    }

    private String determinarResultado() {
        Random random = new Random();
        return random.nextBoolean() ? nombreEquipo1 + " gana" : nombreEquipo2 + " gana";
    }

    public int getId() {
        return id;
    }

    public String getNombreEquipo1() {
        return nombreEquipo1;
    }

    public String getNombreEquipo2() {
        return nombreEquipo2;
    }

    public String getResultado() {
        return resultado;
    }

    // Método para reiniciar el contador de rondas
    public static void reiniciarContadorRondas() {
        count = 1;
    }
}

public class Rondas {
    public static Ronda jugarRonda(Equipos equipos) {
        List<Equipo> equiposList = equipos.getEquiposList();
        if (equiposList.size() < 2) {
            System.out.println("No hay suficientes equipos para jugar una ronda.");
            return null;
        }
    
        Equipo equipo1 = equiposList.get(0);
        Equipo equipo2 = equiposList.get(1);
    
        // Almacena los nombres de los equipos antes de la salida
        String nombreEquipo1 = equipo1.getNombreEquipo();
        String nombreEquipo2 = equipo2.getNombreEquipo();
    
        Ronda ronda = new Ronda(nombreEquipo1, nombreEquipo2);
    
        // Utiliza los nombres almacenados para mantener el orden en la salida
        System.out.println("Ronda " + ronda.getId() + ": " + nombreEquipo1 + " vs " + nombreEquipo2);
        System.out.println("Resultado: " + ronda.getResultado());
    
        return ronda;
    }
}
