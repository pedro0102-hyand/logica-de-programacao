import java.util.Scanner;

public class KiloMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        sc.nextLine(); 

        for (int caso = 0; caso < N; caso++) {
            int T = sc.nextInt(); 
            int[] tiros = new int[T];

            for (int i = 0; i < T; i++) {
                tiros[i] = sc.nextInt();
            }

            sc.nextLine(); 
            String pulos = sc.nextLine(); 

            int atingido = 0;
            for (int i = 0; i < T; i++) {
                char acao = pulos.charAt(i);
                int altura = tiros[i];

                if ((acao == 'S' && altura <= 2) || (acao == 'J' && altura > 2)) {
                    atingido++;
                }
            }

            System.out.println(atingido);
        }

        sc.close();
    }
}

