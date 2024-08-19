package tp2;

import java.time.LocalDate;

public class E5Turno {
    private LocalDate fecha;
    private E5Peluquero peluquero;
    private E4Cliente cliente;
    private double valor;

    public E5Turno(LocalDate fecha, E5Peluquero peluquero, E4Cliente cliente, double valor) {
        this.fecha = fecha;
        this.peluquero = peluquero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public E5Turno(LocalDate fecha, E5Peluquero peluquero) {
        this.fecha = fecha;
        this.peluquero = peluquero;
    }
}
