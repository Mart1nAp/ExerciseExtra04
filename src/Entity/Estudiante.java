package Entity;

public class Estudiante extends Persona{

    protected String cursoMatriculado;

    public Estudiante(String nombre, String apellido, int dni, String estadoCivil, String cursoMatriculado) {
        super(nombre, apellido, dni, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }
    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public String toString() {
        return " Estudiante" +
                " nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", DNI ='" + getDni() + '\'' +
                ", estadoCivil='" + getEstadoCivil() + '\'' +
                ", cursoMatriculado=" + getCursoMatriculado() +
                '}';
    }
}
