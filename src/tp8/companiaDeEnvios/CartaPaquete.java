package tp8.companiaDeEnvios;

public class CartaPaquete extends Envio {
    private Persona destinatario;
    private Persona remitente;
    private String seRetiraEn; // "sucursal" o "domicilio"
    private double peso;

    public CartaPaquete(Persona destinatario, Persona remitente, String seRetiraEn, double peso) {
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.seRetiraEn = seRetiraEn;
        this.peso = peso;
    }

    @Override
    public double calcularPeso() {
        return peso;
    }

    @Override
    public Persona getDestinatario() {
        return destinatario;
    }

    @Override
    public Persona getRemitente() {
        return remitente;
    }

    @Override
    public String toString() {
        return "CartaPaquete{" +
                "destinatario=" + destinatario +
                ", remitente=" + remitente +
                ", seRetiraEn='" + seRetiraEn + '\'' +
                ", peso=" + peso +
                ", tracking='" + tracking + '\'' +
                '}';
    }
}
