package semana3.computadora;

public class DiscoRigido {
    //atributos
    private String marca;
    private Double capacidad;
    private Integer velocidadRPM;


    public DiscoRigido(String marca, Double capacidad, Integer velocidadRPM) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.velocidadRPM = velocidadRPM;
    }

    //metodos
    /*public void almacenarInfo(Double archivo){
        if(capacidad > archivo){
            System.out.println("Se guardó la informacion");
        }else if(capacidad == archivo){
            System.out.println("Se guardó la informacion pero tu capacidad está al limite");
        }else{
            System.out.println("No se guardó la informacion");
        }
    }*/

    public void borrarInformacion(Double archivo){
        this.capacidad = this.capacidad + archivo;
    }

}
