package tp7.ejercicio1;

import java.util.ArrayList;

public class Producto {
    private String nombre;
    private ArrayList<String> patologias;
    private ArrayList<Cultivo> cultivosDesaconsejados;

    public Producto(String nombre) {
        setNombre(nombre);
        this.patologias = new ArrayList<String>();
        this.cultivosDesaconsejados = new ArrayList<Cultivo>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public void addPatologia(String p) {
        if (!this.patologias.contains(p.toUpperCase())) {
            this.patologias.add(p.toUpperCase());
        }
    }

    public void deletePatologia(String p) {
        patologias.remove(p.toUpperCase());
    }

    public void addCultivo(Cultivo c) {
        if (!this.cultivosDesaconsejados.contains(c)) {
            this.cultivosDesaconsejados.add(c);
        }
    }

    public void deleteCultivo(Cultivo c) {
        cultivosDesaconsejados.remove(c);
    }

    public boolean desaconsejadoParaCultivo(Cultivo cultivo) {
        return cultivosDesaconsejados.contains(cultivo.getNombre());
    }

    public boolean tienePatologia(String p) {
        return patologias.contains(p.toUpperCase());
    }

    @Override
    public String toString() {
        return "EJ1Producto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
