package practicaParcial.figuritas.condiciones;

import practicaParcial.figuritas.Figurita;

public class CondicionPorAlbum extends Condicion {

    private String albumBuscado;

    public CondicionPorAlbum(String albumBuscado) {
        this.albumBuscado = albumBuscado;
    }

    @Override
    public boolean cumple(Figurita f) {
        return f.getAlbum().equals(this.albumBuscado);
    }
}
