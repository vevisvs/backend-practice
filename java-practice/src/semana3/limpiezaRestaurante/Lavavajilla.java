package semana3.limpiezaRestaurante;

public class Lavavajilla extends Empleado{
    //atributos:
    private Boolean hayVajillaRota;
    private Integer cantVajillaRota;
    private Double descuento = 5.0;

    //constructor:
    public Lavavajilla(Boolean hayVajillaRota, Integer cantVajillaRota){
        this.hayVajillaRota = hayVajillaRota;
        this.cantVajillaRota = cantVajillaRota;
    }

    //getters y setters:
    public Boolean getHayVajillaRota(){
        return this.hayVajillaRota;
    }
    public Integer getCantVajillaRota(){
        return this.cantVajillaRota;
    }

    //metodos:
    public Boolean calcularVajillasRotas(){
        if(this.hayVajillaRota){
            System.out.println("Tiene " + getCantVajillaRota() + " " + "vajillas rotas");
            return true;
        }
        System.out.println("No tiene vajillas rotas");
        return false;
    }

    public Double descontarSueldo(){
        this.descuento = (getCantVajillaRota() * 5.0);
        return this.getSueldoMensual() - descuento;
    }
}
