package semana5.policia;

public class Larga extends Arma implements Comparable{
    private Boolean tieneSelloRENAR;
    private String descripcionDeUso;
    private Integer nivel;

    public Larga(Policia policia, Integer cantMuniciones, Double alcanceMuniciones, String marca, Integer calibre, String estado, Boolean tieneSelloRENAR, String descripcionDeUso, Integer nivel) {
        super(policia, cantMuniciones, alcanceMuniciones, marca, calibre, estado);
        this.tieneSelloRENAR = tieneSelloRENAR;
        this.descripcionDeUso = descripcionDeUso;
        this.nivel = nivel;
    }

    public Boolean getTieneSelloRENAR() {
        return tieneSelloRENAR;
    }

    public void setTieneSelloRENAR(Boolean tieneSelloRENAR) {
        this.tieneSelloRENAR = tieneSelloRENAR;
    }

    public String getDescripcionDeUso() {
        return descripcionDeUso;
    }

    public void setDescripcionDeUso(String descripcionDeUso) {
        this.descripcionDeUso = descripcionDeUso;
    }

    public Integer getNivel() {
        return this.nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }



    @Override
    public int compareTo(Object o) {
        Larga l = (Larga) o;
        if(this.nivel > l.getNivel()){
            return 1;
        }else if(this.nivel < l.getNivel()){
            return -1;
        }
        return 0;
    }
}
