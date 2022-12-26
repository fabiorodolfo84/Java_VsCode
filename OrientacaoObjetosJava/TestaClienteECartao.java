package OrientacaoObjetosJava;

public class TestaClienteECartao {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        cartaoDeCredito cdc = new cartaoDeCredito();

        c.nome = "Fabio Rodolfo";
        c.codigo = 123;
        cdc.numero = 111111;
        cdc.dataDeValidade = "12/12/18";
        System.out.println("Dados do cliente");
        System.out.println("Nome: " + c.nome);
        System.out.println("Codigo: " + c.codigo);

        System.out.println("------------------------------");

        System.out.println("Dados do cartao");
        System.out.println("Numero: " + cdc.numero);
        System.out.println("Numero: " + cdc.dataDeValidade);

        System.out.println("-------------------------------");

        cdc.cliente = c;

        System.out.println("Dados do cliente obtidos atraves do cartao");
        System.out.println(cdc.cliente.nome);
        System.out.println(cdc.cliente.codigo);


    }
}
