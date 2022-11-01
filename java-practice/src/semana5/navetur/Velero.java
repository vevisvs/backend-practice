package semana5.navetur;

public class Velero extends Embarcacion{
    private Integer cantidadMastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anoFabricacion, Integer eslora, Integer cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anoFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public Integer getCantidadMastiles() {
        return cantidadMastiles;
    }

    public void setCantidadMastiles(Integer cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }

    public Boolean esGrande(){
        if(this.cantidadMastiles > 4){
            return true;
        }
        return false;
    }
}

