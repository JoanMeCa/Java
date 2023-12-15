package JavaInicio.MasJava.WTF;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Usuario
        Usuario usuario = new Usuario("Ejemplo", "ejemplo@email.com", "miContraseña");

        // Mostrar detalles del usuario antes de la encriptación
        mostrarDetallesUsuario(usuario);

        // Encriptar la contraseña
        usuario.encriptarContraseña();
        System.out.println("Contraseña encriptada.");

        // Mostrar detalles del usuario después de la encriptación
        mostrarDetallesUsuario(usuario);

        // Desencriptar la contraseña
        usuario.desencriptarContraseña();
        System.out.println("Contraseña desencriptada.");

        // Mostrar detalles del usuario después de la desencriptación
        mostrarDetallesUsuario(usuario);
    }

    // Método para mostrar detalles del usuario
    private static void mostrarDetallesUsuario(Usuario usuario) {
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Contraseña: " + usuario.getContraseña());
        System.out.println("¿Contraseña Encriptada?: " + usuario.isEsEncriptada());
        System.out.println("-----------------------------");
    }
}
