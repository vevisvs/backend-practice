package semana5.navetur;

public class Yate extends Embarcacion implements Comparable{
    private Integer cantidadCamarotes;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anoFabricacion, Integer eslora, Integer cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anoFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public Integer getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(Integer cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Object o){
        Yate y = (Yate) o;
        if(this.cantidadCamarotes > ((Yate) o).cantidadCamarotes){
            return 1;
        }else if(this.cantidadCamarotes < ((Yate) o).cantidadCamarotes){
            return -1;
        }else{
            return 0;
        }
    }
}
