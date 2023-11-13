public class BubbleSort {

    // Método para imprimir um array com destaque nas posições que foram alteradas
    public static void printArray(int[] arr, int swappedIndex) {
        for (int i = 0; i < arr.length; i++) {
            if (i == swappedIndex) {
                System.out.print("\u001B[32m" + arr[i] + "\u001B[0m "); // Texto verde
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca arr[j] e arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Imprime o array a cada iteração
            System.out.print("Iteração " + (i + 1) + ": ");
            printArray(arr, n - i - 1);
            try {
                Thread.sleep(700); // Pausa de 0,7 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!swapped) {
                break; // Se nenhum elemento foi trocado, o array está ordenado
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.print("\nArray original: \n");
        printArray(arr, -1);

        bubbleSort(arr); // Chama o Bubble Sort

        System.out.print("\nArray ordenado: ");
        printArray(arr, -1);
    }
}
