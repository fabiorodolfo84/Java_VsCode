package OrientacaoObjetosJava;

public class Conta {
    int numero;
    double saldo;
    double limite = 100;
    Agencia agencia;

    //Adicione os metodos abaixo

    void deposita(double valor){
        this.saldo += valor;
    }

    void saca(double valor){
        this.saldo -=valor;
    }

    void imprimeExtrato(){
        System.out.println("Saldo: " + this.saldo);

    }

    double consultaSaldoDisponivel(){
        return this.saldo + this.limite;
    }
    
    
}
