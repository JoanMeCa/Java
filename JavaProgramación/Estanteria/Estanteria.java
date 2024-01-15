package Estanteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

class Estanteria {

    private List<Libro> LibrosEnEstanteria;

    public Estanteria() {
        this.LibrosEnEstanteria = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (LibrosEnEstanteria.size() < 10) {
            LibrosEnEstanteria.add(libro);
            System.out.println("Se ha agregado " + libro.getTitulo() + " a la estantería.");
        } else {
            System.out.println("La estantería ya alcanzó el límite de 10 libros. No se puede agregar más.");
        }
    }

    public void eliminarLibro(String criterio, String valor) {
        Iterator<Libro> iterator = LibrosEnEstanteria.iterator();
    
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (("Titulo".equals(criterio) && libro.getTitulo().equals(valor)) ||
                ("Autor".equals(criterio) && libro.getAutor().equals(valor))) {
                iterator.remove();
                System.out.println("Libro eliminado de la estantería: " + libro.getTitulo());
                return;  // Agregamos un return para salir del método después de eliminar el libro
            }
        }
    
        System.out.println("No se encontró un libro con el criterio proporcionado en la estantería.");
    }

    public void mostrarTop10() {
        // Ordenar la lista de libros en la estantería por calificación en orden descendente
        Collections.sort(LibrosEnEstanteria, (libro1, libro2) -> Integer.compare(libro2.getRating(), libro1.getRating()));

        // Mostrar los 10 libros de mayor calificación en la estantería
        int count = Math.min(10, LibrosEnEstanteria.size());
        for (int i = 0; i < count; i++) {
            Libro libro = LibrosEnEstanteria.get(i);
            System.out.println("Libro #" + (i + 1) + ":");
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Calificación: " + libro.getRating());
            System.out.println("------------------------");
        }
    }

    public void mostrarEstanteria() {
        System.out.println("Lista de libros en la estantería:");

        for (Libro libro : LibrosEnEstanteria) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Calificación: " + libro.getRating());
            System.out.println("------------------------");
        }
    }
}