#include<stdio.h>

int main(void){
    int i, L;
    int velocidade, maxima, nivel;

    while(scanf("%d", &L) != EOF){
        maxima = 0;

        for(i =0; i < L ; i++){
            scanf("%d", &velocidade);
            if(velocidade > maxima){
                maxima = velocidade;
            }
         }

         if ( maxima < 10){
            nivel = 1;
         }else if ( maxima < 20){
            nivel = 2;
         }else{
            nivel = 3;
         }
         printf("%d\n", nivel);
    }
    return 0;
}