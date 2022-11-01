package semana5.policia;

public abstract class Arma {
    private Policia policia;
    private Integer cantMuniciones;
    private Double alcanceMuniciones;
    private String marca;
    private Integer calibre;
    private String estado;

    public Arma(Policia policia, Integer cantMuniciones, Double alcanceMuniciones, String marca, Integer calibre, String estado) {
        this.policia = policia;
        this.cantMuniciones = cantMuniciones;
        this.alcanceMuniciones = alcanceMuniciones;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public Policia getPolicia() {
        return policia;
    }

    public void setPolicia(Policia policia) {
        this.policia = policia;
    }

    public Integer getCantMuniciones() {
        return cantMuniciones;
    }

    public void setCantMuniciones(Integer cantMuniciones) {
        this.cantMuniciones = cantMuniciones;
    }

    public Double getAlcanceMuniciones() {
        return alcanceMuniciones;
    }

    public void setAlcanceMuniciones(Double alcanceMuniciones) {
        this.alcanceMuniciones = alcanceMuniciones;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCalibre() {
        return calibre;
    }

    public void setCalibre(Integer calibre) {
        this.calibre = calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean estaEnCondiciones(){
        if(this.estado.equals("en uso") && this.calibre >= 9){
            return true;
        }
        return false;
    }
}
