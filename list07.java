import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class list07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite números inteiros (digite -1 para encerrar):");

        while (true) {
            int numero = ler.nextInt();
            if (numero == -1) {
                break;
            }
            numeros.add(numero);
        }
        if (numeros.isEmpty()) {
            System.out.println("Nenhum número foi inserido.");
        } else {
            int maior = Collections.max(numeros);
            int menor = Collections.min(numeros);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }
    }
}
