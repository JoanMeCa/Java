package Padel;

import java.util.Scanner;

public class Torneo {
    private static void mostrarMenu() {
    System.out.println("---- MENÚ ----");
    System.out.println("0. Salir");
    System.out.println("1. Crear equipo");
    System.out.println("2. Eliminar equipo");
    System.out.println("3. Mostrar equipos");
    System.out.println("4. Iniciar torneo");
    System.out.print("Seleccione una opción: ");
    }
    public static void main(String[] args) {
        Equipos equipos = new Equipos();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            mostrarMenu();
            
            // Verificar si la entrada es numérica
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 0:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        break;
                    case 1:
                        crearEquipo(equipos, scanner);
                        break;
                    case 2:
                        eliminarEquipo(equipos, scanner);
                        break;
                    case 3:
                        mostrarEquipos(equipos);
                        break;
                    case 4:
                        iniciarTorneo(equipos, scanner);
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elija de nuevo.");
                        break;
                }
            } else {
                // Consumir la entrada no numérica para evitar un bucle infinito
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next();
                opcion = -1; // Establecer una opción no válida para continuar en el bucle
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void crearEquipo(Equipos equipos, Scanner scanner) {
        // Consumir cualquier carácter de nueva línea en el búfer
        scanner.nextLine();
    
        System.out.print("Ingrese el nombre del primer jugador: ");
        String jugador1 = scanner.nextLine();
        
        System.out.print("Ingrese el nombre del segundo jugador: ");
        String jugador2 = scanner.nextLine();
        
        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();

        System.out.print("Ingrese el número de contacto: ");
        String numeroContacto = scanner.nextLine();
    
        equipos.agregarEquipo(jugador1, jugador2, nombreEquipo, numeroContacto);
        System.out.println("Equipo creado con éxito.");
    }

    private static void eliminarEquipo(Equipos equipos, Scanner scanner) {
        System.out.println("Lista de equipos:");
        mostrarEquipos(equipos);

        System.out.print("Ingrese el ID del equipo que desea eliminar: ");
        int idEquipo = scanner.nextInt();

        equipos.eliminarEquipo(idEquipo);
        System.out.println("Equipo eliminado con éxito.");
    }

    private static void mostrarEquipos(Equipos equipos) {
        System.out.println("---- LISTA DE EQUIPOS ----");
        for (Equipo equipo : equipos.getEquiposList()) {
            System.out.println("ID: " + equipo.getId() + " - " + equipo.getNombreEquipo() +
                    " - Jugador 1: " + equipo.getJugador1() + " - Jugador 2: " + equipo.getJugador2() + " - Número de Contacto: " + equipo.getnumeroContacto()) ;
        }
        System.out.println("-------------------------");
    }

    private static void iniciarTorneo(Equipos equipos, Scanner scanner) {
        System.out.println("Lista de equipos:");
        mostrarEquipos(equipos);
    
        System.out.print("Ingrese el ID del primer equipo: ");
        int idEquipo1 = scanner.nextInt();
    
        System.out.print("Ingrese el ID del segundo equipo: ");
        int idEquipo2 = scanner.nextInt();

        Ronda.reiniciarContadorRondas();
    
        // Obtener los equipos seleccionados
        Equipo equipo1 = equipos.getEquiposList().stream().filter(e -> e.getId() == idEquipo1).findFirst().orElse(null);
        Equipo equipo2 = equipos.getEquiposList().stream().filter(e -> e.getId() == idEquipo2).findFirst().orElse(null);
    
        // Verificar si los equipos existen
        if (equipo1 != null && equipo2 != null) {
            int rondasGanadasEquipo1 = 0;
            int rondasGanadasEquipo2 = 0;
    
            while (rondasGanadasEquipo1 < 3 && rondasGanadasEquipo2 < 3) {
                // Jugar la ronda y obtener el resultado
                Ronda ronda = new Ronda(equipo1.getNombreEquipo(), equipo2.getNombreEquipo());
                String resultado = ronda.getResultado();
    
                // Actualizar las puntuaciones según el resultado de la ronda
                if (resultado.contains(equipo1.getNombreEquipo())) {
                    rondasGanadasEquipo1++;
                } else {
                    rondasGanadasEquipo2++;
                }
    
                // Imprimir información de la ronda
                System.out.println("Ronda " + ronda.getId() + ": " + equipo1.getNombreEquipo() + " vs " + equipo2.getNombreEquipo());
                System.out.println("Resultado: " + resultado);
            }
    
            // Determinar al ganador del torneo
            String nombreGanador = null;
            if (rondasGanadasEquipo1 == 3) {
                nombreGanador = equipo1.getNombreEquipo();
            } else if (rondasGanadasEquipo2 == 3) {
                nombreGanador = equipo2.getNombreEquipo();
            }
    
            if (nombreGanador != null) {
                System.out.println("¡El equipo ganador es: " + nombreGanador + "!");
            } else {
                System.out.println("No se determinó un ganador.");
            }
        } else {
            System.out.println("Uno o ambos equipos seleccionados no existen.");
        }
    }
}