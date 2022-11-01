package semana5.videojuego;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
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
        System.out.println("Este es mi taque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Este es mi ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Este es mi ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Este es mi ataque pistola de agua");
    }
}
