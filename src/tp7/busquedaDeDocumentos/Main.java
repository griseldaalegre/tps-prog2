package tp7.busquedaDeDocumentos;

public class Main {
    public static void main(String[] args) {
        // Crear documentos de prueba
        Documento doc1 = new Documento("Historia de Java", "Java es un lenguaje de programación ampliamente utilizado.");
        doc1.addAutor("John Doe");
        doc1.addPalabraClave("Programación");

        Documento doc2 = new Documento("Guía de Python", "Python es versátil y fácil de aprender.");
        doc2.addAutor("Jane Smith");
        doc2.addPalabraClave("Lenguaje");

        Documento doc3 = new Documento("Documentación de Angular", "Angular es un framework para desarrollo de aplicaciones web.");
        doc3.addAutor("John Doe");
        doc3.addPalabraClave("Desarrollo");

        // Crear las condiciones
        Condicion condicionTituloExacto = new CondicionPorTitulo("Guía de Python");
        Condicion condicionPalabraEnTitulo = new CondicionPalabraEnTitulo("Angular");
        Condicion condicionPorAutor = new CondicionPorAutor("John Doe");
        Condicion condicionPalabraClave = new CondicionPorPalabraClave("Desarrollo");
        Condicion condicionPorContenido = new CondicionPorContenido("lenguaje de programación");
        CondicionPorCantidadPalabras condicionMinimoPalabras = new CondicionPorCantidadPalabras(6);

        // Crear un historiador para organizar documentos
        Historiador historiador = new Historiador("Historiador de Prueba");
        historiador.addDocumento(doc1);
        historiador.addDocumento(doc2);
        historiador.addDocumento(doc3);

        // Prueba de las condiciones
        System.out.println("Documentos con título exacto 'Guía de Python':");
        System.out.println(historiador.buscar(condicionTituloExacto));

        System.out.println("\nDocumentos que contienen 'Angular' en el título:");
        System.out.println(historiador.buscar(condicionPalabraEnTitulo));

        System.out.println("\nDocumentos escritos por 'John Doe':");
        System.out.println(historiador.buscar(condicionPorAutor));

        System.out.println("\nDocumentos que tienen la palabra clave 'Desarrollo':");
        System.out.println(historiador.buscar(condicionPalabraClave));

        System.out.println("\nDocumentos cuyo contenido contiene 'lenguaje de programación':");
        System.out.println(historiador.buscar(condicionPorContenido));

        System.out.println("\nDocumentos cuyo contenido tiene al menos 6 palabras:");
        System.out.println(historiador.buscar(condicionMinimoPalabras));
    }

}
