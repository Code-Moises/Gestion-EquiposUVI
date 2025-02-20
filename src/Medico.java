import java.time.LocalDate;

public class Medico extends Persona{
    /*a fecha en que empezó a trabajar en uvimovil, la especialidad del médico y otro con el n.º de colegiado */
    private LocalDate inUviMovil;
    private String especialidad;
    private String nColegiado;

    public Medico(String nombre, String fecNac, LocalDate dNI, LocalDate inUviMovil, String especialidad,
            String nColegiado) {
        super(nombre, dNI, fecNac);
        this.inUviMovil = inUviMovil;
        this.especialidad = especialidad;
        this.nColegiado = nColegiado;
    }

    public Medico(String nombre, LocalDate fecNac, String dNI, LocalDate inUviMovil, String nColegiado) {
        this(nombre, dNI, fecNac, inUviMovil, "Médicina de Emergencia", nColegiado);
    }

    public LocalDate getInUviMovil() {
        return inUviMovil;
    }
    public void setInUviMovil(LocalDate inUviMovil) {
        this.inUviMovil = inUviMovil;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getnColegiado() {
        return nColegiado;
    }
    public void setnColegiado(String nColegiado) {
        this.nColegiado = nColegiado;
    }

    @Override
    public String toString() {
        return "Medico: " + super.toString() + 
        "\nFecha de Inicio en Uvimovil: " + inUviMovil + 
        "\nEspecialidad: " + especialidad + "\nNúmero de Colegiado: " + nColegiado;
    }

    
    
}
