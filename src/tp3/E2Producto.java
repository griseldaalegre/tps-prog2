package tp3;

public class E2Producto {
    private String tipoProducto;
    private double peso;
    private double costo;
    private String color;
    private String tipoMadera;
    private double porcentajeDeGanancia;

    public E2Producto(String tipoProducto, double peso, double costo, String color, String tipoMadera, double porcentajeDeGanancia) {
        this.tipoProducto = tipoProducto;
        this.peso = peso;
        this.costo = costo;
        this.color = color;
        this.tipoMadera = tipoMadera;
        this.porcentajeDeGanancia = porcentajeDeGanancia;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public double getPorcentajeDeGanancia() {
        return porcentajeDeGanancia;
    }

    public void setPorcentajeDeGanancia(double porcentajeDeGanancia) {
        this.porcentajeDeGanancia = porcentajeDeGanancia;
    }
}

