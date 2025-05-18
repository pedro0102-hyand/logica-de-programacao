#include<stdio.h>

int main(void){

    int T1, T2, T3, T4;
    int total;

    scanf("%d %d %d %d", &T1, &T2, &T3, &T4);

    total = T1 + T2 + T3 + T4 - 3;

    printf("%d\n", total);

    return 0;
}