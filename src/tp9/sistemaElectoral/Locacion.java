package tp9.sistemaElectoral;

import java.time.LocalTime;
import java.util.ArrayList;

//COMPUESTO

public class Locacion extends ComponenteElectoral {
    private String nombreLocacion;
    private ArrayList<ComponenteElectoral> locaciones;

    public Locacion(String nombreLocacion) {
        this.nombreLocacion = nombreLocacion;
        this.locaciones = new ArrayList<ComponenteElectoral>();
    }

    public void addMesa(ComponenteElectoral locacion) {
        this.locaciones.add(locacion);// buscar si hay mesas repetidas si es que se pide en el enunciado
    }

    public void deleteMesa(Mesa mesa) {
        this.locaciones.remove(mesa);
    }

    @Override
    public double porcentajeVotosPorCandidato(Candidato c) {
        double resultado = 0;

        for (ComponenteElectoral locacion : locaciones) {
            resultado += locacion.porcentajeVotosPorCandidato(c);
        }
        return resultado / (cantVotosEmitidos() * 100);
    }

    @Override
    public double pocentajeVotosEnBlanco() {
        double votosEnBlanco = 0;

        for (ComponenteElectoral locacion : locaciones) {
            votosEnBlanco += locacion.pocentajeVotosEnBlanco();
        }
        return votosEnBlanco / (cantVotosEmitidos() * 100);
    }

    @Override
    public double porcentajeVotosEmitidosEntre(LocalTime hora1, LocalTime h2) {
        return 0;
    }

    @Override
    public int cantVotosEmitidos() {
        int resultado = 0;
        for (ComponenteElectoral locacion : locaciones) {
            resultado += locacion.cantVotosEmitidos();
        }
        return resultado;
    }
}
