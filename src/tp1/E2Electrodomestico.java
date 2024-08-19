package tp1;

public class E2Electrodomestico {
    //Atributos
    private String nombre;
    private double precio;
    private String color;
    private int consumoEnergetico;
    private double peso;

    //Constructores
    public E2Electrodomestico(String nombre){
        this.nombre = nombre;
        this.precio = 100;
        this.color = "Gris plata";
        this.consumoEnergetico = 10;
        this.peso = 2;
    }

    public E2Electrodomestico(String nombre, double precio, String color, int consumoEnergetico, double peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public  boolean esBajoConsumo(){
        return getConsumoEnergetico() <  45;
    }
    public double calcularBalance(){
        return getPrecio() / getPeso();
    }

    public boolean esAltaGama() {
        return calcularBalance() > 3;
    }
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "Nombre='" + nombre + '\'' +
                ", Precio='" + peso + '\'' +
                ", Color=" + color +
                ", Consumo='" + consumoEnergetico + '\'' +
                ", Peso=" + peso +
                '}';
    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static class Main {
        public static void main(String[] args) {
            //E1
            E1Persona persona1 = new E1Persona(11111);
            System.out.println(persona1);
            System.out.println(persona1.esFechaNacimientoCoherenteConEdad());
            System.out.println(persona1.calcularEdad());
            System.out.println(persona1.estoyEnForma());
            System.out.println(persona1.cumpleAnosHoy());

            //------------------------------------------
            //E2
            E2Electrodomestico electro = new E2Electrodomestico("Heladera");
            System.out.println(electro);
            System.out.println(electro.calcularBalance());
            System.out.println(electro.esBajoConsumo());
            System.out.println(electro.esAltaGama());



        }
    }
}
