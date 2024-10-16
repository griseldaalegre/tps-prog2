package tp8.academiaVirtual;

import clases.farmacia.Medicamento;

import java.util.ArrayList;

//Simple
public class Pregunta extends ComponenteAcademia {
    private String enunciado;
    private int puntaje;
    private int tiempoEstimado;//minutos
    private ArrayList<String> conceptosAEvaluar;// esto va en la pregunta


    public Pregunta(String enunciado, int puntaje, int tiempoEstimado) {
        this.enunciado = enunciado;
        this.puntaje = puntaje;
        this.tiempoEstimado = tiempoEstimado;
        this.conceptosAEvaluar = new ArrayList<String>();
    }

    public void addConcepto(String c) {
        if (!this.conceptosAEvaluar.contains(c.toUpperCase())) {
            this.conceptosAEvaluar.add(c.toUpperCase());
        }
    }

    public void deleteConcepto(String c) {
        this.conceptosAEvaluar.remove(c.toUpperCase());
    }

    @Override
    public double calcularPuntaje() {
        return puntaje;
    }

    @Override
    public int calcularTiempo() {
        return tiempoEstimado;
    }

    @Override
    public ArrayList<String> listadoDeConceptos() {
        return new ArrayList<>(conceptosAEvaluar);
    }


}
