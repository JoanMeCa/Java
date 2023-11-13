package JavaInicio.MarvelSnap;

public class Coleccion {
    public Carta[] cartas;
    public String owner;
    public String fecha;
    public Coleccion() {
    
    }
    public void printCreador() {
        System.out.println(owner);
        System.out.println(cartas);
        System.out.println(fecha);
    }
}
