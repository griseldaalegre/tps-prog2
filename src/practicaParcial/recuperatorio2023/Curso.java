package practicaParcial.recuperatorio2023;

import practicaParcial.recuperatorio2023.condiciones.Condicion;

import java.util.ArrayList;

public class Curso extends ComponenteAcademia {

    private double precio;
    private int horas;
    private ArrayList<String> docentes;
    private ArrayList<String> palabrasClaves;

    public Curso(String nombre, double precio, int horas) {
        super(nombre);
        this.precio = precio;
        this.horas = horas;
        this.docentes = new ArrayList<String>();
        this.palabrasClaves = new ArrayList<String>();
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int cantidadHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void addDocente(String d) {
        if (!docentes.contains(d)) {
            this.docentes.add(d);
        }
    }

    public void addPalabraClave(String p) {
        if (!palabrasClaves.contains(p)) {
            this.palabrasClaves.add(p);
        }
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int cantidadCursos() {
        return 1;
    }

    @Override
    public ArrayList<String> getDocentes() {
        return new ArrayList<>(this.docentes);
    }

    @Override
    public ArrayList<String> getPalabras() {
        return new ArrayList<>(this.palabrasClaves);
    }

    @Override
    public ArrayList<Curso> buscar(Condicion c) {
        ArrayList<Curso> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public Curso cursoMasCaro() {
        return this;
    }

}
