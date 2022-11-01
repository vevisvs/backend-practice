package semana3.constructora;

public class ContratoPorHora {
    //atributos:
    private Double importeDeHoraTrabajada;

    //constructor:
    public ContratoPorHora(Double importeDeHoraTrabajada){
        this.importeDeHoraTrabajada = importeDeHoraTrabajada;
    }

    //getters y setters:
    public Double getImporteDeHoraTrabajada(){
        return this.importeDeHoraTrabajada;
    }
}
