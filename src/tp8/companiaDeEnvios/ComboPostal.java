package tp8.companiaDeEnvios;

import java.util.ArrayList;
import java.util.List;

public class ComboPostal extends Envio {
    private List<Envio> envios = new ArrayList<>();
    private Envio primerEnvio; // Se guarda el primer envío agregado

    public void addEnvio(Envio envio) {
        if (envios.isEmpty()) {
            primerEnvio = envio; // Guarda el primer envío agregado
        }
        envios.add(envio);
        envio.setTracking(this.tracking);  // Se asigna el tracking del combo al envío
    }

    @Override
    public double calcularPeso() {
        return envios.stream().mapToDouble(Envio::calcularPeso).sum();
    }

    @Override
    public Persona getDestinatario() {
        return primerEnvio.getDestinatario(); // Usa el destinatario del primer envío
    }

    @Override
    public Persona getRemitente() {
        return primerEnvio.getRemitente(); // Usa el remitente del primer envío
    }

    @Override
    protected void actualizarTrackingEnCombo(String nuevoTracking) {
        for (Envio envio : envios) {
            envio.setTracking(nuevoTracking);
        }
    }

    @Override
    public String toString() {
        return "ComboPostal{" +
                "tracking='" + tracking + '\'' +
                ", envios=" + envios +
                '}';
    }
}
