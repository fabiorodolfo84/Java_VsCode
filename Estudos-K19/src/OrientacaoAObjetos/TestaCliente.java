package OrientacaoAObjetos;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.nome = "Fabio Rodolfo";
        c1.codigo = 1;

        Cliente c2 = new Cliente();
        c2.nome = "Aline Diane";
        c2.codigo = 2;

        System.out.println("Dados do primeiro cliente");
        System.out.println("Nome: + c1.nome");
        System.out.println("Codigo: + c1.codigo");

        System.out.println("------------------------------");

        System.out.println("Dados do segundo cliente");
        System.out.println("Nome: + c2.nome");
        System.out.println("Codigo: + c1.codigo");

        
    }
}
