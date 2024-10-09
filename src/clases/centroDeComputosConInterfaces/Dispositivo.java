package clases.centroDeComputosConInterfaces;

public class Dispositivo {
    private int inventario;
    private String sala;

    public Dispositivo(int inventario, String sala) {
        this.inventario = inventario;
        this.sala = sala;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
