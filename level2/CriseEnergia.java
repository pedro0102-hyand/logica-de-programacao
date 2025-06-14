public class CriseEnergia{

    public static int Desligar(int n, int m) {

        boolean [] desligado = new boolean [n+1];
        int ativa = n;
        int atual = 1;

        while(ativa > 1){
            int passos  = 0;
            while(passos < m){
                if(!desligado[atual]){
                    passos++;
                }
                if(passos<m){
                    atual++;
                    if(atual>n){
                        atual = 1;
                    }
                }
            }

            desligado[atual]=true;
            ativa--;

            if(ativa>0){
                do{
                    atual++;
                    if(atual>n){
                        atual=1;
                    }
                }while(desligado[atual]);
            }
            
        }

        for(int i  = 1; i <= n; i++){
            if(!desligado[i]){
                return i;
            }
        }
        return -1; 
    }

    public static int Menor(int n){
        for(int m = 1; m<=n; m++){
            if(Desligar(n, m) == 13){
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] entradas = {17,0};
        int i;
        for(i=0;i<entradas.length;i++){
            int n = entradas[i];
            if(n==0){
                break;
            }
            int resultado = Menor(n);
            System.out.println(resultado);
        }
    }
}

