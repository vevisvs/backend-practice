package semana3.limpiezaRestaurante;

public class Test {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Jose", 60000.00);
        System.out.println("El nombre del empleado es: " + empleado1.getNombreEmpleado());
        System.out.println("Su sueldo es de " + empleado1.getSueldoMensual());

        Lavavajilla lavavajilla1 = new Lavavajilla(true, 5);
        lavavajilla1.setSueldoMensual(40000.0);
        System.out.println(lavavajilla1.calcularVajillasRotas());
        System.out.println("Con el descuento correspondiente, su sueldo es: " + lavavajilla1.descontarSueldo());


    }
}
