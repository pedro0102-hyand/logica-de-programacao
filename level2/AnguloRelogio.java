import java.util.*;

public class AnguloRelogio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> angulosPossiveis = new HashSet<>();

        for (int minuto = 0; minuto < 720; minuto++) {
            int posMinuto = minuto % 60;
            int posHora = minuto / 12; 

            int diff = Math.abs(posMinuto - posHora);
            int angulo = diff * 6; 
            int anguloMin = Math.min(angulo, 360 - angulo);

            angulosPossiveis.add(anguloMin);
        }

        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            if (angulosPossiveis.contains(A)) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }

        sc.close();
    }
}

