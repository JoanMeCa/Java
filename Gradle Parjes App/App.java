public class App {
    private Map<String, Double> menu;
    private Map<Integer, Map<String, Double>> pedidos;
    private int ultimoIdPedido = 0;

    public App() {
        this.menu = new HashMap<>();
        this.pedidos = new HashMap<>();
    }

    public Map<String, Double> getMenu() {
        return menu;
    }
    public Map<Integer, Map<String, Double>> getPedidos() {
        return pedidos;
    }
    public int getUltimoIdPedido() {
        return ultimoIdPedido;
    }

    public void agregarPlatoAlMenu(String nombre, double precio) {
        menu.put(nombre, precio);
        System.out.println("Plato '" + nombre + "' introducido al menu con precio: " + precio);
    }

    public void eliminarPlatoDelMenu(String nombre) {
        if (menu.remove(nombre) != null) {
            System.out.println("Plato '" + nombre + "' eliminado del menu.");
        } else {
            System.out.println("El plato '" + nombre + "' no existe en el menu.");
        }
    }

    public void listarMenu() {
        System.out.println("Platos en el menu:");
        menu.forEach((nombre, precio) -> System.out.println("- " + nombre + ": " + precio));
    }

    public int crearPedido() {
        int idPedido = ++ultimoIdPedido;
        pedidos.put(idPedido, new HashMap<>());
        System.out.println("Pedido creado con ID: " + idPedido);
        return idPedido;
    }

    public void agregarPlatoAlPedido(int idPedido, String nombrePlato) {
        Map<String, Double> pedido = pedidos.get(idPedido);
        Double precioPlato = menu.get(nombrePlato);
    
        if (pedido != null && precioPlato != null) {
            pedido.put(nombrePlato, precioPlato);
            System.out.println("Plato '" + nombrePlato + "' introducido al pedido " + idPedido + ".");
        } else {
            System.out.println("El pedido o el plato no existe.");
        }
    }

    public double calcularTotalPedido(int idPedido) {
        Map<String, Double> pedido = pedidos.get(idPedido);
        if (pedido != null) {
            double total = pedido.values().stream().mapToDouble(Double::doubleValue).sum();
            total = Math.round(total * 100.0) / 100.0;
            return total;
        } else {
            System.out.println("El pedido " + idPedido + " no existe.");
            return 0.0;
        }
    }
    public void mostrarPedido(int idPedido) {
        Map<String, Double> comanda = pedidos.get(idPedido);
    
        if (comanda != null) {
            System.out.println("Platos en el pedido " + idPedido + ":");
            comanda.forEach((nombre, precio) -> System.out.printf("- %s: %.2f%n", nombre, precio));
        } else {
            System.out.println("El pedido " + idPedido + " no existe.");
        }
    }
}
