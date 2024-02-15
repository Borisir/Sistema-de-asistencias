public class Paralelo {
}
import java.util.List;

public class Paralelo {
    private String nombre;
    private List<Estudiante> estudiantes;
    private List<Asignatura> asignaturas;

    public Paralelo(String nombre, List<Estudiante> estudiantes, List<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
        this.asignaturas = asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}