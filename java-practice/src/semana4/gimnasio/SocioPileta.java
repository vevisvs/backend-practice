package semana4.gimnasio;

public class SocioPileta extends Socio {

    private Double costoPileta;
    private Boolean estaHabilitado;

    public SocioPileta(String nombre, String numeroSocio, Double cuota, String actividad, Double costoPileta){
        super(nombre, numeroSocio, cuota, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = true;
    }
}
