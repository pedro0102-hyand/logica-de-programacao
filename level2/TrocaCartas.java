import java.util.*;

public class TrocaCartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A == 0 && B == 0) break;

            Set<Integer> cartasAlice = new HashSet<>();
            for (int i = 0; i < A; i++) {
                cartasAlice.add(sc.nextInt());
            }

            Set<Integer> cartasBeatriz = new HashSet<>();
            for (int i = 0; i < B; i++) {
                cartasBeatriz.add(sc.nextInt());
            }


            Set<Integer> aliceUnicas = new HashSet<>(cartasAlice);
            Set<Integer> beatrizUnicas = new HashSet<>(cartasBeatriz);

            aliceUnicas.removeAll(cartasBeatriz);     
            beatrizUnicas.removeAll(cartasAlice);  

            int maxTroca = Math.min(aliceUnicas.size(), beatrizUnicas.size());

            System.out.println(maxTroca);
        }

        sc.close();
    }
}

