package tp9.aseguradora;

import tp9.aseguradora.condiciones.Condicion;

import java.util.ArrayList;

public class Seguro extends ComponenteSeguro {


    public Seguro(int nroPoliza, String descripcion, double montoAsegurado, String dniAsegurado) {
        super(nroPoliza, descripcion, montoAsegurado, dniAsegurado);
    }


    public double calcularPoliza() {
        return getMontoAsegurado();
    }

    public ArrayList<ComponenteSeguro> listarPor(Condicion c) {
        ArrayList<ComponenteSeguro> resultado = new ArrayList<>();
        if (c.cumple(this)) {//si yo cumplo
            resultado.add(this);// me agrego
        }
        return resultado;
    }

}
