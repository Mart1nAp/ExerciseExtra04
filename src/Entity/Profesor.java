package Entity;

public class Profesor extends Persona{

    protected String departamentoPerteneciente;

    public Profesor(String nombre, String apellido, int dni, String estadoCivil, String departamentoPerteneciente) {
        super(nombre, apellido, dni, estadoCivil);
        this.departamentoPerteneciente = departamentoPerteneciente;
    }

    public String getDepartamentoPerteneciente() {
        return departamentoPerteneciente;
    }

    public void setDepartamentoPerteneciente(String departamentoPerteneciente) {
        this.departamentoPerteneciente = departamentoPerteneciente;
    }
    public String toString() {
        return "Profesor {" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", DNI ='" + getDni() + '\'' +
                ", estadoCivil='" + getEstadoCivil() + '\'' +
                ", departamentoPerteneciente=" + getDepartamentoPerteneciente() +
                '}';
    }
}
