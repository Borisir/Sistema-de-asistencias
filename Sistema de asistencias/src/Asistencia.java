public class Asistencia {
}
public class Asistencia {
    private Estudiante estudiante;
    private Asignatura asignatura;
    private boolean presente;

    public Asistencia(Estudiante estudiante, Asignatura asignatura, boolean presente) {
        this.estudiante = estudiante;
        this.asignatura = asignatura;
        this.presente = presente;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }
}