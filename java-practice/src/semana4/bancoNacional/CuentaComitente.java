package semana4.bancoNacional;

import java.util.Scanner;

public class CuentaComitente extends CuentaCorriente {
    private String claveValidacion;
    private Double comisionBancaria = 1.0;

    public CuentaComitente(Cliente cliente, Double saldo, Boolean montoAutorizado, String claveValidacion, Double comisionBancaria){
        super(cliente, saldo, montoAutorizado);
        this.claveValidacion = claveValidacion;
        this.comisionBancaria = comisionBancaria;
    }

    public String getClaveValidacion(){
        return this.claveValidacion;
    }

    public void setClaveValidacion(){
        this.claveValidacion = claveValidacion;
    }

    public Double getComisionBancaria() {
        return comisionBancaria;
    }

    public void setComisionBancaria(Double comisionBancaria) {
        this.comisionBancaria = comisionBancaria;
    }

    @Override
    public Double depositar(Double monto) {
        Double resultado = super.getSaldo() - ((monto * comisionBancaria) / 100);
        System.out.println("Se ha realizado el deposito. Su saldo actual es: ");
        return resultado;
    }

    public void extraerEfectivo(Double monto) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu clave de validacion: ");
        this.claveValidacion = teclado.nextLine();
        if(teclado.nextLine().equals("")){
            monto = (monto * 50) / 100;
            System.out.println("Extrayendo una parte del monto ingresado: " + monto);
        }else{
            monto = monto;
            System.out.println("Extrayendo la totalidad del monto ingresado: " + monto);
        }



    }
}
