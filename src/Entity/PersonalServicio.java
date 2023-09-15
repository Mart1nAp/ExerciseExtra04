package Entity;

public class PersonalServicio extends Persona{

    protected String seccionAsignado;

    public PersonalServicio(String nombre, String apellido, int dni, String estadoCivil, String seccionAsignado) {
        super(nombre, apellido, dni, estadoCivil);
        this.seccionAsignado = seccionAsignado;
    }

    public String getSeccionAsignado() {
        return seccionAsignado;
    }

    public void setSeccionAsignado(String seccionAsignado) {
        this.seccionAsignado = seccionAsignado;
    }

    @Override
    public String toString() {
        return "PersonalServicio{" +
                "seccionAsignado='" + seccionAsignado + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
