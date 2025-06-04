#include<stdio.h>

int main(void){

    int S, T , F;
    int chegada;
    scanf("%d %d %d", &S, &T, &F);
    chegada = (S + T + F) % 24;

    if (chegada < 0){
        chegada += 24;
    }

    printf("%d\n", chegada);


}