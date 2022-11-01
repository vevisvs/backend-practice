package semana5.consultorioMedico;

public class PacienteObraSocial extends Paciente implements Comparable{

    private String nombreObraSocial;
    private Integer numeroDeAsociado;

    public PacienteObraSocial(Consulta consulta, String nombre, String apellido, Boolean esPrimeraConsulta, String nombreObraSocial, Integer numeroDeAsociado) {
        super(consulta, nombre, apellido, esPrimeraConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroDeAsociado = numeroDeAsociado;
    }

    public Integer getNumeroDeAsociado() {
        return numeroDeAsociado;
    }

    public void setNumeroDeAsociado(Integer numeroDeAsociado) {
        this.numeroDeAsociado = numeroDeAsociado;
    }

    @Override
    public int compareTo(Object o) {
       PacienteObraSocial social = (PacienteObraSocial) o;
       if(this.numeroDeAsociado > social.getNumeroDeAsociado()){
           return 1;
       }else if(this.numeroDeAsociado < social.getNumeroDeAsociado()){
           return -1;
       }
       return 0;
    }
}
