package practicaParcial.parciales2023.recuperatorio2023.kiko;

import java.util.ArrayList;

public class BloqueIterativo extends Bloque {
    private int iterador;

    public BloqueIterativo(int iterador) {
        this.iterador = iterador;
    }

    public int getIterador() {
        return iterador;
    }

    public void setIterador(int iterador) {
        this.iterador = iterador;
    }

    @Override
    public double getGastoBateria() {
        return super.getGastoBateria() * iterador;
    }

    @Override
    public int getTiempoEjecucion() {
        return super.getTiempoEjecucion() * iterador;
    }

    @Override
    public ArrayList<String> getInstrucciones() {
        ArrayList<String> comandos = new ArrayList<>();
        for (int i = 0; i < iterador; i++) {
            comandos.addAll(super.getInstrucciones());

        }
        return comandos;
    }

    @Override
    public Bloque crearBloque() {
        return new BloqueIterativo(this.iterador);
    }
}
