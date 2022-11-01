package semana5.universidadNuevaEnsenanza;

public class ExamenFinal extends Examen implements Comparable {
    private Integer notaOral;
    private String descripcionTema;

    public ExamenFinal(String titulo, String enunciado, Integer nota, Integer notaOral, String descripcionTema){
        super(titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionTema = descripcionTema;
    }

    public Integer getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(Integer notaOral) {
        this.notaOral = notaOral;
    }

    @Override
    public Boolean estaAprobado(){

        if(this.notaOral >= 4){
            System.out.println("Esta aprobado");
            return true;
        }
        System.out.println("No esta aprobado");
        return false;
    }

    @Override
    public int compareTo(Object o) {
        ExamenFinal e = (ExamenFinal) o;
        if(this.notaOral > ((ExamenFinal) o).getNotaOral()){
            return 1;
        }else if(this.notaOral < ((ExamenFinal) o).notaOral){
            return -1;
        }else{
            return 0;
        }
    }
}

    /* Final otroFinal = (Final)object;
    * Double promedioFinal = (this.notaOral + getNota())/2;
    * Double promedioOtroFinal = otroFinal.getNotaOral() + otroFinal.getNota())/2;
    * if(promedioFinal > promedioOtroFinal)
    *   return 1;
    * }else if(promedioFinal > promedioOtroFinal){
    *   return -1;
    * }else{
    *   return 0;
* */
