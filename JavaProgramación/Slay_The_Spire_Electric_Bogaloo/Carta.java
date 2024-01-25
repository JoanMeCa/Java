package Slay_The_Spire_Electric_Bogaloo;

public class Carta {
    private int costoEnergia;
    private String efecto;

    public Carta(int costoEnergia, String efecto) {
        this.costoEnergia = costoEnergia;
        this.efecto = efecto;
    }

    public int getCostoEnergia() {
        return costoEnergia;
    }

    public void setCostoEnergia(int costoEnergia) {
        this.costoEnergia = costoEnergia;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }
}