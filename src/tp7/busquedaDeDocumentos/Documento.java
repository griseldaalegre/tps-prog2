package tp7.busquedaDeDocumentos;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private String contenido;
    private ArrayList<String> autores;
    private ArrayList<String> palabrasClaves;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autores = new ArrayList<String>();
        this.palabrasClaves = new ArrayList<String>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void addAutor(String autor) {
        if (!this.autores.contains(autor.toUpperCase())) {
            this.autores.add(autor.toUpperCase());
        }
    }

    public void removeAutor(String autor) {
        this.autores.remove(autor.toUpperCase());
    }

    public void addPalabraClave(String palabra) {
        if (!this.palabrasClaves.contains(palabra.toUpperCase())) { // Cambiado de autores a palabrasClaves
            this.palabrasClaves.add(palabra.toUpperCase());
        }
    }

    public void removePalabra(String palabra) {
        this.palabrasClaves.remove(palabra.toUpperCase());
    }

    public boolean tieneAutor(String autor) {
        return this.autores.contains(autor.toUpperCase());
    }

    public boolean tienePalabraClave(String palabra) {
        return this.palabrasClaves.contains(palabra.toUpperCase());
    }

    public boolean tieneContenido(String contenido) {
        return this.contenido.toUpperCase().contains(contenido.toUpperCase());
    }


    //implementar el  equals?


    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}
