package tp7.ejercicio1;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    protected ArrayList<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre) {
        setNombre(nombre);
        this.enfermedadesFrecuentes = new ArrayList<Enfermedad>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public void addEnfermedad(Enfermedad e) {
        if (!this.enfermedadesFrecuentes.contains(e)) {
            this.enfermedadesFrecuentes.add(e);
        }
    }

    public void removeEnfermedad(Enfermedad e) {
        enfermedadesFrecuentes.remove(e);
    }

    public boolean puedeSerUtil(Producto producto) {
        if (producto.desaconsejadoParaCultivo(this)) {
            return false;
        }
        //terminar
        return false;
    }


    @Override
    public String toString() {
        return "EJ1Cultivo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
