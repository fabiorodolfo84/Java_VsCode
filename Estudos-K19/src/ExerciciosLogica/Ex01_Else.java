package ExerciciosLogica;
public class Ex01_Else {
    
        //A altura minima para ingresso na atração "The Barnstorner" do parque tematico da 
        //Disney "Magiv Kingtom é 0.89 metros. Vamos simular a execução do programa
        //que controla o acesso dos visitances a essa atração."
    
        public static void main(String[] args) {
            double altura = Math.random();
            System.out.println(altura);
            if(altura < 0.89){
                System.out.println("Acesso bloqueado");
            } else {
                System.out.println("Acesso liberado");
            }
            System.out.println("The Barnstormer");
    
    
        }
    }

