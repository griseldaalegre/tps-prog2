package tp2;

public class E4Cancha {
    private String tipo;
    private double valor;
    private boolean disponible;



    public E4Cancha(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.disponible = true;

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
