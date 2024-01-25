package Padel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Equipo {
    private static int count = 1;
    private int id;
    private String jugador1;
    private String jugador2;
    private String nombreEquipo;
    private String numeroContacto;

    public Equipo(String jugador1, String jugador2, String nombreEquipo, String numeroContacto) {
        this.id = count++;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.nombreEquipo = nombreEquipo;
        this.numeroContacto = numeroContacto;
    }
    public int getId() {
        return id;
    }

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }
    
    public String getnumeroContacto() {
        return numeroContacto;
    }
}


class Equipos {
    private List<Equipo> equiposList;

    public List<Equipo> getEquiposList() {
        return equiposList;
    }

    public Equipos() {
        this.equiposList = new ArrayList<>();
    }

    public void agregarEquipo(String jugador1, String jugador2, String nombreEquipo, String numeroContacto) {
        Equipo equipo = new Equipo(jugador1, jugador2, nombreEquipo, numeroContacto);
        equiposList.add(equipo);
        System.out.println("Equipo agregado: " + equipo.getNombreEquipo());
    }
    public void eliminarEquipo(int id) {
        Iterator<Equipo> iterator = equiposList.iterator();
        while (iterator.hasNext()) {
            Equipo equipo = iterator.next();
            if (equipo.getId() == id) {
                iterator.remove();
                System.out.println("Equipo eliminado: " + equipo.getNombreEquipo());
                return;
            }
        }
        System.out.println("Equipo con ID " + id + " no encontrado.");
    }
    
}
