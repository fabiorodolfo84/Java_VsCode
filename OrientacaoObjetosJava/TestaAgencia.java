package OrientacaoObjetosJava;

public class TestaAgencia {
    public static void main(String[] args) {
        Agencia a1 = new Agencia();
        a1.numero = 2541;

        Agencia a2 = new Agencia();
        a2.numero = 5977;

        System.out.println("******Dados da primeira agencia******");
        System.out.println("Numero: " + a1.numero);

        System.out.println("--------------------------------------");

        System.out.println("******Dados da segunda agencia******");
        System.out.println("Numero " + a2.numero);

        
    }
    
}
