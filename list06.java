import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class list06{
        public static void main (String [] args) {
            ArrayList<Integer> numeros = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < 10; i++) {
                int numeroAleatorio = random.nextInt(100) + 1; // [1, 100]
                numeros.add(numeroAleatorio);
            }
            System.out.println("Números gerados (antes da ordenação):");
            System.out.println(numeros);
            Collections.sort(numeros);
            System.out.println("Números ordenados (ordem crescente):");
            System.out.println(numeros);
}
}