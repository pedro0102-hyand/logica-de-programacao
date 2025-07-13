import java.util.*;

public class bingo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int N = sc.nextInt();
            int B = sc.nextInt();
            if(N==0 && B ==0) break;

            int[] bolas =  new int[B];
            for(int i = 0 ; i < B; i++){
                bolas[i] = sc.nextInt();
            }

            boolean[] podeserFormado = new boolean[N+1];

            for(int i = 0; i < B; i++){
                for(int j = 0; j< B; j++){
                    int diff = Math.abs(bolas[i]-bolas[j]);
                    if(diff <= N){
                        podeserFormado[diff] = true;
                    }
                }
            }

            boolean completo =  true;
            for(int i = 0; i <= N; i++){
                if(!podeserFormado[i]){
                    completo = false;
                    break;
                }
            }

            System.out.println(completo ? "Y" : "N");
        }

        sc.close();

    }
}
