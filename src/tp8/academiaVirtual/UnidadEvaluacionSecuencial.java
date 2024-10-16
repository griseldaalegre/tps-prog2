package tp8.academiaVirtual;

import java.util.ArrayList;

//Compuesto
public class UnidadEvaluacionSecuencial extends UnidadEvaluacion {

    public UnidadEvaluacionSecuencial() {
        super();
    }

    @Override
    public double calcularPuntaje() {
        double puntaje = 0;
        for (ComponenteAcademia p : preguntas) {
            puntaje += p.calcularPuntaje();//pregunto a sus hijos su puntaje
        }
        return puntaje;
    }

    @Override
    public int calcularTiempo() {
        int tiempo = 0;
        for (ComponenteAcademia p : preguntas) {
            tiempo += p.calcularTiempo();//pregunto el tiempo a su puntaje
        }
        return tiempo;
    }

}
