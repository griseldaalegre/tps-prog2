package tp5;

import java.time.LocalDate;

public class EJ1Planta {
    private int id;
    private static int contador = 0; // Contador estático para generar identificadores únicos
    private String nombreCientifico;
    private String nombre;
    private String paisOrigen;
    private LocalDate fechaDeCompra;

    public EJ1Planta(String nombreCientifico, String nombre, String paisOrigen, LocalDate fechaDeCompra) {
        this.nombreCientifico = nombreCientifico;
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.fechaDeCompra = fechaDeCompra;
        this.id = contador;
        contador++;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Planta:" +
                "Nombre: " + getNombre() + "\n" +
                "Pais: " + getPaisOrigen() + "\n" +
                "Fecha de Compra: " + getFechaDeCompra() + "\n" +
                "ID: " + getId();
    }
}

/*1 - El Jardín privado
Se desea implementar un sistema de gestión de plantas para un Jardín privado, de cada planta
se guarda su nombre científico, su nombre común, país de origen, fecha de compra y un
identificador único. Cada vez que se crea una planta nueva para la colección, se debe asignar
un número nuevo de forma automática e incremental*/
