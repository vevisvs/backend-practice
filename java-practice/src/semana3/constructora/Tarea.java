package semana3.constructora;

public class Tarea {
    //atributos:
    private Double cantidadContratosEstandar;
    private Double cantidadHorasPorTrabajador;

    //constructor:
    public Tarea(Double cantContratosFijos, Double cantHorasPorTrabajador){
        this.cantidadContratosEstandar = cantContratosFijos;
        this.cantidadHorasPorTrabajador = cantHorasPorTrabajador;
    }

    //getters y setters:
    public Double getCantidadContratosEstandar(){
        return this.cantidadContratosEstandar;
    }

    public Double getCantidadHorasPorTrabajador(){
        return this.cantidadHorasPorTrabajador;
    }

    //metodos:
    public Double calcularCostoDeTarea(Double importProyectoTerminado, Double importHoraTrabajada){
        Double costoDeTarea =
                (this.cantidadContratosEstandar * importProyectoTerminado) +
                        (this.cantidadHorasPorTrabajador * importHoraTrabajada);
        return costoDeTarea;
    }
}
