import java.util.*;

public class Tautogramas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String linha = sc.nextLine();
            if (linha.equals("*")) break;

            String[] palavras = linha.split(" ");
            char letraReferencia = Character.toLowerCase(palavras[0].charAt(0));
            boolean tautograma = true;

            for (String palavra : palavras) {
                if (Character.toLowerCase(palavra.charAt(0)) != letraReferencia) {
                    tautograma = false;
                    break;
                }
            }

            System.out.println(tautograma ? "Y" : "N");
        }

        sc.close();
    }
}

