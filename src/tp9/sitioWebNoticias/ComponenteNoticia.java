package tp9.sitioWebNoticias;

import tp9.sitioWebNoticias.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ComponenteNoticia {

    public abstract ArrayList<Noticia> noticiasCon(Condicion c);
    public abstract int cantidadNoticias();

}
