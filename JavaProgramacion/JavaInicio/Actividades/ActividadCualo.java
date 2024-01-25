package JavaInicio.Actividades;

public class ActividadCualo {
    public static void main(String[] args) {
        String frase = "Skibidi pop pop what you say, skibidi pop pop hee hee";
        int contador = 0;
        char[] array = frase.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') { 
                contador = contador + 1;
            }
        }
        System.out.println(frase); 
        System.out.println("La frase tiene un total de " + contador + " espacios en blanco");
    }
}