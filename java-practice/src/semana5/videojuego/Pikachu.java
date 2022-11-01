package semana5.videojuego;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
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
        System.out.println("Este es mi ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Este es mi ataque de impacto trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Este es mi ataque de puno trueno");
    }
}
