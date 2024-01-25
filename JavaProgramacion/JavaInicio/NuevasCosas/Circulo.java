package JavaInicio.NuevasCosas;

public class Circulo {
    private double radio;
    private String color;
    public Circulo() {
        this.radio = 1.0;
        this.color = "rojo";
    }
    public Circulo(double radio) {
        this.radio = radio;
        this.color = "rojo";
    }
    public double getRadio() {
        return radio;
    }
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String nuevoColor) {
        this.color = nuevoColor;
    }
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(3.0);
        miCirculo.setColor("Azul");
        System.out.println("Radio: " + miCirculo.getRadio());
        System.out.println("Área: " + miCirculo.getArea());
        System.out.println("Color: " + miCirculo.getColor());
    }
}
