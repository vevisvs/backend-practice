package semana5.practicaExamen;

public class EmpleadoSalarioFijo extends Empleado{
    private Double sueldoBasico;

    public EmpleadoSalarioFijo(String dni, String nombre, String apellido, Integer anoDeIngreso, Double sueldoBasico) {
        super(dni, nombre, apellido, anoDeIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public Double calcularSalario() {
        System.out.println("Calculando salario... espere unos segundos");
        return this.sueldoBasico + (this.sueldoBasico * calcularPorcentajeAdicional());
    }

    public Double calcularPorcentajeAdicional(){
        Double resultado = 0.0;
        if (super.getAnoDeIngreso() > 2020) {
            System.out.println("Cobra sueldo basico " + getSueldoBasico());
        }else if(super.getAnoDeIngreso() <= 2020 && super.getAnoDeIngreso() >= 2015){
            resultado = getSueldoBasico() * 0.05;
        }else{
            resultado = getSueldoBasico() * 0.1;
        }
        return resultado;
    }
}


