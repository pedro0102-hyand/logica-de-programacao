import java.util.*;

public class FolhaDeRespostas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;

            for (int i = 0; i < N; i++) {
                int[] valores = new int[5];
                int marcadas = 0;
                int indiceMarcado = -1;

                for (int j = 0; j < 5; j++) {
                    valores[j] = sc.nextInt();
                    if (valores[j] <= 127) {
                        marcadas++;
                        indiceMarcado = j;
                    }
                }

                if (marcadas == 1) {
                    System.out.println((char) ('A' + indiceMarcado));
                } else {
                    System.out.println("*");
                }
            }
        }

        sc.close();
    }
}

