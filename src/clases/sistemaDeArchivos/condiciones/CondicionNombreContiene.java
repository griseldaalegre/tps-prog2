package clases.sistemaDeArchivos.condiciones;

import clases.sistemaDeArchivos.Archivo;

public class CondicionNombreContiene extends Condicion{
    private String subCadena;

    public CondicionNombreContiene(String subCadena) {
        this.subCadena = subCadena;
    }

    public boolean cumple(Archivo a) {
        return a.getNombre().contains(subCadena);
    }
}
