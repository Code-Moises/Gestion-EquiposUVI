import java.time.LocalDate;

public class Paciente extends Persona{
    private String diagnostico;
    private String tratamiento;

    public Paciente(String nombre, LocalDate fecNac, String dNI, String diagnostico, String tratamiento) {
        super(nombre, fecNac, dNI);
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    @Override
    public String toString() {
        return "Paciente: " + super.toString() +
        "\nDiagnostico: " + diagnostico + " \nTratamiento: " + tratamiento;
    }
}
