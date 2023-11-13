package JavaInicio.MarvelSnap;

public class Carta {
    String nombre;
        String descripcion;
        String[] habilidades;
        String rareza; //Común, Rara, Épica, Legendaria
        String tipo; //Humano, Alien, Robot, etc
        //Ints
        int fuerza; // 0 a 10
        int vida; // 0 10
        public Carta(String nombre, String descripcion ,int fuerza, int vida) {
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.fuerza = fuerza;
            this.vida = vida;
            this.rareza = "Común";
        }
        public Carta(){
            this.rareza = "Común";
        }
        public void printInfo() {
            System.out.println(nombre + " - " + descripcion);
            System.out.println("Rareza: " + rareza);
            System.out.println("Fuerza: " + fuerza);
            System.out.println("Vida: " + vida);
        }
}
