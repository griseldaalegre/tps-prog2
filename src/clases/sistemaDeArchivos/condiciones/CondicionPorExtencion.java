package clases.sistemaDeArchivos.condiciones;

import clases.sistemaDeArchivos.Archivo;

public class CondicionPorExtencion extends Condicion {
    private String extensionBuscada;

    public CondicionPorExtencion(String extensionBuscada) {
        this.extensionBuscada = extensionBuscada;
    }

    public boolean cumple(Archivo a) {
        return this.extensionBuscada.equals(a.getExtension());
    }
}
