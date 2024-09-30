package tp7.ejercicio2;

public class CondicionPorCantidadPalabras extends Condicion {
    private int cantidadMinima;

    public CondicionPorCantidadPalabras(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    @Override
    public boolean cumple(Documento d) {
        // 1. Obtiene el contenido del documento como una cadena de texto
        // 2. El método split() divide el contenido en un array de palabras utilizando "\\s+" como delimitador.
        //    "\\s+" es una expresión regular que representa uno o más espacios en blanco (incluye espacios, tabulaciones, saltos de línea, etc.).
        //    Esto permite dividir el contenido en palabras ignorando los espacios entre ellas.
        String[] palabras = d.getContenido().split("\\s+");

        // 3. Verifica si la cantidad de palabras (es decir, la longitud del array de palabras) es mayor o igual a la cantidad mínima
        return palabras.length >= cantidadMinima;
    }
}
