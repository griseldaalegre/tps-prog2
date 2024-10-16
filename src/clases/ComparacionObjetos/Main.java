package clases.ComparacionObjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("hola");
        palabras.add("tres");
        palabras.add("arroyos");
        palabras.add("hace");
        palabras.add("frio");
        palabras.add("de");
        System.out.println("Palabras en el orden que las agregue");
        System.out.println(palabras);
        Collections.sort(palabras);
        System.out.println("Palabras ordenadas alfabeticamente");
        System.out.println(palabras);
        Collections.sort(palabras, Collections.reverseOrder());
        System.out.println("Palabras ordenadas alfabeticamente descendente");
        System.out.println(palabras);

        Collections.sort(palabras, new ComparadorStringLongitud());
        System.out.println("Palabras ordenadas por longitud (menor a mayor)");
        System.out.println(palabras);

        Collections.sort(palabras, new ComparadorStringLongitud().reversed());
        System.out.println("Palabras ordenadas por longitud (mayor a menor)");
        System.out.println(palabras);

        Collections.sort(palabras, new ComparadorLongyAlf());
        System.out.println("Palabras ordenadas por longitud (mayor a menor) y alfabeticamente si tienen la misma longitud");
        System.out.println(palabras);
    }
}
