package JavaInicio.Actividades;

public class ActividadQue {
    public static void main(String[] args) {
        String frase = "Hey, muy buenas a todos, guapísimos, aquí Vegetta-777, en un gameplay en directo, de java.";
        char[] arrayFrase = frase.toCharArray();
        int contador = 0;
        while (contador < arrayFrase.length ) {
            System.out.print(arrayFrase[contador]);
            contador++;
        }
    }
}
