package Estanteria;

public class Libro {
    private String Titulo;
    private String Autor;
    private int Rating;

    public Libro(String Titulo, String Autor, int Rating) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Rating = Rating;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getRating() {
        return Rating;
    }

}