package tp7.ejercicio2;

import java.util.ArrayList;

public class Historiador {
    protected String nombre;
    protected ArrayList<Documento> documentos;

    public Historiador(String nombre) {
        this.nombre = nombre;
        this.documentos = new ArrayList<Documento>();
    }

    public void addDocumento(Documento d) {
        if (!this.documentos.contains(d)) {
            this.documentos.add(d);
        }
    }

    public void deleteDocumento(Documento d) {
        this.documentos.remove(d);
    }


    public ArrayList<Documento> buscar(Condicion c) {
        ArrayList<Documento> resultado = new ArrayList<Documento>();
        for (int i = 0; i < documentos.size(); i++) {
            if (c.cumple(documentos.get(i)))
                resultado.add(documentos.get(i));
        }
        return resultado;
    }
}
