package tp11.kiko;


import tp11.kiko.condiciones.Condicion;

import java.util.ArrayList;

public class Bloque extends ComponenteKiko {
    private ArrayList<ComponenteKiko> comandos;
    private double GastoBateria;

    public Bloque() {
        this.comandos = new ArrayList<ComponenteKiko>();
    }

    public void addElemento(ComponenteKiko elemento) {
        this.comandos.add(elemento);
    }

    public void deleteElemento(ComponenteKiko elemento) {
        this.comandos.remove(elemento);
    }

    @Override
    public ArrayList<String> getInstrucciones() {
        ArrayList<String> comandos = new ArrayList<>();
        return comandos;
    }

    @Override
    public int getCantidadTarjetas() {
        int contador = 0;
        for (ComponenteKiko elemento : comandos) {
            contador += elemento.getCantidadTarjetas();//preguntar al hijo
        }
        return contador;
    }

    @Override
    public int getGastoBateria() {
        int suma = 0;
        for (ComponenteKiko t : comandos) {
            suma += t.getGastoBateria();
        }
        return suma * this.getTiempoEjecucion();
    }


    @Override
    public int getTiempoEjecucion() {
        int tiempo = 0;
        for (ComponenteKiko elemento : comandos) {
            tiempo += elemento.getTiempoEjecucion();//preguntar al hijo
        }
        return tiempo;
    }


    @Override
    public ComponenteKiko copiaRestringida(Condicion c) {
        Bloque copia = new Bloque();  // Crear una nueva instancia de Bloque
        for (ComponenteKiko elemento : comandos) {
            ComponenteKiko copiaHijo = elemento.copiaRestringida(c);  // Copiar cada elemento si cumple la condición
            if (copiaHijo != null) {
                copia.addElemento(copiaHijo);  // Agregar la copia del hijo si es válida
            }
        }

        // Si el bloque copia no contiene elementos, devuelve null
        if (((Bloque) copia).comandos.isEmpty()) {
            return null;
        }
        return copia;  // Devolver la copia creada
    }

}
