package ExerciciosLogica;
public class AprovadoReprovado {
    public static void main(String[] args) {
        double nota = Math.random()*10;

        System.out.println("A nota do aluno é: " + nota);

        if (nota < 6){
            System.out.println("REPROVADO");
            
        }else{
            System.out.println("Aprovado");
        }

    }

}
