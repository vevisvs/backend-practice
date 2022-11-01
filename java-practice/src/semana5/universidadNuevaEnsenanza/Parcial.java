package semana5.universidadNuevaEnsenanza;

public class Parcial extends Examen {
    private Integer numeroDeUnidad;
    private Integer numeroDeReintentos;

    public Parcial(String titulo, String enunciado, Integer nota, Integer numeroDeUnidad, Integer numeroDeReintentos){
        super(titulo, enunciado, nota);
        this.numeroDeUnidad = numeroDeUnidad;
        this.numeroDeReintentos = numeroDeReintentos;
    }

    @Override
    public Boolean estaAprobado(){
        if(super.getNota() >= 4){
            System.out.println("Aprobado");
            return true;
        }else{
            System.out.println("No aprobado. Va a recuperatorio.");
            return false;
        }

    }

    public Boolean puedeRecuperar(){
        if(this.numeroDeUnidad <= 3 && this.numeroDeReintentos <= 3){
            System.out.println("Puede recuperar la nota");
            return true;
        }else if(this.numeroDeUnidad > 3 && this.numeroDeUnidad <= 2){
            System.out.println("Puedes recuperar la nota");
        }else{
            System.out.println("Ya no tienes mas intentos para recuperatorio");
        }
        return false;
    }

}
