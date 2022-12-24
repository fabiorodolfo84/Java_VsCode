package ExerciciosLogica;
import java.util.Random;


public class GeradorMegaSena2022 {

    public static void main(String[] args) {
        Random random = new Random();

        for(int i = 0; i <6; i++) {
            int num = random.nextInt(61); // gera um numero aleatorio de 0 e 60.

            System.out.println("Os numeros gerados é: " + num);
        }
    }


}
   
