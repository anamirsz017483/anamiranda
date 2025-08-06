import java.util.Scanner;
import java.util.ArrayList;

public class list04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();


        System.out.print("Quantas notas deseja inserir? ");
        int quantidade = ler.nextInt();
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = ler.nextDouble();
            notas.add(nota);
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();
        int acimaDaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            }
        }
        System.out.printf("Média das notas: %.2f", media);
        System.out.println("Quantidade de notas acima da média: " + acimaDaMedia);

    }
}