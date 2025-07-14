import java.util.Scanner;
public class SonoDaDaniela {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        while(true){
            int H1 = sc.nextInt();
            int M1 = sc.nextInt();
            int H2 = sc.nextInt();
            int M2 = sc.nextInt();

            if(H1==0 && M1==0 && H2==0 && M2==0){
                break;
            }

            int inicio = H1 * 60 + M1;
            int alarme = H2 * 60 + M2;

            int minutos;
            if(alarme > inicio){
                minutos = alarme - inicio;
            }else{
                minutos = (24 * 60 - inicio) + alarme;
            }
            System.out.println(minutos);
        }
        sc.close();
    }
}
