package practicaParcial.parciales2024;

import java.time.LocalDate;

public class Venta {
    private LocalDate fecha;
    private String codigoProducto;
    private int dniComprador;
    private double monto;
    private int cantidad;

    public Venta(LocalDate fecha, String codigoProducto, int dniComprador, double monto, int cantidad) {
        this.fecha = fecha;
        this.codigoProducto = codigoProducto;
        this.dniComprador = dniComprador;
        this.monto = monto;
        this.cantidad = cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getDniComprador() {
        return dniComprador;
    }

    public void setDniComprador(int dniComprador) {
        this.dniComprador = dniComprador;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidads(int cantidad) {
        this.cantidad = cantidad;
    }


    //la ganacia la calcula la venta
    public double getGanancias() {
        return cantidad*monto;
    }
}
