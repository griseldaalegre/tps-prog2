package tp3;

import java.util.ArrayList;

public class EJ4Agenda {
    private ArrayList<EJ4Contacto> listaContactos;

    public EJ4Agenda(ArrayList<EJ4Contacto> listaContactos) {
        this.listaContactos = new ArrayList<EJ4Contacto>();
    }

    public void addContacto(EJ4Contacto contacto) {
        this.listaContactos.add(contacto);
    }

/*El celular muestra información a modo de resumen donde se lista la totalidad de contactos,
los contactos repetidos y el promedio de edad de los contactos. Se considera un contacto repetido el que posee mismo apellido y nombre,
y número de teléfono*/

    public void totalidadContactos() {
        int promedioEdad = 0;
        int totalContactosrepetidos = 0;
        int totalContactos = 0;
        int edades = 0;

      /*  for (int i = 0; i < this.listaContactos.size(); i++) {
             edades += this.listaContactos.get(i).getEdad();
             if(this.listaContactos.get(i).)
        }*/
    }
}
