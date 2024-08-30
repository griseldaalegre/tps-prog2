package tp4;

import java.util.ArrayList;

public class EJ1Alarma {
    private E1Timbre timbre;
    private ArrayList<EJ2Sensor> sensores;

    //EJERCICIO 1
    // private boolean vidrioRoto;
    // private boolean puertaVentanaAbierta;
    //private boolean movimientoDetectado
   /* public EJ1Alarma() {
        this.vidrioRoto = false;
        this.puertaVentanaAbierta = false;
        this.movimientoDetectado = false;
        this.timbre = new E1Timbre();
    }

    public void setVidrioRoto(boolean estado) {
        this.vidrioRoto = estado;
    }

    public void setPuertaVentanaAbierta(boolean estado) {
        this.puertaVentanaAbierta = estado;
    }

    public void setMovimientoDetectado(boolean estado) {
        this.movimientoDetectado = estado;
    }

    public boolean comprobar() {
        if (vidrioRoto || puertaVentanaAbierta || movimientoDetectado) {
            timbre.hacerSonar();
            return true;
        }
        return false;
    }*/

    public EJ1Alarma() {
        this.sensores = new ArrayList<EJ2Sensor>();
        this.timbre = new E1Timbre();
    }

    public void addSensor(EJ2Sensor sensor) {
        this.sensores.add(sensor);
    }

    public ArrayList<EJ2Sensor> getSensores() {
        return sensores;
    }

    public String comprobar() {
        String zonasEnConflicto = ""; // Acumulador de zonas en conflicto

        for (int i = 0; i < this.sensores.size(); i++) {
            if (this.sensores.get(i).isZonaActivada()) {
                zonasEnConflicto += this.timbre.hacerSonar(this.sensores.get(i))  + "\n";
            }
        }

        return zonasEnConflicto; // Retorna las zonas en conflicto como un String
    }
}
