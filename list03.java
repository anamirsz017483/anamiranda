import java.util.ArrayList;

public class list03 {
    public static void main(String[] args) {
        ArrayList<Integer> pares = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            pares.add(i * 2);
        }

        pares.removeIf(numero -> numero % 4 == 0);

        System.out.println("Números pares (sem os divisíveis por 4):");
        for (int numero : pares) {
            System.out.print(numero + " ");
        }
    }
}

