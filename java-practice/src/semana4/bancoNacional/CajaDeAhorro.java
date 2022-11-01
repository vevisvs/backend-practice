package semana4.bancoNacional;

public class CajaDeAhorro extends Cuenta {
    private Double saldo;
    private Double tasaInteres;

    public CajaDeAhorro(Cliente cliente, Double saldo, Double tasaInteres) {
        super(cliente);
        this.saldo = saldo;
        this.tasaInteres = tasaInteres;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public Double depositar(Double monto) {
        return null;
    }

    @Override
    public void extraerEfectivo(Double monto) {
        System.out.println("Extrayendo el efectivo solicitado...");
    }

    public Double cobrarInteres(Double monto){
        monto = saldo + (tasaInteres / 12);
        return monto;
    }
}
