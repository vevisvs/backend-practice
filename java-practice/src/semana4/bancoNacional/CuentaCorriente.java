package semana4.bancoNacional;

public class CuentaCorriente extends Cuenta {
    private Double saldo;
    private Boolean montoAutorizado;

    public CuentaCorriente(Cliente cliente, Double saldo, Boolean montoAutorizado){
        super(cliente);
        this.saldo = saldo;
        this.montoAutorizado = montoAutorizado;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getMontoAutorizado() {
        return montoAutorizado;
    }

    public void setMontoAutorizado(Boolean montoAutorizado) {
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public Double depositar(Double monto) {
        this.saldo += monto;
        System.out.println("Deposito realizado. Su nuevo saldo es: ");
        return saldo;
    }

    @Override
    public void extraerEfectivo(Double monto) {
        this.saldo -= monto;
        System.out.println("Extrayendo efectivo... Saldo actual: " + saldo);
    }

    public Boolean depositarCheque(Double monto){
        if(this.montoAutorizado){
            saldo += monto;
            return true;
        }
        return false;
    }
}
