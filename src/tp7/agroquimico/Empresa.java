package tp7.agroquimico;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Producto> productos;

    public Empresa() {
        this.productos = new ArrayList<Producto>();
    }

    public void removeProducto(Producto p) {
        productos.remove(p);
    }

    public void addProducto(Producto p) {
        if (!this.productos.contains(p)) {
            this.productos.add(p);
        }
    }

    public ArrayList<Producto> buscarProductos(Condicion c) {
        ArrayList<Producto> resultado = new ArrayList<>();
        for (int i = 0; i < productos.size(); i++) {
            Producto actual = productos.get(i);
            if (c.cumple(actual))
                resultado.add(productos.get(i));
        }
        return resultado;
    }


}
