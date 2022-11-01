package semana4.naveArcade;

public class Test {
    public static void main(String[] args) {

        Nave zeus = new Nave(32, 53, "norte", 2000.0, 100);

        Asteroide ast200 = new Asteroide(39, 18, "sur", 38);

        zeus.irA();
        zeus.girar();
        zeus.setVida(100);
        zeus.restaVida(50);
    }
}
