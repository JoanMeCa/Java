package Estanteria;

public class TestEstanteria {
    public static void main(String[] args) {
        Estanteria estanteria = new Estanteria();

        Libro L1 = new Libro("Libro1", "Autor1", 8);
        Libro L2 = new Libro("Libro2", "Autor2", 7);

        estanteria.agregarLibro(L1);
        estanteria.agregarLibro(L2);

        Libro L3 = new Libro("Libro3", "Autor3", 6);
        Libro L4 = new Libro("Libro4", "Autor4",5);
        Libro L5 = new Libro("Libro5", "Autor5", 4);

        estanteria.agregarLibro(L3);
        estanteria.agregarLibro(L4);
        estanteria.agregarLibro(L5);

        estanteria.mostrarTop10();

        estanteria.eliminarLibro("Autor", "Autor3");

        estanteria.mostrarEstanteria();
    }
}
