import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Persona {
    private String nombre;
    private LocalDate fecNac;
    private String DNI;
    
    public Persona(String nombre, LocalDate fecNac, String dNI) {
        if (dNI.length() != 9) {
            throw new IllegalArgumentException("El DNI debe tener 9 caracteres");
        }else if (nombre.length() < 6) {
            throw new IllegalArgumentException("Nombre demasiado corto");
        } else if (fecNac.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("No puedes tener tiempo de vida negativo xd");
        }
        this.nombre = nombre;
        this.fecNac = fecNac;
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }
    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }

    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }

    @Override
    public String toString() {
        long edad = ChronoUnit.YEARS.between(fecNac, LocalDate.now());
        return nombre + "\nFechaNacimiento: " + fecNac + " ("+ edad +" años)\nDNI: " + DNI;
    }    
}
