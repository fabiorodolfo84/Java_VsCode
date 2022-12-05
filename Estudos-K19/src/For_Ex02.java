
//faça um programa que percorra todos os numeros de 1 ate 100. para os 
//numeros impares, deve ser exibido um "*" e para os numeros pares "**".
public class For_Ex02 {
    public static void main(String[] args) {
        for(int contador = 1; contador <= 100; contador ++){
            int resto = contador % 2;
            if(resto == 1){
                System.out.println("*");
                
            } else{
                System.out.println("**");
            }
        }
    }
    
}
