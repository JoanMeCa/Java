package Slay_The_Spire;

public class Cartas {
    private String Nombre;
    private int Coste;
    private int Tipo;
    private int Poder;
    private String Texto;

    public Cartas() {
        this.Nombre = "Golpe";
        this.Coste = 1;
        this.Tipo = 1;
        this.Poder = 1;
        this.Texto = "Golpea a tu oponente";
    }

    public Cartas(String nombre, int coste, int tipo, int poder, String texto) {
        this.Nombre = nombre;
        this.Coste = coste;
        this.Tipo = tipo;
        this.Poder = poder;
        this.Texto = texto;
    }


    public String getNombre() {
        return this.Nombre;
    }

    public int getCoste() {
        return this.Coste;
    }

    public int getTipo() {
        return this.Tipo;
    }
    public int getPoder() {
        return this.Poder;
    }

    public String getTexto() {
        return this.Texto;
    }

    public static Cartas Strike() {
        return new Cartas("Strike", 1, 1, 6, "Haz 6 de daño");
    }

    public static Cartas SwordBoomerang() {
        return new Cartas("Sword Boomerang", 1, 1, 3, "Haz 3 de daño 3 veces");
    }

    public static Cartas Defend() {
        return new Cartas("Defend", 1, 2, 5, "Gana 5 de bloqueo");
    }

    public static Cartas Bloodletting() {
        return new Cartas("Bloodletting", 0, 2, 3, "Pierde 3 de vida. <br> Gana 2 de Energía");
    }


}