package tp1;

public class E3Rectangulo {
    private E3PuntoGeometrico verticeSuperiorIzquierdo;
    private double base;
    private double altura;

    // Constructor con cuatro puntos
    public E3Rectangulo(E3PuntoGeometrico verticeSuperiorIzquierdo, E3PuntoGeometrico verticeInferiorDerecho) {
        this.verticeSuperiorIzquierdo = verticeSuperiorIzquierdo;
        this.base = verticeInferiorDerecho.getX() - verticeSuperiorIzquierdo.getX();
        this.altura = verticeSuperiorIzquierdo.getY() - verticeInferiorDerecho.getY();
    }

    // Constructor con un vértice y las longitudes de los lados
    public E3Rectangulo(E3PuntoGeometrico verticeSuperiorIzquierdo, double base, double altura) {
        this.verticeSuperiorIzquierdo = verticeSuperiorIzquierdo;
        this.base = base;
        this.altura = altura;
    }

    public void desplazarRectangulo(double desplazamientoX, double desplazamientoY) {
        verticeSuperiorIzquierdo.desplazarPuntoEnPLano(desplazamientoX, desplazamientoY);
    }

    public double calcularArea() {
        return base * altura;
    }

    public int compararArea(E3Rectangulo otroRectangulo) {
        double areaActual = this.calcularArea();
        double areaOtro = otroRectangulo.calcularArea();
        if (areaActual > areaOtro) {
            return 1; // es mayor
        } else if (areaActual < areaOtro) {
            return -1; // es menor
        } else {
            return 0; // tienen el mismo área
        }
    }

    public boolean esCuadrado() {
        return base == altura;
    }

    public String determinarOrientacion() {
        if (base > altura) {
            return "Acostado";
        } else if (base < altura) {
            return "Parado";
        } else {
            return "Es un cuadrado";
        }
    }

    public double getLargoLadoSuperior() {
        return base;
    }
}

