import java.util.Scanner;

public class CoralMaestrina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[] notas = new int[N];
            long soma = 0;

            for (int i = 0; i < N; i++) {
                notas[i] = sc.nextInt();
                soma += notas[i];
            }

            if (soma % N != 0) {
                System.out.println(-1);
                continue;
            }

            int target = (int) (soma / N);
            long subir = 0, descer = 0;

            for (int i = 0; i < N; i++) {
                if (notas[i] > target) {
                    descer += notas[i] - target;
                } else {
                    subir += target - notas[i];
                }
            }

            
            System.out.println(subir); 
        }

        sc.close();
    }
}

