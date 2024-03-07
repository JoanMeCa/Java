package EjercicioConOpciones;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProductosApp {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap<Integer, Producto> ProductosMap = new HashMap<>();

        System.out.println("Ingresa la ruta al archivo de productos: ");
        Scanner scanner = new Scanner(System.in);
        String rutaProductos = scanner.nextLine();

        ProductosMap = leerArchivoProductos(rutaProductos);

        System.out.println("Ingresa el código del producto: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int codigoIngresado = -1;  // Valor por defecto o inválido
        while (codigoIngresado != 0) {
            codigoIngresado = Integer.parseInt(reader.readLine());
            if (ProductosMap.containsKey(codigoIngresado)) {
                Producto productoEncontrado = ProductosMap.get(codigoIngresado);
                System.out.println("Información del producto: ");
                System.out.println("Código: " + productoEncontrado.getCodigo());
                System.out.println("Nombre: " + productoEncontrado.getNombre());
                System.out.println("Precio: " + productoEncontrado.getPrecio());
                System.out.println("Ingresa el código del producto: ");
            } else if (codigoIngresado == 0) {
                System.out.println("Gracias y vuelva pronto.");
            } else {
                System.out.println("Por favor, ingrese un código válido.");
            } 

        }
        scanner.close();
    }

    private static HashMap<Integer, Producto> leerArchivoProductos(String ruta) throws IOException {
        HashMap<Integer, Producto> productosMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String text = br.readLine();
            while (text != null) {
                String[] linea = text.split(",");
                int codigoProducto = Integer.parseInt(linea[0]);
                double precio = Double.parseDouble(linea[2]);
                Producto producto = new Producto(codigoProducto, linea[1], precio);
                productosMap.put(codigoProducto, producto);
                text = br.readLine();
            }
        }
        return productosMap;
    }
}
