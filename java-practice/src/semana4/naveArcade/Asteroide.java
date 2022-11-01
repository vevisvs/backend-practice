package semana4.naveArcade;

public class Asteroide extends Objeto {
    private Integer lesion = 0;

    public Asteroide(Integer posX, Integer posY, String direccion, Integer lesion){
        super(posX, posY, direccion);
        this.lesion = lesion;
    }

    public Integer getLesion(){
        return this.lesion;
    }

    public void setLesion(){
        this.lesion = lesion;
    }

    @Override
    public String irA() {
        System.out.println("Ir a la direccion de la nave");
        return null;
    }
}
