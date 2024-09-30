package tp6;

import java.util.ArrayList;

public class EJ1SistemaAlquiler {
    private ArrayList<EJ1Alquiler> alquileres;

    public EJ1SistemaAlquiler() {
        this.alquileres = new ArrayList<EJ1Alquiler>();
    }


    public boolean addAlquiler(EJ1Alquiler a) {
        if (a.cumple()) {
            this.alquileres.add(a);
            return true;
        }
        return false;
    }

    public ArrayList<EJ1Cliente> alquileresVencidos() {
        ArrayList<EJ1Cliente> clientesVencidos = new ArrayList<>();
        int i = 0;
        while (i < this.alquileres.size()) {
            if (this.alquileres.get(i).alquilerVencido()) {
                clientesVencidos.add(this.alquileres.get(i).getCliente());
            }
            i++;
        }
        return clientesVencidos;
    }
}
