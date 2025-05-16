#include <stdio.h>

int get_choice(char *choice) {
    if (choice[0] == 't') return 0;
    if (choice[0] == 'p') {
        if (choice[1] == 'a') return 1;
        return 2;
    }
    if (choice[0] == 'l') return 3;
    if (choice[0] == 'S') return 4;
    return -1;
}

int determine_winner(int sheldon, int raj) {
    if (sheldon == raj) return 0;
    if (sheldon == 0) {
        if (raj == 1 || raj == 3) return 1;
        return -1;
    }
    if (sheldon == 1) {
        if (raj == 2 || raj == 4) return 1;
        return -1;
    }
    if (sheldon == 2) {
        if (raj == 3 || raj == 0) return 1;
        return -1;
    }
    if (sheldon == 3) {
        if (raj == 4 || raj == 1) return 1;
        return -1;
    }
    if (sheldon == 4) {
        if (raj == 0 || raj == 2) return 1;
        return -1;
    }
    return 0;
}

int main(void) {
    int T;
    if (scanf("%d", &T) != 1) return 1; // Verifica leitura de T
    getchar(); // Consome a quebra de linha após T

    for (int t = 1; t <= T; t++) {
        char sheldon[10], raj[10];
        if (scanf("%s %s", sheldon, raj) != 2) {
            return 1; // Sai se a leitura falhar
        }
        getchar(); // Consome a quebra de linha após cada caso

        int sheldon_choice = get_choice(sheldon);
        int raj_choice = get_choice(raj);

        int result = determine_winner(sheldon_choice, raj_choice);

        printf("Caso #%d: ", t);
        if (result == 1) {
            printf("Bazinga!\n");
        } else if (result == -1) {
            printf("Raj trapaceou!\n");
        } else {
            printf("De novo!\n");
        }
        fflush(stdout);
    }
    return 0;
}