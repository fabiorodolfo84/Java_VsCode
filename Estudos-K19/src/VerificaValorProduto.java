public class VerificaValorProduto {
    public static void main(String[] args) {
        double precoProduto1 = Math.random() * 1000;
        double precoProduto2 = Math.random() * 1000;
       
        System.out.println("O preço do produto 1 é: " + precoProduto1);
        System.out.println("O preço do produto 2 é: " + precoProduto2);
        

        if (precoProduto1 < precoProduto2){
            System.out.println("O produto 1 é o mais barato");

        }else{

            if(precoProduto2 < precoProduto1){
            System.out.println("O produto 2 é mais barato");
        } else { 
            System.out.println("Os preços dos dois produtos são iguais");
    }
}

    }
}
