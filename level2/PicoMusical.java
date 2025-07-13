import java.util.*;

public class PicoMusical {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int N = sc.nextInt();
            if(N==0) break;

            int[] H = new int[N];
            for(int i = 0; i<N; i++){
                H[i] = sc.nextInt();
            }

            int picos = 0 ;

            for(int i = 0 ; i<N; i++){
                int prev  = H[(i-1+N)%N];
                int next = H[(i+1)%N];
                if((H[i]>prev && H[i]>next) || (H[i]<prev &&H[i]<next)){
                    picos++;
                }
            }
            System.out.println(picos);
        }
        sc.close();
    }
}
