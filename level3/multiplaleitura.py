import sys
import math

def calcular_ciclos(rastro, P):
    ciclos = 0
    i = 0
    n = len(rastro)

    while i < n:
        if rastro[i] == 'W':
            # Cada gravação consome 1 ciclo
            ciclos += 1
            i += 1
        else:
            # Contar bloco contínuo de leituras
            cont_leituras = 0
            while i < n and rastro[i] == 'R':
                cont_leituras += 1
                i += 1
            # Agrupar leituras em blocos de até P por ciclo
            ciclos += math.ceil(cont_leituras / P)
    
    return ciclos

# Leitura até EOF
entradas = sys.stdin.read().splitlines()

# Processa pares de linhas
for i in range(0, len(entradas), 2):
    rastro = entradas[i].strip()
    P = int(entradas[i + 1].strip())
    print(calcular_ciclos(rastro, P))
