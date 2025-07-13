import java.util.*;

public class JogoVelha1D {

    static final int MAX = 10001;
    static int[] grundy = new int[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calcularGrundy();

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;

            String linha = sc.next();
            int xor = 0;

            int i = 0;
            while (i < N) {
                if (linha.charAt(i) == '.') {
                    int j = i;
                    while (j < N && linha.charAt(j) == '.') j++;
                    int tamanhoBloco = j - i;
                    xor ^= grundy[tamanhoBloco];
                    i = j;
                } else {
                    i++;
                }
            }

            System.out.println(xor == 0 ? "N" : "S");
        }

        sc.close();
    }

    // Pré-calcula todos os Grundy numbers de 0 até 10000
    static void calcularGrundy() {
        grundy[0] = 0;
        for (int tam = 1; tam < MAX; tam++) {
            Set<Integer> mexSet = new HashSet<>();

            for (int i = 0; i < tam; i++) {
                // Jogada em i, removendo 3 casas: i-1, i, i+1
                int esquerdo = Math.max(0, i - 2);
                int direito = Math.max(0, tam - i - 3);
                int g = grundy[esquerdo] ^ grundy[direito];
                mexSet.add(g);
            }

            // mínimo excludente (mex)
            int g = 0;
            while (mexSet.contains(g)) g++;
            grundy[tam] = g;
        }
    }
}

