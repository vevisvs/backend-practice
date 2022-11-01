package semana3.constructora;

public class Empleado {
    //atributos:
    private Double contratoEstandar;
    private String nombreEmpleado;

    //constructor:
    public Empleado(Double contratoEstandar, String nombreEmpleado){
        this.contratoEstandar = contratoEstandar;
        this.nombreEmpleado = nombreEmpleado;
    }

    //getters y setters:
    public Double getContratoEstandar(){
        return this.contratoEstandar;
    }

    //metodos:
    /*public Double calcularCobroPorProyecto(){
        Double cobroPorProyecto =
    }*/
}
