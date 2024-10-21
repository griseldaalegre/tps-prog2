package tp9.sitioWebNoticias.condiciones;

import tp9.sitioWebNoticias.Noticia;

public class CondicionPorLargoTexto extends Condicion {

    private int largoMinimo;

    public CondicionPorLargoTexto(int largoMinimo) {
        this.largoMinimo = largoMinimo;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTexto().length() > largoMinimo;
    }
}