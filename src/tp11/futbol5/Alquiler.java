package tp11.futbol5;

import java.time.LocalDate;

//simple
public class Alquiler {
    private int idCancha;
    private LocalDate fechaAlquiler;
    private Double valor;

    public Alquiler(int idCancha) {
        this.idCancha = idCancha;
        this.fechaAlquiler = LocalDate.now();
        this.valor = null; //puede no pagar
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public boolean pagoAlquiler() {
        return this.valor != null;
    }

    public void pagarAlquiler(double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
