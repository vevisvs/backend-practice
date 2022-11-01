package semana5.practicaExamen;

public abstract class Empleado {
    private String dni;
    private String nombre, apellido;
    private Integer anoDeIngreso;

    public Empleado(String dni, String nombre, String apellido, Integer anoDeIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anoDeIngreso = anoDeIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getAnoDeIngreso() {
        return anoDeIngreso;
    }

    public void setAnoDeIngreso(Integer anoDeIngreso) {
        this.anoDeIngreso = anoDeIngreso;
    }

    public abstract Double calcularSalario();

    public Double mostrarSalario(String tipoEmpleado){
        Double salario = 0.0;
        if(tipoEmpleado == "Empleado salario fijo"){

        }
        return salario;
    }

    public String nombreCompleto(){
        return this.nombre + " " + this.apellido;
    }


    public void add(Empleado e) {
    }
}
