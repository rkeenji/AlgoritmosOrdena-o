import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("====================================");
            System.out.println("Escolha um algoritmo de ordenação:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Quick Sort");
            System.out.println("4. Sair");
            System.out.println("====================================\n");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nBubble Sort:");
                    BubbleSort.main(new String[0]);
                    break;
                case 2:
                    System.out.println("\nInsertion Sort:");
                    InsertionSort.main(new String[0]);
                    break;
                case 3:
                    System.out.println("\nQuick Sort:");
                    QuickSort.main(new String[0]);
                    break;
                case 4:
                    System.out.println("Saindo do programa. Até logo!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        }
    }
}
