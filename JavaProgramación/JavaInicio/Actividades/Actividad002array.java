package JavaInicio.Actividades;

public class Actividad002array {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        for (int i = 0; i <= numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numeros[i] *= 2;
                System.out.println(numeros[i]);
            }
            else {
                System.out.println(numeros[i]);
            }   
        }
    }
}
