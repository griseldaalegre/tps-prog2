package clases.sistemaArchivosComparadores.condiciones;

import sistemaArchivos.Archivo;

public class CondTamanioMayor extends Condicion{
    private double tamLimite;

    public CondTamanioMayor(double tamLimite) {
        this.tamLimite = tamLimite;
    }

    @Override
    public boolean cumple(Archivo a) {
        return a.getTamanio() > tamLimite;
    }
}
