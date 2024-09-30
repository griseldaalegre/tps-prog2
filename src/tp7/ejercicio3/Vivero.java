package tp7.ejercicio3;

import java.util.ArrayList;

public class Vivero {
    private String nombre;
    private ArrayList<Planta> plantas;

    public Vivero(String nombre) {
        this.nombre = nombre;
        this.plantas = new ArrayList<Planta>();
    }

    public void addPlanta(Planta p) {
        if (!this.plantas.contains(p)) {
            this.addPlanta(p);
        }
    }

    public void deletePlanta(Planta p) {
        this.plantas.remove(p);
    }

    public ArrayList<Planta> buscar(Condicion c) {
        ArrayList<Planta> resultado = new ArrayList<Planta>();
        for (int i = 0; i < this.plantas.size(); i++) {
            if (c.cumple(plantas.get(i))) { //si mi condicion cumple - le paso un objeto planta
                resultado.add(plantas.get(i));
            }
        }
        return resultado;
    }
}
