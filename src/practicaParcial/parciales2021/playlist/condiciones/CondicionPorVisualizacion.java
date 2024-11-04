package practicaParcial.parciales2021.playlist.condiciones;

import practicaParcial.parciales2021.playlist.Video;

public class CondicionPorVisualizacion extends Condicion {
    private int vistas;

    public CondicionPorVisualizacion(int vistas) {
        this.vistas = vistas;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getVisualizaciones() > this.vistas;
    }
}
