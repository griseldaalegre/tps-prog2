package practicaParcial.fotografias;

import java.time.LocalDate;
import java.util.ArrayList;

import practicaParcial.fotografias.condiciones.Condicion;

public class Fotogafia extends ElementoFoto {
    private int id;
    private double peso;
    private ArrayList<String> listaPersonasQueAparecen;

    public Fotogafia(String nombre, LocalDate fecha, int id, double peso) {
        super(nombre, fecha);
        this.id = id;
        this.peso = peso;
        this.listaPersonasQueAparecen = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void addPersona(String persona) {
        if (!tieneAPersona(persona)) {
            this.listaPersonasQueAparecen.add(persona);
        }
    }

    //lo uso para las condiciones
    public boolean tieneAPersona(String nombre) {
        return this.listaPersonasQueAparecen.contains(nombre);
    }

    @Override
    public int getCantidadElementos() {
        return 1;
    }

    @Override
    public ArrayList<String> getListaPersonas() {
        return new ArrayList<>(this.listaPersonasQueAparecen);//devuelvo una copia
    }

    @Override
    public ElementoFoto copia(Condicion c) {
        // Crear la copia básica del objeto Fotografia
        Fotogafia copia = new Fotogafia(this.getNombre(), this.getFecha(), this.getId(), this.getPeso());

        // Copio mi lista
        for (String persona : this.listaPersonasQueAparecen) {
            copia.addPersona(persona); //agrego a la copia
        }

        return copia;
    }

}
