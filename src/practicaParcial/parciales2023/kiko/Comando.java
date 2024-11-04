package practicaParcial.parciales2023.recuperatorio2023.kiko;

import practicaParcial.parciales2023.recuperatorio2023.kiko.condiciones.Condicion;

import java.util.ArrayList;

public class Comando extends ElementoTarjeta {
    private String instruccion;
    private double gastoBateria;
    private int tiempoEjecucion;//tiempo

    public Comando(String instruccion, double gastoBateria, int tiempoEjecucion) {
        this.instruccion = instruccion;
        this.gastoBateria = gastoBateria;
        this.tiempoEjecucion = tiempoEjecucion;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }


    public void setGastoBateria(double gastoBateria) {
        this.gastoBateria = gastoBateria;
    }

    public void setTiempoEjecucion(int tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }

    @Override
    public int getCantidadTarjetas() {
        return 1;
    }

    @Override
    public ArrayList<String> getInstrucciones() {
        ArrayList<String> resultado = new ArrayList<>();
        resultado.add(this.getInstruccion());
        return resultado;
    }

    @Override
    public int getTiempoEjecucion() {
        return 0;
    }


    @Override
    public double getGastoBateria() {
        return gastoBateria;
    }

    public ElementoTarjeta getCopiaRestringida(Condicion c) {
        if (c.cumple(this)) {
            Comando copia = crearComando();//si cumplo me creo
            return copia;
        }
        return null;//sino retorno null
    }

    private Comando crearComando() {
        return new Comando(this.getInstruccion(), this.getGastoBateria(), this.tiempoEjecucion);
    }

}
