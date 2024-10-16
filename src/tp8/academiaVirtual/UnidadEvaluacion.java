package tp8.academiaVirtual;

import java.util.ArrayList;

public abstract class UnidadEvaluacion extends ComponenteAcademia {
    protected ArrayList<ComponenteAcademia> preguntas;

    public UnidadEvaluacion() {
        this.preguntas = new ArrayList<>();
    }

    public void addPregunta(ComponenteAcademia p) {
        this.preguntas.add(p);
    }

    public void deletePregunta(ComponenteAcademia p) {
        this.preguntas.remove(p);
    }

    public ArrayList<String> listadoDeConceptos() {
        ArrayList<String> listaConceptos = new ArrayList<>();
        for (ComponenteAcademia p : preguntas) {
            listaConceptos.addAll(p.listadoDeConceptos());//addAll
        }
        return listaConceptos;
    }
}
