package semana2.leccion1;

import java.util.Calendar;

public class TarjetaDeCredito {

    //atributos:
    private String nombreTitular;
    private String numeroTarjeta;
    private Calendar fechaVencimiento;
    private Double limiteDeCredito;
    private Boolean estaPaga;
    private Double creditoDisponible;
    private Double creditoConsumido;

    //constructor:
    TarjetaDeCredito(String nombreTitular, String numeroTarjeta, Double limiteDeCredito) {
        this.nombreTitular = nombreTitular;
        this.numeroTarjeta = numeroTarjeta;
        this.limiteDeCredito = limiteDeCredito;
        this.creditoConsumido = 0.0;
        this.creditoDisponible = 0.0;
    }

    //getters y setters:
    public Double getLimiteDeCredito(){
        return this.limiteDeCredito;
    }

    public Double getCreditoDisponible(){
        return this.creditoDisponible;
    }

    public Double getCreditoConsumido(){
        return this.creditoConsumido;
    }

    public Boolean getEstaPaga(){
        return this.estaPaga;
    }

    public void setEstaPaga(Boolean estaPaga) {
        this.estaPaga = estaPaga;
    }

    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getNombreTitular(){
        return this.nombreTitular;
    }


    //metodos:
    public Boolean aumentarCredito(Double monto) {
        if (this.estaPaga != null && this.estaPaga != false) {
            System.out.println("Felicidades, hemos aumentedo su limite de credito");
            this.limiteDeCredito += monto;
            return true;
        }
        System.out.println("No hemos podido aumentar su credito");
        return false;
    }

    public Boolean hacerCompras(Double creditoDisponible, Double montoAPagar) {
        if (montoAPagar <= creditoDisponible) {
            System.out.println("Compra efectuada con exito");
            return true;
        } else {
            System.out.println("Transaccion rechazada por saldo insuficiente");
            return false;
        }
    }

    public void calcularCreditoDisponible() {
        this.creditoDisponible = this.limiteDeCredito - this.creditoConsumido;

    }

}

