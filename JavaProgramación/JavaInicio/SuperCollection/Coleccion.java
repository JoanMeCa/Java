package JavaInicio.SuperCollection;

public class Coleccion {
    
    public Superheroe[] superheroes;
    public String propietario;
    public String fecha;
    
    /* Constructor vacio */
    public Coleccion(){
    }
    
    //Metodos de nuestra coleccion:
    
    /**
     * Pinta la info de todos los heroes.
     */
    public void pintarInfColeccion(){
        int i = 0;
        while(i < superheroes.length){
            superheroes[i].pintarInformacion();
            i++;
        }
    }
    
    /**
     * Pinta la info de todos los heroes con mas 
     * fuerza que el valor de @fuerza.
     * @param fuerza 
     */
    public void pintarInfColeccion(int fuerza){
        int i = 0;
        while(i < superheroes.length){
            if(superheroes[i].fuerza > fuerza){
                superheroes[i].pintarInformacion();
            }
            
            i++;
        }
    }
    
    public void pintarMasFuerte(int fuerza){
        Superheroe masfuerte = null;
        for (int i = 0; i < superheroes.length; i++) {
            if (superheroes[i].fuerza > fuerza) {
                if (masfuerte == null || superheroes[i].fuerza > masfuerte.fuerza) {
                    masfuerte = superheroes[i];
                }
            }
        }
        System.out.println("La carta más fuerte de la colección es " + masfuerte.nombre);
    }

    public void pintarMasVivo(int vida){
        Superheroe masvivo = null;
        for (int i = 0; i < superheroes.length; i++) {
            if (superheroes[i].vida > vida) {
                if (masvivo == null || superheroes[i].vida > masvivo.vida) {
                    masvivo = superheroes[i];
                }
            }
        }
        System.out.println("La carta más fuerte de la colección es " + masvivo.nombre + " con un valor de " + masvivo.vida);
    }

    public int contarCartasLegendarias() {
        int contador = 0;
        for (int i = 0; i < superheroes.length; i++) {
            if ("legendario".equalsIgnoreCase(superheroes[i].rareza)) {
                contador++;
            }
        }
        return contador;
    }
}
