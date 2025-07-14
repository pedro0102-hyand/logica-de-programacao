import java.util.Scanner;

public class PassatempoPaula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < N; i++) {
            String linha = sc.nextLine();
            char c1 = linha.charAt(0); 
            char letra = linha.charAt(1); 
            char c2 = linha.charAt(2); 

            int d1 = Character.getNumericValue(c1);
            int d2 = Character.getNumericValue(c2);

            int resultado;
            if (d1 == d2) {
                resultado = d1 * d2;
            } else if (Character.isUpperCase(letra)) {
                resultado = d2 - d1;
            } else {
                resultado = d1 + d2;
            }

            System.out.println(resultado);
        }

        sc.close();
    }
}

