package parcialitos.empresaDeVentas.condiciones;

import parcialitos.empresaDeVentas.Articulo;

public class CondicionPorFabricante extends Condicion {
    private String fabricante;


    public CondicionPorFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public boolean cumple(Articulo a) {
        return a.getFabricante().equals(fabricante);
    }
}
