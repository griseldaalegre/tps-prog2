package clases.sistemaDeArchivos;

import java.time.LocalDate;

public class Archivo extends ElementoSA {
    private String extension;
    private double tamanio;

    public Archivo(String nombre, String extension, double tamanio) {
        super(nombre);
        this.extension = extension;
        this.tamanio = tamanio;
    }

    public String getExtension() {
        return extension;
    }

    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int getCantidadElementos() {
        return 1;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
        this.setFechaUltimaModificacion();
    }


    @Override
    public String toString() {
        return "Archivo{" +
                "extension='" + extension + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
}
