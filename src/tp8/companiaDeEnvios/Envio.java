package tp8.companiaDeEnvios;


public abstract class Envio {
    protected String tracking;

    public abstract double calcularPeso();
    public abstract Persona getDestinatario();
    public abstract Persona getRemitente();

    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
        actualizarTrackingEnCombo(tracking);  // Se puede sobreescribir para combos
    }

    protected void actualizarTrackingEnCombo(String nuevoTracking) {
        // Por defecto no hace nada, solo los combos deben implementar esto
    }
}
