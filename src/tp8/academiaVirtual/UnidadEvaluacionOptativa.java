package tp8.academiaVirtual;

import java.util.ArrayList;

public class UnidadEvaluacionOptativa extends UnidadEvaluacion {

    UnidadEvaluacionOptativa() {
        super();
    }

    @Override
    public double calcularPuntaje() {
        double puntajeMayor = 0;
        for (ComponenteAcademia p : preguntas) {
            if (puntajeMayor < p.calcularPuntaje()) {
                puntajeMayor = p.calcularPuntaje();
            }
        }
        return puntajeMayor;
    }

    @Override
    public int calcularTiempo() {
        int tiempoMayor = 0;
        for (ComponenteAcademia p : preguntas) {
            if (tiempoMayor < p.calcularTiempo()) {
                tiempoMayor = p.calcularTiempo();
            }
        }
        return tiempoMayor;
    }
}
