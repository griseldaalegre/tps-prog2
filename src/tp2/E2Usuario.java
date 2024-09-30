package tp2;

public class E2Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public E2Usuario(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

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

    public boolean equals(Object o1) {
        try {
            E2Usuario po1 = (E2Usuario) o1;
            if (nombre.equals(po1.getNombre()) && apellido.equals(po1.getApellido()) && email.equals(po1.getEmail())
                    && telefono.equals(po1.getTelefono())) {
                return true;
            } else return false;
        } catch (Exception e) {
            return false;
        }
    }
}
