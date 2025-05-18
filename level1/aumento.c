#include<stdio.h>

int main(void){

    double A, B;
    double aumento;

    scanf("%lf %lf", &A, &B);

    aumento =((B-A)/A)*100.0;

    printf("%.2lf %%\n", aumento);

}