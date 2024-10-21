package tp9.sistemaElectoral;

import java.time.LocalTime;

//COMPONENTE ABSTRACT
public abstract class ComponenteElectoral {
    public abstract double porcentajeVotosPorCandidato(Candidato c);

    public abstract double pocentajeVotosEnBlanco();

    public abstract double porcentajeVotosEmitidosEntre(LocalTime hora1, LocalTime h2);

    public abstract int cantVotosEmitidos();
}
