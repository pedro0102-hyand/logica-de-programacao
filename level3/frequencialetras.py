from collections import Counter

# Número de casos de teste
N = int(input())

for _ in range(N):
    linha = input().strip().lower()
    letras = [c for c in linha if c.isalpha()]
    contagem = Counter(letras)
    if contagem:
        max_freq = max(contagem.values())
        mais_frequentes = [letra for letra, freq in contagem.items() if freq == max_freq]
        print(''.join(sorted(mais_frequentes)))
