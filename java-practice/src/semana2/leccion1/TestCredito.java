package semana2.leccion1;

public class TestCredito {
    public static void main(String[] args) {

        TarjetaDeCredito tdcVevis = new TarjetaDeCredito("Vevis Villalobos", "123456",20000.0);
        tdcVevis.setEstaPaga(true);
        tdcVevis.aumentarCredito(5000.0);
        tdcVevis.calcularCreditoDisponible();
        System.out.println(tdcVevis.getCreditoDisponible());

    }
}
