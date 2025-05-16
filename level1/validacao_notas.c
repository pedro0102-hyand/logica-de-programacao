#include <stdio.h>

int main(void) {
    float nota, nota1, nota2;
    int cont = 1;

    while (cont == 1) {
        int x = 0;
        while (x < 2) {
            scanf("%f", &nota);
            if (nota >= 0.0 && nota <= 10.0) {
                if (x == 0) {
                    nota1 = nota;
                } else {
                    nota2 = nota;
                }
                x++;
            } else {
                printf("nota invalida\n");
            }
        }

        float media = (nota1 + nota2) / 2.0;
        printf("media = %.2f\n", media);

        int opcao_valida = 0;
        while (!opcao_valida) {
            int resposta;
            printf("novo calculo (1-sim 2-nao)\n");
            scanf("%d", &resposta);

            if (resposta == 1) {
                cont = 1;
                opcao_valida = 1;
            } else if (resposta == 2) {
                cont = 0;
                opcao_valida = 1;
            }
        }
    }

    return 0;
}
