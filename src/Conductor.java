import java.time.LocalDate;

public class Conductor extends Persona {
    private LocalDate fecObCarnet;
    private int puntosCarnet;

    public Conductor(String nombre, LocalDate fecNac, String dNI, LocalDate fecObCarnet, int puntosCarnet) {
        super(nombre, fecNac, dNI);
        this.fecObCarnet = fecObCarnet;
        this.puntosCarnet = puntosCarnet;
    }

    public LocalDate getFecObCarnet() {
        return fecObCarnet;
    }
    public void setFecObCarnet(LocalDate fecObCarnet) {
        this.fecObCarnet = fecObCarnet;
    }

    public int getPuntosCarnet() {
        return puntosCarnet;
    }
    public void setPuntosCarnet(int puntosCarnet) {
        this.puntosCarnet = puntosCarnet;
    }

    @Override
    public String toString() {
        return "Conductor: " + super.toString() + "\nFechade Obtención del Carnet" + fecObCarnet + 
        "\nPuntosCarnet: " + puntosCarnet;
    }
}
