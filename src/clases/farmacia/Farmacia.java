package clases.farmacia;

import java.util.ArrayList;

public class Farmacia {
    private ArrayList<Medicamento> medicamentos;

    //add - remove - tieneMedicamento - buscarMedicamento(Cond c)


    public Farmacia() {
        this.medicamentos = new ArrayList<Medicamento>();
    }

    public void addMedicamento(Medicamento m) {
        if (!medicamentos.contains(m)) {
            this.medicamentos.add(m);
        }
    }

    public void removeMedicamento(Medicamento m) {
        medicamentos.remove(m);
    }

    public ArrayList<Medicamento> buscarMedicamentos(Condicion c) {
        //devolver siempre auxiliar
        ArrayList<Medicamento> resultados = new ArrayList<Medicamento>();
        for (int i = 0; i < this.medicamentos.size(); i++) {
            Medicamento index = this.medicamentos.get(i);
            if (c.cumple(index)) { //corroboro que la condicion cumpla
                resultados.add(index); //si lo hace la agrego
            }
        }
        return resultados;
    }
}
