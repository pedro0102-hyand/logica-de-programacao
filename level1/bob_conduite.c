#include <stdio.h>

int main() {
    int T, R1, R2;
    scanf("%d", &T);
    
    while (T--) {
        scanf("%d %d", &R1, &R2);
        printf("%d\n", R1 + R2);
    }
    
    return 0;
}
