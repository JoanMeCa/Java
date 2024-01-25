package JavaInicio.MasJava.Huh;

import java.util.ArrayList;
import java.util.Arrays;

public class Actividad002lista {
public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                numeros.set(i, numeros.get(i) * 2);
            }
            System.out.println(numeros.get(i));
        }
    }
}