package OrientacaoObjetosJava;

public class TestaContaEAgencia {
    public static void main(String[] args) {
        Agencia a = new Agencia();
        Conta c  = new Conta();

        a.numero = 178;

        c.numero = 123;
        c.saldo = 1000.0;
        c.limite = 500;

        System.out.println("******Dados da agencia******");
        System.out.println("Numero: " + a.numero);

        System.out.println("----------------------------");

        System.out.println("Dados da conta");
        System.out.println("Numero: " + c.numero);
        System.out.println("Saldo: " + c.saldo);
        System.out.println("Limite: " + c.limite);

        System.out.println("-----------------------------");

        c.agencia = a;

        System.out.println("Dados da agencia obtidos atraves da conta");
        System.out.println(c.agencia.numero);

    }
}
