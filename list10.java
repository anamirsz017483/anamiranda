import java.util.ArrayList;
import java.util.Scanner;
public class list10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n----- Lista de Tarefas -----");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa por nome");
            System.out.println("3 - Listar tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String novaTarefa = scanner.nextLine();
                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o nome exato da tarefa a ser removida: ");
                    String tarefaRemover = scanner.nextLine();
                    if (tarefas.remove(tarefaRemover)) {
                        System.out.println("Tarefa removida com sucesso.");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("\nTarefas atuais:");
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa adicionada ainda.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }
}
