import java.util.*;

public class josephus {

    static List<Integer> gerarPrimos(int limite){
        boolean [] ehComposto = new boolean[limite+1];
        List<Integer> primos = new ArrayList<>();

        for(int i = 2 ; i<= limite; i++){
            if(!ehComposto[i]){
                primos.add(i);
                for(int j =  i * 2; j<=limite; j*=i){
                    ehComposto[j] = true;
                }
            }
        }

        return primos;

    }

    static int josephusComPrimos(int n, List<Integer> primos){
        List<Integer> pessoas =  new ArrayList<>();
        for(int i = 1; i <= n; i++){
            pessoas.add(i);
        }

        int indice = 0;
        int rodada = 0;

        while (pessoas.size() > 1){
            int m =  primos.get(rodada);
            indice = (indice + m - 1) % pessoas.size();
            pessoas.remove(indice);
            rodada++;
        }
        return pessoas.get(0);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> primos = gerarPrimos(40000);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            System.out.println(josephusComPrimos(n, primos));
        }
        sc.close();
    }
}
