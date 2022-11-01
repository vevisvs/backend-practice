package semana4.bancoNacional;

public class Test {
    public static void main(String[] args) {

        Cuenta ctaCorriente = new CuentaCorriente(new Cliente(001, "Fernandez", "20582304", "5678"), 60000.0, true);

        System.out.println(ctaCorriente.depositar(20000.0));
        ctaCorriente.extraerEfectivo(34740.0);

        Cuenta ctaComitente = new CuentaComitente(new Cliente(002, "Villanueva", "21352762", "8893"),
                80000.0, true, "qwert", 1.0);

        System.out.println(ctaComitente.depositar(12000.0));
        ctaComitente.extraerEfectivo(20000.0);
    }
}
