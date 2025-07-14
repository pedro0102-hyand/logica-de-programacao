import java.util.*;

public class ContagemNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, Integer> contagem = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            contagem.put(x, contagem.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
            System.out.println(entry.getKey() + " aparece " + entry.getValue() + " vez(es)");
        }

        sc.close();
    }
}

