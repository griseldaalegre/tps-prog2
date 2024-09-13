package tp5;

public final class EJ2Conversor {
    // Constantes para las conversiones
    public static final double PULGADA_A_CM = 2.54;
    public static final double LIBRA_A_KILO = 0.453592;
    public static final double GALON_A_LITRO = 3.78541;

    // Constructor privado para evitar la instanciación
    private EJ2Conversor() {
        // No se puede instanciar esta clase
    }

    // Métodos estáticos para conversión sin necesidad de instanciar la clase

    // Método para convertir centímetros a pulgadas
    public static double cmAPulgadas(double cm) {
        return cm / PULGADA_A_CM;
    }

    // Método para convertir pulgadas a centímetros
    public static double pulgadasACm(double pulgadas) {
        return pulgadas * PULGADA_A_CM;
    }

    // Método para convertir libras a kilogramos
    public static double librasAKilos(double libras) {
        return libras * LIBRA_A_KILO;
    }

    // Método para convertir kilogramos a libras
    public static double kilosALibras(double kilos) {
        return kilos / LIBRA_A_KILO;
    }

    // Método para convertir galones a litros
    public static double galonesALitros(double galones) {
        return galones * GALON_A_LITRO;
    }

    // Método para convertir litros a galones
    public static double litrosAGalones(double litros) {
        return litros / GALON_A_LITRO;
    }
}
