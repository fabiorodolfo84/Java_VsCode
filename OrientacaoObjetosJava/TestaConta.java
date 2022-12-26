package OrientacaoObjetosJava;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = 14345;
        c1.saldo = 1099;
        c1.limite = 800;
        Agencia agencia;

        Conta c2 = new Conta();
        c2.numero = 8974;
        c2.saldo = 4000;
        c2.limite = 250;

        System.out.println("******Dados da primeira conta******");
        System.out.println("Numero: " + c1.numero);
        System.out.println("Saldo: " + c1.saldo);
        System.out.println("Limite: " + c1.limite);


        System.out.println("-------------------------------");

        System.out.println("******Dados da segunda conta******");
        System.out.println("Numero: " + c2.numero);
        System.out.println("Saldo: " + c2.saldo);
        System.out.println("Limite: " + c2.limite);

        
    }
    
}
