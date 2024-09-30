package tp6;

public class EJ1Vehiculo extends EJ1Item {
    private String patente;
    private double km;
    public boolean estaAlquilado;

    public EJ1Vehiculo(String nombre, String patente, double km) {
        super(nombre);
        this.patente = patente;
        this.km = km;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public boolean isEstaAlquilado() {
        return estaAlquilado;
    }

    public void setEstaAlquilado(boolean estaAlquilado) {
        this.estaAlquilado = estaAlquilado;
    }

    @Override
    public boolean cumple() {
        if (!isEstaAlquilado()) {
            this.setEstaAlquilado(true);
            return true;  // Marca el vehículo como alquilado y devuelve true
        }
        return false;  // Si ya está alquilado, devuelve false
    }


    public void devolverVehiculo(EJ1Vehiculo vehiculo) {
        vehiculo.setEstaAlquilado(false);
    }


}
