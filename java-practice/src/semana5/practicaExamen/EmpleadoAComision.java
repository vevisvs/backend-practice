package semana5.practicaExamen;

public class EmpleadoAComision extends Empleado {
    private Double salarioMinimo;
    private Integer nroClientesCaptados;
    private Double montoPorCliente;

    public EmpleadoAComision(String dni, String nombre, String apellido, Integer anoDeIngreso, Double salarioMinimo, Integer nroClientesCaptados, Double montoPorCliente) {
        super(dni, nombre, apellido, anoDeIngreso);
        this.salarioMinimo = salarioMinimo;
        this.nroClientesCaptados = nroClientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public Double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(Double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public Integer getNroClientesCaptados() {
        return nroClientesCaptados;
    }

    public void setNroClientesCaptados(Integer nroClientesCaptados) {
        this.nroClientesCaptados = nroClientesCaptados;
    }

    public Double getMontoPorCliente() {
        return montoPorCliente;
    }

    public void setMontoPorCliente(Double montoPorCliente) {
        this.montoPorCliente = montoPorCliente;
    }

    @Override
    public Double calcularSalario() {
        Double monto = this.nroClientesCaptados * montoPorCliente;
        if(monto < this.salarioMinimo){
            return getSalarioMinimo();
        }
        return monto;
    }

    public void empleadoConMasClientes(){

    }
}
