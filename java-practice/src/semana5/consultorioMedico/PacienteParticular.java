package semana5.consultorioMedico;

public class PacienteParticular extends Paciente{

    private Double cobroConsulta;
    private String dni;

    public PacienteParticular(Consulta consulta, String nombre, String apellido, Boolean esPrimeraConsulta, Double cobroConsulta, String dni) {
        super(consulta, nombre, apellido, esPrimeraConsulta);
        this.cobroConsulta = cobroConsulta;
        this.dni = dni;
    }
}
