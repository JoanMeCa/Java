package JavaInicio.NuevasCosas;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Fechaa {
    public static void main(String[] args) {
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = fechaActual.format(formatoFecha);
        System.out.println("Fecha y hora actual: " + fechaFormateada);
    }
}