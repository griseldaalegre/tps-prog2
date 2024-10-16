package clases.comparable;

public class Main {
    public static void main(String[] args) {
        Alumno luis = new Alumno("Luis", "121313", 3);
        Alumno marce = new Alumno("Marcelo", "121314", 5);
        Alumno ana = new Alumno("Ana", "121315", 1);
        Alumno sofia = new Alumno("Sofía", "121316", 2);
        Alumno juan = new Alumno("Juan", "121317", 4);
        Alumno carla = new Alumno("Carla", "121318", 6);

        Facultad facu = new Facultad();
        facu.addAlumno(luis);
        facu.addAlumno(marce);
        facu.addAlumno(ana);
        facu.addAlumno(sofia);
        facu.addAlumno(juan);
        facu.addAlumno(carla);

        System.out.println("Alumnos sin ordenar:");
        facu.mostrarAlumnos();

        // Ordenar los alumnos por legajo
        facu.ordenarAlumnosPorNombre();

        System.out.println("\nAlumnos ordenados por legajo:");
        facu.mostrarAlumnos();
    }
}
