package semana3.constructora;

import java.util.ArrayList;

public class Proyecto {
    //atributos:
    private String nombreProyecto;
    private String codigoNumerico;
    private Double horasHombresEstimadas;
    private ArrayList[] tarea;
    private ArrayList[] empleado;

    //constructor:
    public Proyecto(String nombre, String codigo, Double horasHombresEstimadas){
        this.nombreProyecto = nombre;
        this.codigoNumerico = codigo;
        this.horasHombresEstimadas = horasHombresEstimadas;
    }

    //getters y setters:
    public Double getHorasHombresEstimadas(){
        return this.horasHombresEstimadas;
    }

    public ArrayList[] getEmpleado() {
        return empleado;
    }

    //metodos:
    public Double calcularCostoProyecto(){
        Double costo = this.empleado.length * this.horasHombresEstimadas;
        return costo;
    }
}

/* ¿puedo tener una funcion que me pregunte por el nombre de cada empleado de ese array? */
