package semana5.universidadNuevaEnsenanza;

public class Test {
    public static void main(String[] args) {

        Examen parcial = new Parcial("polimorfismo", "examen parcial 1", 5, 2, 3);
        Examen examenFinal1 = new ExamenFinal("frontend", "final de materia", 9, 8, "repaso final");

        parcial.setNota(3);
        System.out.println(parcial.estaAprobado());

        examenFinal1.setNota(8);
        System.out.println(examenFinal1.estaAprobado());





    }
}
