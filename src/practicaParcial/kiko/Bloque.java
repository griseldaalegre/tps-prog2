package practicaParcial.kiko;

import java.util.ArrayList;

import practicaParcial.kiko.condiciones.Condicion;

public class Bloque extends ElementoTarjeta {
    private static int extraFijo = 2;//tiempo
    protected ArrayList<ElementoTarjeta> elementos;

    public Bloque() {
        this.elementos = new ArrayList<>();
    }


    public static int getExtraFijo() {
        return extraFijo;
    }

    public static void setExtraFijo(int extraFijo) {
        Bloque.extraFijo = extraFijo;//RECORDAR CUANDO ES UN STATIC ACCEDER MEDIANTE LA CLASE
    }

    public void addElemento(ElementoTarjeta e) {
        this.elementos.add(e);
    }

    @Override
    public int getCantidadTarjetas() {
        int resultado = 0;
        for (ElementoTarjeta elemento : elementos) {
            resultado += elemento.getCantidadTarjetas();
        }
        return resultado;
    }


    //no pide que no haya repetidos
    @Override
    public ArrayList<String> getInstrucciones() {
        ArrayList<String> resultado = new ArrayList<>();
        for (ElementoTarjeta elemento : elementos)
            resultado.addAll(elemento.getInstrucciones());
        return resultado;
    }

    @Override
    public int getTiempoEjecucion() {
        int resultado = 0;
        for (ElementoTarjeta elemento : elementos) {
            resultado += elemento.getTiempoEjecucion();
        }
        return resultado;
    }

    @Override
    public double getGastoBateria() {
        double suma = 0;
        for (ElementoTarjeta elemento : elementos) {
            suma += elemento.getGastoBateria();
        }
        return suma * Bloque.getExtraFijo() + this.getTiempoEjecucion(); //revisar
    }

    @Override
    public ElementoTarjeta getCopiaRestringida(Condicion c) {
        Bloque copia = crearBloque();
        boolean agrego = false;
        for (ElementoTarjeta elemento : elementos) {
            ElementoTarjeta copiaHijo = elemento.getCopiaRestringida(c);//traigo al hijo
            //controlo si no es null
            if (copiaHijo != null) {
                copia.addElemento(copiaHijo);
                agrego = true;
            }
            if (agrego) {
                return copia;
            }

        }
        return null;
    }

    protected Bloque crearBloque() {
        return new Bloque();
    }
}