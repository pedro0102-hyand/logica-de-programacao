import java.util.*;

public class Formula1Pontuacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int G = sc.nextInt();
            int P = sc.nextInt();
            if(G==0 && P==0) break;

            int[][] resultado = new int[G][P];
            for(int g = 0; g <G; g++){
                for(int p = 0 ; p<P; p++){
                    resultado[g][p] = sc.nextInt();
                }
            }

            int S = sc.nextInt();
            for(int s =0; s<S; s++){
                int K = sc.nextInt();
                int [] pontosSistema = new int[K];
                for(int i = 0; i<K; i++){
                    pontosSistema[i] = sc.nextInt();
                }

                int[] pontuacao = new int[P];
                for(int g = 0; g<G; g++){
                    for(int p = 0; p<P; p++){
                        int posicao = resultado[g][p];
                        if(posicao <= K){
                            pontuacao[p] += pontosSistema[posicao-1];
                        }
                    }
                }
                int maior = 0;
                for(int p = 0 ; p<P; p++){
                    if(pontuacao[p]>maior){
                        maior = pontuacao[p];
                    }
                }
                List<Integer> campeoes = new ArrayList<>();
                for(int p = 0; p<P; p++){
                    if(pontuacao[p] == maior){
                        campeoes.add(p+1);
                    }
                }
                for(int i = 0; i<campeoes.size(); i++){
                    System.out.println(campeoes.get(i));
                    if(i<campeoes.size()-1) System.out.print("");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
