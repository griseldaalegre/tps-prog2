package tp8.administradorDeTareas;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Crear tareas simples
        TareaSimple ordenar = new TareaSimple("Ordenar");
        ordenar.setCosto(5);
        ordenar.setTiempoEstimado(LocalTime.of(0, 10));

        TareaSimple batir = new TareaSimple("Batir");
        batir.setCosto(10);
        batir.setTiempoEstimado(LocalTime.of(0, 15));

        TareaSimple dejarDescansar = new TareaSimple("Dejar descansar");
        dejarDescansar.setCosto(8);
        dejarDescansar.setTiempoEstimado(LocalTime.of(0, 5));

        TareaSimple hornear = new TareaSimple("Hornear");
        hornear.setCosto(20);
        hornear.setTiempoEstimado(LocalTime.of(1, 0));

        TareaSimple desmoldar = new TareaSimple("Desmoldar");
        desmoldar.setCosto(5);
        desmoldar.setTiempoEstimado(LocalTime.of(0, 5));

        // Crear una tarea compuesta "Cocinar" y añadirle tareas simples
        TareaCompuesta cocinar = new TareaCompuesta("Cocinar");
        cocinar.addTarea(batir);
        cocinar.addTarea(dejarDescansar);

        // Crear la tarea compuesta repetitiva y añadirle "Ordenar", "Cocinar", "Hornear"
        TareaCompuestaRepetitiva recetaRepetida = new TareaCompuestaRepetitiva("Hacer receta", 3);
        recetaRepetida.addTarea(ordenar);
        recetaRepetida.addTarea(cocinar);
        recetaRepetida.addTarea(hornear);

        // Crear la tarea principal, añadir la tarea repetitiva y "Desmoldar"
        TareaCompuesta hacerReceta = new TareaCompuesta("Hacer receta");
        hacerReceta.addTarea(recetaRepetida);
        hacerReceta.addTarea(desmoldar);

        // Mostrar las acciones por realizar
        System.out.println("Acciones por realizar: " + hacerReceta.accionesPorRealizar());

        // Calcular y mostrar el costo total
        System.out.println("Costo total: $" + hacerReceta.calcularCosto());

        // Calcular y mostrar el tiempo estimado total
        System.out.println("Tiempo estimado total: " + hacerReceta.calcularTiempoEstimado());
    }
}
