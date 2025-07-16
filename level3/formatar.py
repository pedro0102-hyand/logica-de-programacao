def formatar_texto():
    while True:
        N = int(input())
        if N == 0 :
            break

        linhas = []
        max_len = 0

        for _ in range(N):
            linha = input().strip()   #remove caracteres do inicio e do fim da string
            palavras = linha.split() #remove espacos duplicados
            linha_formatada  = ' '.join(palavras)
            max_len  = max(max_len, len(linha_formatada))
            linhas.append(linha_formatada)

            #impressao à direita
            for linha in linhas:
                print(linha.rjust(max_len))
            
            print()
formatar_texto()