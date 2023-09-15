package Entity;

public class Empleado extends Persona{

    protected int anoIncorporacion;
    protected int numeroDespacho;

    public Empleado(String nombre, String apellido, int dni, String estadoCivil, int anoIncorporacion,
                    int numeroDespacho) {
        super(nombre, apellido, dni, estadoCivil);
        this.anoIncorporacion = anoIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public int getAnoIncorporacion() {
        return anoIncorporacion;
    }

    public void setAnoIncorporacion(int anoIncorporacion) {
        this.anoIncorporacion = anoIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
        return "Empleado {" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", DNI ='" + getDni() + '\'' +
                ", estadoCivil='" + getEstadoCivil() + '\'' +
                ", añoIncorporación=" + getAnoIncorporacion() +
                ", numeroDespacho=" + getNumeroDespacho() +
                '}';
    }
}
