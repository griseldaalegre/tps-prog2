package tp3;

public class E3Personaje {
    private String nombreReal;
    private String nombreSuperHeroe;
    private boolean visionNocturna;
    private int velocidad;
    private int fuerza;
    private double peso;
    private double altura;
    private int edad;

    public E3Personaje(String nombreReal, int edad, double altura, double peso,
                       int fuerza, int velocidad, boolean visionNocturna, String nombreSuperHeroe) {
        this.nombreReal = nombreReal;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.visionNocturna = visionNocturna;
        this.nombreSuperHeroe = nombreSuperHeroe;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getNombreSuperHeroe() {
        return nombreSuperHeroe;
    }

    public void setNombreSuperHeroe(String nombreSuperHeroe) {
        this.nombreSuperHeroe = nombreSuperHeroe;
    }

    public boolean isVisionNocturna() {
        return visionNocturna;
    }

    public void setVisionNocturna(boolean visionNocturna) {
        this.visionNocturna = visionNocturna;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
