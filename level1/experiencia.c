#include <stdio.h>

int main() {
    int N, Quantia;
    char Tipo;
    int total_cobaias = 0, total_coelhos = 0, total_ratos = 0, total_sapos = 0;
    
    scanf("%d", &N);
    
    for (int i = 0; i < N; i++) {
        scanf("%d %c", &Quantia, &Tipo);
        
        total_cobaias += Quantia;
        if (Tipo == 'C') {
            total_coelhos += Quantia;
        } else if (Tipo == 'R') {
            total_ratos += Quantia;
        } else if (Tipo == 'S') {
            total_sapos += Quantia;
        }
    }
    
    float perc_coelhos = (float)total_coelhos / total_cobaias * 100;
    float perc_ratos = (float)total_ratos / total_cobaias * 100;
    float perc_sapos = (float)total_sapos / total_cobaias * 100;
    
    printf("Total: %d cobaias\n", total_cobaias);
    printf("Total de coelhos: %d\n", total_coelhos);
    printf("Total de ratos: %d\n", total_ratos);
    printf("Total de sapos: %d\n", total_sapos);
    printf("Percentual de coelhos: %.2f %%\n", perc_coelhos);
    printf("Percentual de ratos: %.2f %%\n", perc_ratos);
    printf("Percentual de sapos: %.2f %%\n", perc_sapos);
    
    return 0;
}