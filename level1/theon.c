#include<stdio.h>
int main(void){
    int n, i;
    int t[100], min_tiros = 21, resposta = 1;

    scanf("%d", &n);
    for(i=0;i<n;i++){
        scanf("%d", &t[i]);
        if(t[i] < min_tiros){
            min_tiros = t[i];
            resposta = i + 1;
        }
    }
    printf("%d\n", resposta);
    return 0;
}