import java.sql.SQLOutput
public class Main {
public static void main(String[] args) {

    Estudiante estudiante1 = new Estudiante("Juan", "Perez");
    Estudiante estudiante2 = new Estudiante("Maria", "Gomez");


    Asignatura asignatura1 = new Asignatura("Matematicas");
    Asignatura asignatura2 = new Asignatura("Fisica");


    Asistencia asistencia1 = new Asistencia(estudiante1, asignatura1, true);
    Asistencia asistencia2 = new Asistencia(estudiante2, asignatura2, false);


    List<Estudiante> estudiantes = new ArrayList<>();
    estudiantes.add(estudiante1);
    estudiantes.add(estudiante2);


    List<Asignatura> asignaturas = new ArrayList<>();
    asignaturas.add(asignatura1);
    asignaturas.add(asignatura2);


    Paralelo paralelo = new Paralelo("Paralelo A", estudiantes, asignaturas);


    System.out.println("Nombre del Paralelo: " + paralelo.getNombre());
    System.out.println("Estudiantes en el Paralelo: " + paralelo.getEstudiantes().size());
    System.out.println("Asignaturas en el Paralelo: " + paralelo.getAsignaturas().size());
}
    }