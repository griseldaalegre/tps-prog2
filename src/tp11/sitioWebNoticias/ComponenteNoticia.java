package tp11.sitioWebNoticias;

import clases.sistemaArchivosComparator.Directorio;
import tp11.sitioWebNoticias.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ComponenteNoticia {

    public abstract ArrayList<Noticia> noticiasCon(Condicion c);

    public abstract int cantidadNoticias();

    // public abstract ArrayList<ComponenteNoticia> copiaRestringida(Condicion c);

    public abstract ComponenteNoticia crearContenedor();

    public abstract ComponenteNoticia getCopia();

    protected void addContenido(ComponenteNoticia copia) {
    }
}

