#include <stdio.h>

int forma(int a, int b, int c){
    return (a+b>c) && (a+c>b) && (b+c>a);
}

int main(void){

    int A, B, C, D;
    scanf("%d %d %d %d", &A, &B, &C, &D);

    if (forma(A, B, C) || 
        forma(A, B, D) || 
        forma(A, C, D) || 
        forma(B, C, D)) {
        printf("S\n");
    } else {
        printf("N\n");
    }
    return 0;
}