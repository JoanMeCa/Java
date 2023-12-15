package JavaInicio.MasJava.WTF;

public class Usuario {
    private String nombre;
    private String email;
    private String contraseña;
    private boolean esEncriptada;

    // Constructor con parámetros nombre, email y contraseña
    public Usuario(String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.esEncriptada = false;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean isEsEncriptada() {
        return esEncriptada;
    }

    // Setters
    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Método para encriptar la contraseña
    public void encriptarContraseña() {
        if (!esEncriptada) {
            char[] charArray = contraseña.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                charArray[i] = (char) (charArray[i] + 5);
            }
            contraseña = new String(charArray);
            esEncriptada = true;
        }
    }

    // Método para desencriptar la contraseña
    public void desencriptarContraseña() {
        if (esEncriptada) {
            char[] charArray = contraseña.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                charArray[i] = (char) (charArray[i] - 5);
            }
            contraseña = new String(charArray);
            esEncriptada = false; // Marcamos que la contraseña ya no está encriptada
        }
    }
}
