#include <stdio.h>

int main() {
    int gols_inter, gols_gremio;
    int opcao = 1;
    int total_grenais = 0;
    int vitorias_inter = 0;
    int vitorias_gremio = 0;
    int empates = 0;
    
    while (opcao == 1) {
        // Leitura dos gols
        scanf("%d %d", &gols_inter, &gols_gremio);
        total_grenais++;
        
        // Contagem de vitórias e empates
        if (gols_inter > gols_gremio) {
            vitorias_inter++;
        } else if (gols_gremio > gols_inter) {
            vitorias_gremio++;
        } else {
            empates++;
        }
        
        // Solicitação de novo grenal
        printf("Novo grenal (1-sim 2-nao)\n");
        scanf("%d", &opcao);
    }
    
    // Impressão das estatísticas
    printf("%d grenais\n", total_grenais);
    printf("Inter:%d\n", vitorias_inter);
    printf("Gremio:%d\n", vitorias_gremio);
    printf("Empates:%d\n", empates);
    
    // Determinação do vencedor
    if (vitorias_inter > vitorias_gremio) {
        printf("Inter venceu mais\n");
    } else if (vitorias_gremio > vitorias_inter) {
        printf("Gremio venceu mais\n");
    } else {
        printf("Nao houve vencedor\n");
    }
    
    return 0;
}