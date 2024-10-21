package tp9.sitioWebNoticias;

import tp9.sitioWebNoticias.condiciones.Condicion;

import java.util.ArrayList;

//Compuesto
public class Contenido extends ComponenteNoticia {
    private ArrayList<ComponenteNoticia> contenidos; //puede ser categorias secciones o subsecciones

    public Contenido() {
        this.contenidos = new ArrayList<ComponenteNoticia>();
    }

    public void addContenido(ComponenteNoticia contenido) {
        this.contenidos.add(contenido);
    }

    public void deleteContenido(ComponenteNoticia contenido) {
        this.contenidos.remove(contenido);
    }

    public int cantidadNoticias() {
        int contador = 0;
        for (ComponenteNoticia contenido : contenidos) {
            contador += contenido.cantidadNoticias();
        }
        return contador;
    }

    public ArrayList<Noticia> noticiasCon(Condicion c) {
        ArrayList<Noticia> resultado = new ArrayList<>();
        for (ComponenteNoticia noticia : contenidos) {
            resultado.addAll(noticia.noticiasCon(c));//No HACER UN IF PQ NO RECORRE LA ESTRUCRURA COMPUSTA
        }
        return resultado;
    }
}
