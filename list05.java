import java.util.ArrayList;
import java.util.Scanner;

public class list05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = ler.nextLine();


        String[] palavras = frase.split("\\s+");
        ArrayList<String> listaPalavras = new ArrayList<>();

        for (String palavra : palavras) {
            listaPalavras.add(palavra);
        }
        System.out.println("A frase possui " + listaPalavras.size() + " palavras.");

        System.out.println("Palavras que começam com 'A' ou 'a':");
        for (String palavra : listaPalavras) {
            if (palavra.toLowerCase().startsWith("a")) {
                System.out.println(palavra);
            }
        }
    }
}

