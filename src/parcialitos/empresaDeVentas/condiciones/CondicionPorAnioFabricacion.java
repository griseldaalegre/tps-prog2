package parcialitos.empresaDeVentas.condiciones;

import parcialitos.empresaDeVentas.Articulo;

import java.time.LocalDate;

public class CondicionPorAnioFabricacion {
    private LocalDate anioFabricacion;

    public CondicionPorAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public boolean cumple(Articulo a) {
        return a.getAnioFabricion().isBefore(anioFabricacion);
    }

}
