package semana4.naveArcade;

public abstract class Objeto {
    private Integer posX;
    private Integer posY;
    private String direccion;

    public Objeto(Integer posX, Integer posY, String direccion){
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
    }

    public Integer getPosX() {
        return posX;
    }

    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    public Integer getPosY() {
        return posY;
    }

    public void setPosY(Integer posY) {
        this.posY = posY;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public abstract String irA();
}
