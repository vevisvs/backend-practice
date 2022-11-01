package semana5.consultorioMedico;

public class Paciente {

    private Consulta consulta;
    private String nombre;
    private String apellido;
    private Boolean esPrimeraConsulta;

    public Paciente(Consulta consulta, String nombre, String apellido, Boolean esPrimeraConsulta) {
        this.consulta = consulta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.esPrimeraConsulta = esPrimeraConsulta;
    }

    public Boolean getEsPrimeraConsulta() {
        return esPrimeraConsulta;
    }

    public void setEsPrimeraConsulta(Boolean esPrimeraConsulta) {
        this.esPrimeraConsulta = esPrimeraConsulta;
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

    public Boolean necesitaEvaluacionInicial(){
        if(this.esPrimeraConsulta){
            return true;
        }
        return false;
    }
}
