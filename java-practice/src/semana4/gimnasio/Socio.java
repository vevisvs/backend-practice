package semana4.gimnasio;

public class Socio {

    private String nombre;
    private String numeroSocio;
    private Double cuota;
    private String actividad;

    public Socio(String nombre, String numeroSocio, Double cuota, String actividad) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.cuota = cuota;
        this.actividad = actividad;
    }

    public Double calcularCuotaMensual(){
        return this.cuota;
    }
}
