import java.util.ArrayList;
import java.util.List;
public class exercicio01 {
    public static void main(String[] args) {

        ArrayList<Integer> multiplicado = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            multiplicado.add(i);
        }
        System.out.println("Os números multiplicados por 2 é igual a: ");
        for(int numero : multiplicado){
            System.out.println(numero * 2);
        }
    }
}

