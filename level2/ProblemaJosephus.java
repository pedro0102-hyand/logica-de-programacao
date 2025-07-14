import java.util.Scanner;

public class ProblemaJosephus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NC = sc.nextInt();

        for (int caso = 1; caso <= NC; caso++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int sobrevivente = josephus(n, k);
            System.out.println("Case " + caso + ": " + sobrevivente);
        }

        sc.close();
    }


    public static int josephus(int n, int k) {
        int res = 0; 
        for (int i = 2; i <= n; i++) {
            res = (res + k) % i;
        }
        return res + 1; 
    }
}

