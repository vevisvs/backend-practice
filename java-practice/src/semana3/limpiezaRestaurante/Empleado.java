package semana3.limpiezaRestaurante;

public class Empleado {
    //atributos:
    private String nombreEmpleado;
    private Double sueldoMensual = 0.0;

    //constructor:

    public Empleado(){
    }

    public Empleado(String nombre, Double sueldoMensual) {
        this.nombreEmpleado = nombre;
        this.sueldoMensual = sueldoMensual;
    }

    //getters y setters:
    public String getNombreEmpleado() {
        return this.nombreEmpleado;
    }

    public Double getSueldoMensual(){
        return this.sueldoMensual;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setSueldoMensual(Double sueldo){
        this.sueldoMensual = sueldo;
    }

    //metodos:
    public Double verSueldo(){
        Double sueldo = getSueldoMensual();
        System.out.println("El sueldo del empleado es de: " + sueldo + "pesos");
        return sueldo;
    }

}
