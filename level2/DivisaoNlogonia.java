import java.util.*;

public class DivisaoNlogonia {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        while(true){
            int K = sc.nextInt();
            if(K==0) break;

            int N = sc.nextInt();
            int M = sc.nextInt();

            for(int i = 0 ; i < K; i++){
                int X = sc.nextInt();
                int Y = sc.nextInt();

                if(X==N || Y==M){
                    System.out.println("divisa");
                } else if (X > N && Y > M) {
                    System.out.println("NE");
                } else if (X < N && Y > M) {
                    System.out.println("NO");
                } else if (X < N && Y < M) {
                    System.out.println("SO");
                } else if (X > N && Y < M) {
                    System.out.println("SE");
                }
            }
        }
        sc.close();
    }
}
