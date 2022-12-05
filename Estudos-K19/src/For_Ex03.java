//faça um programa que percorra todos os numeros de 1 ate 100. para os numeros multiplos
//de 4, exiba a palavra "PIN", e para os outros, exiba o proprio numero.
public class For_Ex03 {
    public static void main(String[] args) {
        for(int contador = 1; contador <= 100; contador++){
            int resto = contador % 4;
            if(resto == 0){
                System.out.println("PIN");

            }else{
                System.out.println(contador);
            }
        }
    }
    
}
