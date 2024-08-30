package tp4;

public class EJ1Alarma {
    /*1 - Alarma
Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
sonora.
Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
encienda una luz cuando alguno de los indicadores está activado.
Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
método encender().*/


    private boolean vidrioRoto;
    private boolean puertaVentanaAbierta;
    private boolean movimientoDetectado;
    private E1Timbre timbre;

    public EJ1Alarma() {
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

    public void comprobar() {
        if (vidrioRoto || puertaVentanaAbierta || movimientoDetectado) {
            timbre.hacerSonar();
        }
    }


}
