package semana5.videojuego;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola, este es mi ataque placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Este es mi ataque araniazo");

    }

    @Override
    public void atacarMordisco() {
        System.out.println("Este es mi ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Este es mi ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Este es mi ataque paralizante");
    }
}
