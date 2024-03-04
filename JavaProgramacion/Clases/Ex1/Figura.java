package Clases.Ex1;

abstract public class Figura {

}
class Circulo extends Figura {
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Área del círculo: " + area);
    }
    public void calcularPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Perímetro del círculo: " + perimetro);
    }
}
class Cuadrado extends Figura {
    private double lado;
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void calcularArea() {
        double area = Math.pow(lado, 2);
        System.out.println("Área del cuadrado: " + area);
    }
    public void calcularPerimetro() {
        double perimetro = 4 * lado;
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }

}
class Rectangulo extends Figura {
    private double base;
    private double altura;
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public double getBase() {
        return base;
    }
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Área del rectángulo: " + area);
    }
    public void calcularPerimetro() {
        double perimetro = 2 * (base + altura);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2.5);
        Cuadrado cuadrado = new Cuadrado(20);
        Rectangulo rectangulo = new Rectangulo(12, 8);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
    }
}
