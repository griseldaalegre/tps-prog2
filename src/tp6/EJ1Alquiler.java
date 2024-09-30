package tp6;

import java.time.LocalDate;
import java.util.ArrayList;

public class EJ1Alquiler {
    private EJ1Cliente cliente;
    private EJ1Item item;
    private LocalDate fechaLimite;

    public EJ1Alquiler(EJ1Cliente cliente, EJ1Item item, LocalDate fechaLimite) {
        this.cliente = cliente;
        this.item = item;
        this.fechaLimite = fechaLimite;
    }

    public EJ1Cliente getCliente() {
        return cliente;
    }

    public void setCliente(EJ1Cliente cliente) {
        this.cliente = cliente;
    }

    public EJ1Item getItem() {
        return item;
    }

    public void setItem(EJ1Item item) {
        this.item = item;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public boolean cumple() {
        return this.item.cumple();
    }

    public boolean alquilerVencido() {
        return this.getFechaLimite().isBefore(LocalDate.now());
    }

    @Override
    public String toString() {
        return "Contacto [\n" +
                "  Fecha limite=" + this.getFechaLimite() + ",\n" +
                "  Cliente =" + this.getCliente() + ",\n" +
                "  item =" + this.item + ",\n" +
                "]";
    }

}
