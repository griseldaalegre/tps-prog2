package tp9.sistemaElectoral;

public class Candidato {
    private String nombre;
    private String partido;
    private String agrupacion;

    public Candidato(String nombre, String partido, String agrupacion) {
        this.nombre = nombre;
        this.partido = partido;
        this.agrupacion = agrupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPartido() {
        return partido;
    }

    public String getAgrupacion() {
        return agrupacion;
    }
}
