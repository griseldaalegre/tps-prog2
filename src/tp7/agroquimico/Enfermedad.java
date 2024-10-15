package tp7.agroquimico;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> patologias;

    public Enfermedad(String nombre) {
        this.setNombre(nombre);
        this.patologias = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public void addPatologia(String p) {
        if (!this.patologias.contains(p.toUpperCase())) {
            this.patologias.add((p.toUpperCase()));
        }
    }

    public void removePatologia(String p) {
        this.patologias.remove(p.toUpperCase());
    }


    public boolean tienePatologia(String p) {
        return patologias.contains(p.toUpperCase());
    }

    public ArrayList<String> getCopiaPatologias() {
        return new ArrayList<>(patologias); // Crea una nueva lista copiando 'patologias'
    }

    @Override
    public String toString() {
        return "EJ1Enfermedad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
