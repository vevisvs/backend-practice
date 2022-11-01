package semana2.leccion1;

public class Test {
    public static void main(String[] args) {

        //tarjeta de debito:
        TarjetaDeDebito tarjetaDeMargarita = new TarjetaDeDebito("Margarita");
        TarjetaDeDebito tarjetaDeVevis = new TarjetaDeDebito("Vevis");
       TarjetaDeDebito tarjetaDeCamila = new TarjetaDeDebito( "Camila", "123456", 5000.0);
       TarjetaDeDebito tarjetaDePedro = new TarjetaDeDebito("Pedro", "567891", 2000.0);


        /*System.out.println(tarjetaDeCamila.getNumeroTarjeta());
        tarjetaDeVevis.setEstaListaParaUso(true);
        System.out.println("estado tarjeta de: " + tarjetaDeVevis.getNombreTitular() +
                ": " + tarjetaDeVevis.getEstaListaParaUso());*/
        tarjetaDeCamila.setSaldo(500.0);
        System.out.println("Su saldo es de: " + " " + tarjetaDeCamila.getSaldo());
        /*tarjetaDeVevis.pagar(300.0);
        System.out.println("Su nuevo saldo es de: " + " " + tarjetaDeVevis.getSaldo());*/


    }
}
