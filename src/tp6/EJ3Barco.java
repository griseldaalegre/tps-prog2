package tp6;

public class EJ3Barco implements EJ3ElementoCola {
    private double capacidad;
    private String  cereal;

    public EJ3Barco(double capacidad) {
        this.capacidad = capacidad;
        this.cereal = null;
    }

    public double getCapacidad() {
        return capacidad;
    }


    public void cargarCereal(EJ3Camion cereal) {
        this.cereal = cereal.getCereal();
    }

    // comparo la capacidad de un barco con otro
    @Override
    public boolean esMayor(EJ3ElementoCola otro) {
        return this.getCapacidad() > ((EJ3Barco) otro).getCapacidad();
    }

    @Override
    public String toString() {
        return "EJ3Barco{" +
                "capacidad=" + capacidad +
                ", cereal=" + cereal +
                '}';
    }
}
