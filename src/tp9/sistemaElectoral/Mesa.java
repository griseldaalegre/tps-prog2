package tp9.sistemaElectoral;

import java.time.LocalTime;
import java.util.ArrayList;

//SIMPLE
public class Mesa extends ComponenteElectoral {
    private int numeroMesa;
    private ArrayList<Integer> padron;
    private ArrayList<Votante> votos;

    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.padron = new ArrayList<Integer>();
        this.votos = new ArrayList<Votante>();
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public void addPadron(int persona) {
        if (!this.padron.contains(persona)) {
            this.padron.add(persona);//agrego personas al padron
        }
    }

    public void emitirVoto(Votante voto, Candidato candidato) {
        if (buscarEnPadron(voto)) {//buscar en el  padron
            voto.setFechaVoto(LocalTime.now());//guardo la fecha del voto
            voto.setReferenciaCandidato(candidato);//mando la referencia al candidato - despues corroborar q pasa si es null
        }
    }

    public boolean buscarEnPadron(Votante votante) {
        return this.padron.contains(votante.getDni()); //si el padron contiene a X dni, agrego el voto
    }


    @Override
    public double porcentajeVotosPorCandidato(Candidato c) {
        double resultado = 0;
        for (Votante voto : votos) {
            if (voto.getReferenciaCandidato().equals(c)) { //implementar el equals en candidato pq estoy comparando 2 objetos
                resultado++;
            }
        }
        return resultado / (this.cantVotosEmitidos() * 100);
    }

    @Override
    public double pocentajeVotosEnBlanco() {
        double votosBlanco = 0;
        for (Votante voto : votos) {
            if (voto.getReferenciaCandidato() == null) {// si el boto esta en blanco sumo
                votosBlanco++;
            }
        }
        return votosBlanco / (cantVotosEmitidos() * 100);
    }

    @Override
    public double porcentajeVotosEmitidosEntre(LocalTime hora1, LocalTime hora2) {
        int votosEnRango = 0;
        for (Votante voto : votos) {
            LocalTime horaVoto = voto.getFechaVoto();
            // Verifica si el voto fue emitido dentro del rango de horas especificado
            if ((horaVoto.equals(hora1) || horaVoto.isAfter(hora1)) // Verifica si la hora del voto es igual o posterior a hora1
                    && horaVoto.isBefore(hora2)) {                      // Verifica si la hora del voto es anterior a hora2
                votosEnRango++;                                      // Si ambas condiciones se cumplen, incrementa el contador de votos dentro del rango
            }

        }
        return (double) votosEnRango / cantVotosEmitidos() * 100;
    }


    @Override
    public int cantVotosEmitidos() {
        return this.votos.size();
    }
}
