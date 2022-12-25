package OrientacaoObjetosJava;

public class TestaCartaoDeCredito {
    public static void main(String[] args) {
        cartaoDeCredito cdc1 = new cartaoDeCredito();
        cdc1.numero = 111111;
        cdc1.dataDeValidade = "01/01/2022";

        cartaoDeCredito cdc2 = new cartaoDeCredito();
        cdc2.numero = 222222; 
        cdc2.dataDeValidade = "01/04/2022";
        
        System.out.println("******Dados do primeiro Cartão******");
        System.out.println("Numero: " + cdc1.numero);
        System.out.println("Data de validade: " + cdc1.dataDeValidade);

        System.out.println("------------------------------------------");

        System.out.println("******Dados do segundo cartão******");
        System.out.println("Numero: " + cdc2.numero);
        System.out.println("Data de validade " + cdc2.dataDeValidade);
        

    }
}
