package tp4;

public class EJ6UsuarioFinal extends EJ6Persona {
    private String nombreUsuario;
    private String password;

    public EJ6UsuarioFinal(String nombre, String apellido, int edad, String nombreUsuario, String password) {
        super(nombre, apellido, edad);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Cargo: Usuario Final\n" +
                "Nombre: " + getNombre() + " " + getApellido() + "\n" +
                "Edad: " + getEdad();
    }


}
