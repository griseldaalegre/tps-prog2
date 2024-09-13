package tp1;
import java.time.LocalDate;
import java.time.Period;

public class E1Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;


    //Constructor con datos por default
    public E1Persona(int dni) {
        super();
        this.nombre = "N";
        this.apellido = "N";
        this.fechaNacimiento = LocalDate.of(2000, 1, 1);
        this.sexo = "Femenino";
        this.peso = 1;
        this.altura = 1;
    }

    //Constructor con datos por setear
    public E1Persona(String nombre, String apellido, LocalDate fechaNacimiento, int dni, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;

    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void  setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento =fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public String getSexo() {
        return  sexo;
    }
    public void setSexo() {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularMasaCorporal() {
        return getPeso() / (getAltura() * getAltura());
    }

    public boolean estoyEnForma() {
        return  calcularMasaCorporal() > 18.5 && calcularMasaCorporal() < 25;
    }

    public boolean cumpleAnosHoy() {
        LocalDate hoy = LocalDate.now();
        return hoy.getMonth() == getFechaNacimiento().getMonth() &&
                hoy.getDayOfMonth() == getFechaNacimiento().getDayOfMonth();
    }

    public boolean esMayorDeEdad() {
        LocalDate hoy= LocalDate.now();
        Period periodo = Period.between(getFechaNacimiento(), hoy); //diferencia en años entre hoy y la fecha de nacimiento
        return periodo.getYears() >= 18;
    }

    public boolean puedeVotar() {
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(getFechaNacimiento(), hoy);
        return periodo.getYears() >= 16;
    }

    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNacimiento, hoy).getYears();
    }

    public boolean esFechaNacimientoCoherenteConEdad() {
        int edadCalculada = calcularEdad();
        return edadCalculada >= 0; // La edad calculada siempre debería ser válida
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", dni=" + dni +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }


}
