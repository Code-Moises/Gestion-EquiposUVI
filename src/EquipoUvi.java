import java.time.LocalDate;

public class EquipoUvi {
    private Conductor c1;
    private Enfermero e1;
    private Medico m1;
    private String matriculaAmbulancia;
    private LocalDate fechaServicio;
    private String turno;
    public EquipoUvi(Conductor c1, Enfermero e1, Medico m1, String matriculaAmbulancia, LocalDate fechaServicio,
            String turno) {
        this.c1 = c1;
        this.e1 = e1;
        this.m1 = m1;
        this.matriculaAmbulancia = matriculaAmbulancia;
        this.fechaServicio = fechaServicio;
        this.turno = turno;
    }
    public Conductor getC1() {
        return c1;
    }
    public void setC1(Conductor c1) {
        this.c1 = c1;
    }
    public Enfermero getE1() {
        return e1;
    }
    public void setE1(Enfermero e1) {
        this.e1 = e1;
    }
    public Medico getM1() {
        return m1;
    }
    public void setM1(Medico m1) {
        this.m1 = m1;
    }
    public String getMatriculaAmbulancia() {
        return matriculaAmbulancia;
    }
    public void setMatriculaAmbulancia(String matriculaAmbulancia) {
        this.matriculaAmbulancia = matriculaAmbulancia;
    }
    public LocalDate getFechaServicio() {
        return fechaServicio;
    }
    public void setFechaServicio(LocalDate fechaServicio) {
        this.fechaServicio = fechaServicio;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    @Override
    public String toString() {
        return "#EquipoUvi: \n - "+ c1 + "\n - " + e1 + 
        "\n - " + m1 + "\nMatrícula Ambulancia: " + matriculaAmbulancia
                + "\nFechaServicio: " + fechaServicio + "\nTurno: " + turno;
    }

    public void tratar(Paciente p1) {
        if (p1.getDiagnostico().length() < 15 || p1.getTratamiento().length() < 15) {
            throw new IllegalArgumentException("El diagnóstico o el tratamiento es demasiado corto");
        }

        System.out.println(
            p1 + "\nFue tratado el " + LocalDate.now() + " por " + m1.getNombre()
        );
    }
}   
