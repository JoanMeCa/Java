package JavaInicio.NuevasCosas;

public class Factura {
    private int codigo;
    private double coste;
    public Factura(int codigo, double coste) {
        this.codigo = codigo;
        this.coste = coste;
    }
    public void imprimir() {
        double iva = 0.21; 
        double costeConIVA = coste * (1 + iva);

        System.out.println("Código de la factura: " + codigo);
        System.out.println("Coste total (sin IVA): $" + coste);
        System.out.println("Coste total (con IVA al 21%): $" + costeConIVA);
    }
    public static void main(String[] args) {
        // Crear una nueva factura con código 123 y coste 100.0
        Factura factura = new Factura(1, 100.0);

        // Imprimir la factura, incluyendo el IVA
        factura.imprimir();
    }
}