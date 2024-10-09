package parcialitos.empresaDeVentas;

import parcialitos.empresaDeVentas.condiciones.Condicion;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    protected ArrayList<Articulo> articulos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.articulos = new ArrayList<Articulo>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addArticulo(Articulo a) {
        this.articulos.add(a);
    }

    public void deleteArticulo(Articulo a) {
        this.articulos.remove(a);
    }

    public ArrayList<Articulo> buscar(Condicion c) {
        //devolver siempre auxiliar
        ArrayList<Articulo> resultados = new ArrayList<Articulo>();
        for (int i = 0; i < this.articulos.size(); i++) {
            Articulo index = this.articulos.get(i);
            if (c.cumple(index)) { //corroboro que la condicion cumpla
                resultados.add(index); //si lo hace la agrego
            }
        }
        return resultados;
    }
}
