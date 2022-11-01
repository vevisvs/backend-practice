package semana2.leccion2;

public class Perro {
    //atributos:
    private Boolean enAdopcion;
    private String raza;
    private Integer anoNacimiento;
    private Double peso;
    private Boolean tieneChip;
    private Boolean estaLastimado;
    private String nombre;


    //constructor:
    Perro(Integer anoNacimiento, Boolean tieneChip, Boolean estaLastimado, String nombre){
        this.anoNacimiento = anoNacimiento;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombre = nombre;
    }


    //getters y setters:
    public Integer getAnoNacimiento(){
        return anoNacimiento;
    }

    public void setAnoNacimiento(Integer anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public Boolean getTieneChip(){
        return true;
    }

    public void setTieneChip(Boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public Boolean getEstaLastimado(){
        return false;
    }

    public void setEstaLastimado(Boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public Boolean getEnAdopcion(){
        return true;
    }



    //metodos:
    public Integer calcularEdad(Integer anoNacimiento, Integer anoActual){
        Integer edad = anoActual - anoNacimiento;
        System.out.println("El perro tiene: " + edad + " anos");
        return edad;
    }

    public Boolean factibleAPerderse(Boolean tieneChip){
        if(tieneChip) {
            System.out.println("Este perro tiene chip y no es factible a perderse");
            return true;
        }else{
            System.out.println("Este perro no tiene chip y es factible a perderse");
            return false;
        }
    }

    public Boolean enAdopcion(Boolean estaLastimado, Double peso){
        if(!estaLastimado && peso >= 5){
            System.out.println("Puede ser adoptado");
            return true;
        }else{
            System.out.println("No puede ser adoptado");
            return false;
        }
    }


}
