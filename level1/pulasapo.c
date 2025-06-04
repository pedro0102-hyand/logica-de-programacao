#include <stdio.h>

int main(void) {
    int P, N;
    int atual, proximo;
    
    scanf("%d %d", &P, &N);
    
    scanf("%d", &atual);

    for (int i = 1; i < N; i++) {
        scanf("%d", &proximo);
        int diff = proximo - atual;
        if (diff < 0) diff = -diff; 
        if (diff > P) {
            printf("GAME OVER\n");
            return 0; 
        }
        atual = proximo;
    }
    
    printf("YOU WIN\n");
    return 0;
}