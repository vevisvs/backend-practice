package semana5.videojuego;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Este es mi ataque placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Este es mi ataque araniazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Este es mi ataque de mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Este es mi ataque de puno fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Este es mi ataque lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Este es mi ataque de ascuas");
    }
}
