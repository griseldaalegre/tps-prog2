package tp2;

import java.time.LocalDate;

public class E4Turno {
    private E4Cliente cliente;
    private E4Cancha cancha;
    private LocalDate fecha;

    public E4Turno(E4Cliente cliente, E4Cancha cancha, LocalDate fecha) {
        this.cliente = cliente;
        this.cancha = cancha;
        this.fecha = fecha;
    }

    public E4Cliente getCliente() {
        return cliente;
    }

    public void setCliente(E4Cliente cliente) {
        this.cliente = cliente;
    }

    public E4Cancha getCancha() {
        return cancha;
    }

    public void setCancha(E4Cancha cancha) {
        this.cancha = cancha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
