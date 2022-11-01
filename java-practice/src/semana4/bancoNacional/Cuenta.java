package semana4.bancoNacional;

public abstract class Cuenta {
    private Cliente cliente;

    public Cuenta(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public abstract  Double depositar(Double monto);

    public abstract void extraerEfectivo(Double monto);

    public void informarSaldo(){
        System.out.println("Su saldo es: " );
    }
}
