public class Artista {
    private String nombre;
    private EstiloMusical estilo;
    private String cancion;
    private int oyentes;
    private String pais;

    //Constructor Vacío

    public Artista() {
    }

    //Constructor

    public Artista(String nombre, EstiloMusical estilo, String cancion, int oyentes, String pais) {
        this.nombre = nombre;
        this.estilo = estilo;
        this.cancion = cancion;
        this.oyentes = oyentes;
        this.pais = pais;
    }

    //Setters y getters

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }
    public void setEstilo(EstiloMusical estilo) {
        this.estilo = estilo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setOyentes(int oyentes) {
        this.oyentes = oyentes;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getCancion() {
        return cancion;
    }
    public EstiloMusical getEstilo() {
        return estilo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getOyentes() {
        return oyentes;
    }
    public String getPais() {
        return pais;
    }


    public void pintarInformacion() {
        System.out.println("--- NOMBRE DEL ARTISTA ---");
        System.out.println("------ " + nombre + " ------");
        System.out.println("--- ESTILO DEL ARTISTA ---");
        System.out.println("------ " + estilo + " ------");
        System.out.println("--- CANCIÓN DEL ARTISTA ---");
        System.out.println("------ " +cancion + " ------");
        System.out.println("--- OYENTES DEL ARTISTA ---");
        System.out.println("------ " + oyentes + " ------");
    }
}

//Con el enumerado aquí todo funciona perfectamente.
//Intenté crearlo en un archivo java aparte, ya que en el enunciado dice de entregar una clase que sea EstiloMusical...
//Pero no fui capaz de hacerlo y que funcionara, de cualquier forma, así como está funciona perfectamente, así que espero que baste...

enum EstiloMusical {
    POP, ROCK, RAP;
}