package semana5.universidadNuevaEnsenanza;

public class Alumno {
    private Examen examen;
    private String nombre;
    private String apellido;
    private String legajo;

    public Alumno(Examen examen, String nombre, String apellido, String legajo){
        this.examen = examen;
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
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
}
