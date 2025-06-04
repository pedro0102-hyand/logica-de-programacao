#include<stdio.h>

int main(void){

    int T1, T2, T3, T4;
    int resultado;

    scanf("%d %d %d %d", &T1, &T2, &T3, &T4);
    resultado = (T1+T2+T3+T4)-3;

    printf("%d\n", resultado);
}