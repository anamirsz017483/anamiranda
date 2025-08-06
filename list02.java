import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class list02 {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("escreva 05 nomes diferentes: ");
        for (int i=0; i<5;i++) {
            System.out.println("nome" + (i + 1) + " : ");
            String nome = ler.nextLine();
            nomes.add(nome);
        }
        System.out.println ("nomes em ordem diferentes: ");
        for (int i = nomes.size() -1; i >= 0; i--) {
            System.out.println(nomes.get(i));

        }

    }

}
