package JavaInicio.MarvelSnap;

import java.util.Scanner;

public class MarvelSnap {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Carta spiderman = new Carta();
        spiderman.nombre = "Spiderman";
        spiderman.descripcion = "Tu amigo y vecino";
        spiderman.rareza = "Legendario";
        spiderman.vida = 6;
        spiderman.fuerza = 6;
        spiderman.tipo = "Mutante";
        String[] habilidadesSpiderman = {"Sentido Arácnido","Telarañas"};
        spiderman.habilidades = habilidadesSpiderman;
        spiderman.printInfo();
        input.close();
    }

}
