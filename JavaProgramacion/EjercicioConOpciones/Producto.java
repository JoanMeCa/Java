package EjercicioConOpciones;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    
    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Setters & Getters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public void setPrecio(double precio) {
        this.precio = precio;
    }public int getCodigo() {
        return codigo;
    }public String getNombre() {
        return nombre;
    }public double getPrecio() {
        return precio;
    }
}
