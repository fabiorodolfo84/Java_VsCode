package ExerciciosLogica;
public class JurosSimples {
    public static void main(String[] args) {
        double P; // valor principal
        double J; // taxa de juros
        int T; // periodo em meses

        //Atribua valores a essas variaveis. Por exemplo:


        P = 1000; // valor principal é 1000
        J = 0.05; // taxa de juros é 5%
        T = 6; // periodo é de 6 meses

        // agora vamos calcular o valor dos juros usando a formula de juros simples: juros = P*J*T. 
        //Por exemplo

        double juros = P * J * T;

        // vamos adiocionar os juros ao valor principal para obter o valor total a ser pago
        // por exemplo:

        double total = P + juros;

    System.out.println("O valor total a ser pargo é: " + total);

        

    }
}
