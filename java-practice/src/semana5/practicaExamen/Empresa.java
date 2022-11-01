package semana5.practicaExamen;

import java.util.ArrayList;

public class Empresa {
    private Empleado empleados;

    public Empresa(){

    }

    public void agregarEmpleado(Empleado e){
        this.empleados.add(e); //.add permite agregar elementos al final del ArrayList (si no le indicamos posicion)
    }

}
