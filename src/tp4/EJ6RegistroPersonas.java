package tp4;

import java.util.ArrayList;

public class EJ6RegistroPersonas {
    private ArrayList<EJ6Persona> personas;

    public EJ6RegistroPersonas() {
        this.personas = new ArrayList<>();
    }

    public void addPersona(EJ6Persona persona) {
        personas.add(persona);
    }

    public String exportarListado() {
        StringBuilder listado = new StringBuilder();
        for (EJ6Persona persona : personas) { //Usar el for comun
            listado.append(persona.toString()).append("\n-------------------------\n");
        }
        return listado.toString();
    }
}
