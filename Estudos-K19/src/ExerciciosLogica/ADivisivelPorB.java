package ExerciciosLogica;
public class ADivisivelPorB {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 1000);
        int b = (int)(Math.random() * 20);

        System.out.println("a: " + a);
        System.out.println("a: " + b);

        if (a % b == 0) {
            System.out.println("É divisivel");
            
        }else {
            System.out.println("Não é divisivel");

    }
}

}
