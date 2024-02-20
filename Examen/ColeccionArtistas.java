import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Esta classe representa la lista de Artistas.
 * Debereis programar cada uno de los métodos con su funcionalidad.
 * Debereis crear el enum EstiloMusical y la classe Artista según el enunciado.
 * Autor: JOAN MENÉNDEZ CALAFELL
 */
public class ColeccionArtistas {
    
    List<Artista> artistas = new ArrayList<>();
    
    /* No modificar */
    public ColeccionArtistas(List<Artista> artistas){
        this.artistas = artistas;
    }
    
    /* No modificar */
    public ColeccionArtistas(){
        this.artistas = new ArrayList<>();
    }
    
    //Debeis implementar los siguientes métodos:
    
    /**
     * Añade un nuevo artista a la colección.
     * El nuevo artista vendrá dado por parámetros.
     */
    public void añadirArtista(Artista artista){
        //Añade el artista a la lista de artistas
        artistas.add(artista);
    }
    
    /**
     * Pinta la información de todos los artistas de tu colección.
     * Pista: Utilizar artisa.pintarInformacion()
     */
    public void pintarColeccion(){
        for (Artista artista : artistas) {
            //Por cada artista en la lista de artistas pinta su información.
            artista.pintarInformacion();
            System.out.println("-------------------------");
        }
    }
    
    /**
     * Pinta por consola la información de un artista a partir de su nombre.
     * Se supone que no habrá varios artistas con el mismo nombre.
     */
    public void pintarArtistaPorNombre(String nombre){
        for (Artista artista : artistas) {
            //Por cada artista en la lista de artistas...
            if (artista.getNombre().equals(nombre)) {
                //Comprueba si el nombre es igual al dado, si así es, pinta su información.
                artista.pintarInformacion();
                return;
            }
        } System.out.println("No hay ningún artista con este nombre");
        //Y en caso contrario da el error de que no se ha encontrado.
    }
    
    /**
     * Encuentra y devuelve el Artista de tu colección,
     * a partir del nombre de su canción más destacada.
     * Si no encuentra la canción, debe devolver null.
     */
    public Artista artistaPorCancion(String cancion){
        for (Artista artista : artistas) {
            //Por cada artista en la lista de artistas...
            if (artista.getCancion().equals(cancion)) {
                //Comprubea si la canción dle artista coincide con el nombre dado...
                //Si se encuentra devueleve al artista correspondiente.
                return artista;
            }
        }
        //Y si no se encuentra devuelve null.
        return null;
    }
    
    /**
     * Devuelve todos los artistas de tu colección, 
     * que coincidan con el estilo musical pasado por parámetros.
     * Si no encuentra ningún artista, debe devolver una lista vacia.
     */
    public List<Artista> artistasPorEstilo(EstiloMusical estilo){
        List<Artista> artistasEncontrados = new ArrayList<>(); //Crea una lista para tener en cuenta los artistas encontrados.
        for (Artista artista : artistas) { //Por cada artista en la lista de artistas...
            if (artista.getEstilo() == estilo) {
                //Si el estilo del artista coincide con el estilo introducido, se añade a la lista de artistas encontrados.
                artistasEncontrados.add(artista);
            }
        }
        //Y por ultimo, se devuelve la lista, que puede estar tanto llena como vacía dependiendo de los reusltados de antes.
        return artistasEncontrados;
    }
    
    /**
     * Devuelve el artista mas escuchado de tu colección.
     * Si no encuentra ningún artista, devolver null.
     */
    public Artista artistaMasEscuchado(){
        Artista masEscuchado = null; //Creo la variable masEscuchado para tener en mente el "ganador"
        int masOyentes = 0; //Creo la variable masOyentes para tener en cuenta el numero a superar para ser el "ganador"
        for (Artista artista : artistas) { //Por cada artista en la lista de artistas...
            if (artista.getOyentes() > masOyentes) {
                //Si el artista tiene mas oyentes que el ultimo artista se vuelve el nuevo masEscuchado
                masOyentes = artista.getOyentes();
                masEscuchado = artista;
            }
        }
        if (masEscuchado == null) { //Si no hay ningun artista en la lista, el valor final es null
            return null;
        } else { //En caso contrario, devuelve al artista masEscuchado
            return masEscuchado;
        }
    }
    
    /**
     * Imprime por pantalla todos los tipos de estilos musicales de la colección.
     * Importante: No deben aparecer repetidos.
     */
    public void pintarEstilosMusicales(){
        Set<EstiloMusical> estilosUnicos = new HashSet<>(); //Creo una "lista" para tener en ella los estilos encontrados sin que se repitan
        for (Artista artista : artistas) { //Por cada artista en la lista de artistas...
            estilosUnicos.add(artista.getEstilo()); //Añado el estilo del artista a la lista.
        }
        for (EstiloMusical estilo : estilosUnicos) { //Por cada estilo en la lista de estilos unicos...
            System.out.println(estilo); //Imprimo el nombre del estilo encontrado, solo una vez ya que ya están filtrados.
        }
    }
}