package semana3.veterinaria;

public class Mascota {
    private String identificacion;
    private String nombre;
    private String raza;
    private String peso;

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getPeso() {
        return peso;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
