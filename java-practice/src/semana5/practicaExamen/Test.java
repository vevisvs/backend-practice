package semana5.practicaExamen;

public class Test {
    public static void main(String[] args) {
        Empresa empleado = new Empresa();

        //a traves del metodo agregado en la clase Empresa, estamos agregando a los empleados:
        empleado.agregarEmpleado(new EmpleadoSalarioFijo("123", "jose", "fernandez", 2014, 60000.0));
        empleado.agregarEmpleado(new EmpleadoAComision("567", "lucia", "clara", 2021, 50000.0, 50, 500.0));

    }
}
