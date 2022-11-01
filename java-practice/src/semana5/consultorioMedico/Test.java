package semana5.consultorioMedico;

public class Test {
    public static void main(String[] args) {

        PacienteParticular particular1 = new PacienteParticular(new Consulta("24-01-12", "dermatologia", "15:10"), "jose", "fernandez", true, 2800.0, "20582304");
        PacienteObraSocial social1 = new PacienteObraSocial(new Consulta("12-12-15", "ginecologia", "14:20"), "clara", "martinez", false, "restacatando familias", 4589);
        PacienteObraSocial social2 = new PacienteObraSocial(new Consulta("24-07-22", "pediatria", "17.10"), "felipe", "ng", true, "rescatando familias", 6214);

        System.out.println("El paciente " + particular1.getNombre() + " " + particular1.getApellido() + " necesita una evaluacion inicial? = " + particular1.necesitaEvaluacionInicial());
        System.out.println("El paciente de obra social, asociado numero " + social1.getNumeroDeAsociado() + " necesita una evaluacion inicial? = " + social1.necesitaEvaluacionInicial());

        System.out.println(social1.compareTo(social2));
    }
}
