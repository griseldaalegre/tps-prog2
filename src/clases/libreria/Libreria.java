package clases.libreria;

import java.util.ArrayList;

public class Libreria {

    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;

    public Libreria() {
        super();
        clientes = new ArrayList<Cliente>();
        productos = new ArrayList<Producto>();
    }

    public void addCliente(Cliente cc) {
        if (!clientes.contains(cc)) {
            clientes.add(cc);
        }

    }

    public void addProducto(Producto pp) {
        if (!productos.contains(pp)) {
            productos.add(pp);
        }
    }


    public double getPrecio(Cliente cc, Producto pp) {
        return pp.getPrecio() - pp.getPrecio() * cc.getDescuento();
    }

    public boolean yaCompro(Cliente cc, Producto pp) {
        return cc.yaCompro(pp);
    }

    public boolean leGusta(Cliente cc, Producto pp) {
        return cc.leGusta(pp);
    }

    public ArrayList<Cliente> getClientes(Producto pp) {
        ArrayList<Cliente> aux = new ArrayList<Cliente>();
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cc = clientes.get(i);
            if (cc.leGusta(pp)) {
                aux.add(cc);
            }
        }
        return aux;
    }

}
