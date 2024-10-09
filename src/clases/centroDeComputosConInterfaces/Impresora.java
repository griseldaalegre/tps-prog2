package clases.centroDeComputosConInterfaces;

public class Impresora extends Dispositivo {
    private boolean color;

    public Impresora(int inventario, String sala, boolean color) {
        super(inventario, sala);
        this.color = color;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
}
