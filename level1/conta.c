#include<stdio.h>

int main(void){

    int C, N;
    scanf("%d", &C);

    for(int i = 0; i < C; i++){
        scanf("%d", &N);
        int S = N%2;
        printf("%d\n", S);
    }
    return 0;
}