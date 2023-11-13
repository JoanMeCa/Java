package JavaInicio.MarvelSnap;

import java.util.Scanner;

public class MarvelSnap {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Carta spiderman = new Carta();
        Carta superman = new Carta("Superman", "Hijo pródigo de Krypton" ,7, 10);
        spiderman.nombre = "Spiderman";
        spiderman.descripcion = "Tu amigo y vecino";
        spiderman.vida = 6;
        spiderman.fuerza = 6;
        spiderman.tipo = "Mutante";
        String[] habilidadesSpiderman = {"Sentido Arácnido","Telarañas"};
        spiderman.habilidades = habilidadesSpiderman;
        spiderman.printInfo();
        superman.printInfo();
        input.close();
        Coleccion marvel = new Coleccion();
        marvel.cartas = new Carta[]{spiderman};
        marvel.owner = "Marvel";
        marvel.fecha = "1962";
        Coleccion dc = new Coleccion();
        dc.cartas = new Carta[]{superman};
        dc.owner = "DC";
        dc.fecha = "1938";
        marvel.printCreador();
        dc.printCreador();
    }

}
