package parcialitos.empresaDeVentas.condiciones;

import parcialitos.empresaDeVentas.Articulo;

public class CondicionPorMaterial extends Condicion {
    private String material;

    public CondicionPorMaterial(String material) {
        this.material = material;
    }

    public boolean cumple(Articulo a) {
        return a.tieneMaterial(material);
    }
}
