public class Operadores2 {
    public static void main(String[] args) {
        String s = "Fabio Rodolfo";

        System.out.println(s.charAt(7)); // 7 caractere contando de 0-7 imprimindo o caractere (0) de rodolfo

        System.out.println(s.contains("Rodolfo"));
        System.out.println(("Oliveira"));
        System.out.println(("Rodolfo"));
        System.out.println(("Oliveira"));

        System.out.println(s.startsWith("Aline"));
        System.out.println(s.startsWith("Diane"));
        
        s = s.replaceAll("Rafael", "Benedito");
        System.out.println(s);

        System.out.println(s.substring(6));
        System.out.println(s.substring(0, 5));

        s= s.toUpperCase();
        System.out.println(s);

        s= s.toLowerCase();
        System.out.println(s);

        s = " Estudos Operadores JAVA ";
        System.out.println(s.trim());

    }
}
