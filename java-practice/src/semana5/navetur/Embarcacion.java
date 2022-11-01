package semana5.navetur;

import java.util.Calendar;

public abstract class Embarcacion {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anoFabricacion;
    private Integer eslora;

    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Integer anoFabricacion, Integer eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacion = anoFabricacion;
        this.eslora = eslora;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Integer getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(Integer anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Double calcularAlquiler(Integer anoFabricacion) {
        Double total = getPrecioBase() + getValorAdicional();
        if (this.anoFabricacion < 2020) {
            return getPrecioBase();
        }else{
            return total;
        }
    }

}
