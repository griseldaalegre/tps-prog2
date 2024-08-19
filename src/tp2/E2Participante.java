package tp2;

public class E2Participante {
    private String apellido;
    private String email;
    private String telefono;

    public E2Participante(String apellido, String email, String telefono) {
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
