#include<stdio.h>
#include<string.h>

int main(void){

    int i, N, C;
    char nome[100];
    scanf("%d", &C);

    for(i=0;i<C;i++){
        scanf("%s %d", nome, &N);
        if(strcmp(nome, "Thor")==0){
            printf("Y\n");
        }else{
            printf("N\n");
        }
    }
    return 0;
}