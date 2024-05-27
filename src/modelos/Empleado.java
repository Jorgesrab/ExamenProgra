package modelos;

public class Empleado extends Persona{
    private String usuario;
    private String contrasenia;

    public Empleado(String dni, String nombre, String usuario, String contrasenia) {
        super(dni, nombre);
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Empleado con " + super.toString() +
                ", tiene como usuario='" + usuario + '\'' ;
    }
}
