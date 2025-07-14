import java.util.Scanner;

public class CaraOuCoroa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int N = sc.nextInt();
            if(N==0) break;
            
            int mary = 0;
            int john = 0;

            for(int i = 0 ; i < N; i++){
                int resultado = sc.nextInt();
                if(resultado == 0 ){
                    mary++;
                }else{
                    john++;
                }
            }
            System.out.println("Mary won " + mary + " times and John won " + john + " times");
        }
        sc.close();
    }
}
