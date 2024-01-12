package Reloj;

public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    public Reloj() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    public Reloj(int horas, int minutos, int segundos) {
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            System.out.println("Hora introducida inválida, introduzca valores válidos");
        } else {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }
    public void mostrarHora24() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }
    public void mostrarHora12() {
        String formato = (horas < 12) ? "AM" : "PM";
        int horas12 = (horas == 0 || horas == 12) ? 12 : horas % 12;
        System.out.printf("%02d:%02d:%02d %s\n", horas12, minutos, segundos, formato);
    }
}