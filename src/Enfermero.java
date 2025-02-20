import java.time.LocalDate;

public class Enfermero extends Persona {
    private String especialidad;
    private String idiomaExtranjero;

    public Enfermero(String nombre, LocalDate fecNac, String dNI, String especialidad, String idiomaExtranjero) {
        super(nombre, fecNac, dNI);
        if (!(especialidad.equals("Obstétrico-ginecológica") ||
                especialidad.equals("Salud Mental") ||
                especialidad.equals("Trabajo") ||
                especialidad.equals("Geriátrica") ||
                especialidad.equals("Pediátrica") ||
                especialidad.equals("Familiar y Comunitaria") ||
                especialidad.equals("Médico-quirúrgica"))) {
            throw new IllegalArgumentException("Error. debe ser una de las siguientes: \n" +
                    "Obstétrico-ginecológica, Salud Mental, Trabajo, Geriátrica, " +
                    "Pediátrica, Familiar y Comunitaria, Médico-quirúrgica");
        } else {
            this.especialidad = especialidad;
            this.idiomaExtranjero = idiomaExtranjero;
        }
    }

    public Enfermero(String nombre, LocalDate fecNac, String dNI, String especialidad) {
        this(nombre, fecNac, dNI, especialidad, "Inglés");
    }

    public Enfermero(String nombre, LocalDate fecNac, String dNI) {
        this(nombre, fecNac, dNI, "Médico-quirúrgica", "Inglés");
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getIdiomaExtranjero() {
        return idiomaExtranjero;
    }
    public void setIdiomaExtranjero(String idiomaExtranjero) {
        this.idiomaExtranjero = idiomaExtranjero;
    }

    @Override
    public String toString() {
        return "Enfermero: " + super.toString() +
        "\nEspecialidad: " + especialidad + "\nIdiomaExtranjero: " + idiomaExtranjero;
    }
    
    

}
