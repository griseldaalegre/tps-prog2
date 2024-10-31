package practicaParcial.parcial2210;

public class EquipoPeterPan extends Grupo {

    @Override
    public double getPromedioEdad() {
        double menor = 0;
        if (elementos.size() > 0) {
            menor = elementos.get(0).getPromedioEdad();
        }
        for (ComponenteVenta elemento : elementos) {
            double aux = elemento.getPromedioEdad();
            if (aux < menor) {
                menor = aux;
            }
        }
        return menor;
    }
}
