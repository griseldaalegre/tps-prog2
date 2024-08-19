package tp1;


public class E3PuntoGeometrico {
    //Atributos
    private double X;
    private double Y;

    //Constructor
    public E3PuntoGeometrico() {
        this.X = 0.0;
        this.Y = 0.0;
    }

    public E3PuntoGeometrico(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public void desplazarPuntoEnPLano(double puntoX, double puntoY) {
        this.X += puntoX;
        this.Y += puntoY;
    }

    public double calcularDistanciaEuclidiana(E3PuntoGeometrico otroPunto) {
        double deltaX = this.X - otroPunto.X;
        double deltaY = this.Y - otroPunto.Y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
