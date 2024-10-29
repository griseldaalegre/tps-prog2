package practicaParcial.parcial2210;

import java.time.LocalDate;

public class Venta {
    private LocalDate fecha;
    private String codigoProducto;
    private int dniComprador;
    private double monto;
    private int cantVendidos;

    public Venta(LocalDate fecha, String codigoProducto, int dniComprador, double monto, int cantVendidos) {
        this.fecha = fecha;
        this.codigoProducto = codigoProducto;
        this.dniComprador = dniComprador;
        this.monto = monto;
        this.cantVendidos = cantVendidos;
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

    public int getCantidadProductosVendidos() {
        return cantVendidos;
    }

    public void setCantVendidos(int cantVendidos) {
        this.cantVendidos = cantVendidos;
    }
}
