import java.sql.SQLOutput
public class Main {
    private static Object paralelo;

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Carlos", "Riofrio");
        Profesor profesor = new Profesor();
        Asignatura asignatura = new Asignatura();
        asignatura.setProfesor(profesor);
        asignatura.setParalelo(paralelo);
        System.out.println("El profesor de la asignatura es: " + asignatura.getProfesor().getNombre() + " " + asignatura.getProfesor().getApellido());



        }
    }