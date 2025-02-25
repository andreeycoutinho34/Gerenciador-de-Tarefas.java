import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorTarefas {

    private static List<String> tarefas = new ArrayList<>();
    private static List<String> tarefasConcluidas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Editar tarefa");
            System.out.println("4 - Excluir tarefa");
            System.out.println("5 - Marcar tarefa como concluída");
            System.out.println("6 - Listar tarefas concluídas");
            System.out.println("7 - Sair");
            
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarTarefa(scanner);
                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    editarTarefa(scanner);
                    break;
                case 4:
                    excluirTarefa(scanner);
                    break;
                case 5:
                    marcarTarefaComoConcluida(scanner);
                    break;
                case 6:
                    listarTarefasConcluidas();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void adicionarTarefa(Scanner scanner) {
        System.out.print("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();
        tarefas.add(descricao);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    private static void listarTarefas() {
        System.out.println("\n--- Lista de Tarefas ---");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + " - " + tarefas.get(i));
        }
    }

    private static void editarTarefa(Scanner scanner) {
        System.out.println("Digite o número da tarefa que deseja editar: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a nova descrição da tarefa: ");
        String descricao = scanner.nextLine();
        tarefas.set(numero - 1, descricao);
        System.out.println("Tarefa editada com sucesso!");
    }

    private static void excluirTarefa(Scanner scanner) {
        System.out.println("Digite o número da tarefa que deseja excluir: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        tarefas.remove(numero - 1);
        System.out.println("Tarefa excluída com sucesso!");
    }

    private static void marcarTarefaComoConcluida(Scanner scanner) {
        System.out.println("Digite o número da tarefa que deseja marcar como concluída: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        String tarefaConcluida = tarefas.remove(numero - 1);
        tarefasConcluidas.add(tarefaConcluida);
        System.out.println("Tarefa marcada como concluída com sucesso!");
    }

    private static void listarTarefasConcluidas() {
        System.out.println("\n--- Lista de Tarefas Concluídas ---");
        for (int i = 0; i < tarefasConcluidas.size(); i++) {
            System.out.println((i + 1) + " - " + tarefasConcluidas.get(i));
        }
    }
}