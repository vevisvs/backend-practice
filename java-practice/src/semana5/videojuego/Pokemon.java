package semana5.videojuego;

public abstract class Pokemon {
    private Integer numPokedex;
    private String nombrePokedex;
    private Double peso;
    private String sexo;
    private Integer temporada;

    public Pokemon(){

    }

    public abstract void atacarPlacaje();
    public abstract void atacarAraniazo();
    public abstract void atacarMordisco();

}
