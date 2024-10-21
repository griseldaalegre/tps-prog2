package tp9.aseguradora;

import tp9.aseguradora.condiciones.Condicion;

import java.util.ArrayList;

public class SeguroIntegrador extends ComponenteSeguro {
    private String dniAsegurado;
    private ArrayList<ComponenteSeguro> seguros;

    public SeguroIntegrador(int nroPoliza, String descripcion, double montoAsegurado, String dniAsegurado) {
        super(nroPoliza, descripcion, montoAsegurado, dniAsegurado);
        this.seguros = new ArrayList<>();
    }

    public String getDniAsegurado() {
        return dniAsegurado;
    }

    public void setDniAsegurado(String dniAsegurado) {
        this.dniAsegurado = dniAsegurado;
    }

    public void addSeguro(ComponenteSeguro seguro) {
        this.seguros.add(seguro);
    }

    public void removeSeguro(ComponenteSeguro seguro) {
        this.seguros.remove(seguro);
    }

    public double calcularPoliza() {
        double resultado = 0;
        for (ComponenteSeguro seguro : seguros) {
            resultado += seguro.calcularPoliza();
        }
        return resultado;
    }

    public ArrayList<ComponenteSeguro> listarPor(Condicion c) {
        ArrayList<ComponenteSeguro> resultado = new ArrayList<>();
        for (ComponenteSeguro seguro : seguros) {
            resultado.addAll(seguro.listarPor(c));//listo por condicion e implemento el listar del elemento hijo
        }
        return resultado;
    }
}
