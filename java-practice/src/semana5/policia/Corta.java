package semana5.policia;

public class Corta extends Arma {
    private Boolean esAutomatica;

    public Corta(Policia policia, Integer cantMuniciones, Double alcanceMuniciones, String marca, Integer calibre, String estado, Boolean esAutomatica) {
        super(policia, cantMuniciones, alcanceMuniciones, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public Boolean getEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(Boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }



    public Boolean dispararAMasDe200m() {
        if (super.getAlcanceMuniciones() >= 200) {
            return true;
        }else{
            return false;
        }
    }
}
