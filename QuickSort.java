public class QuickSort {
    public static void main(String[] args) {
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("\nArray original:");
        printArray(array, -1, array.length - 1);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nArray ordenado:");
        printArray(array, -1, array.length - 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int indicePivo = particao(arr, low, high);
            quickSort(arr, low, indicePivo - 1);
            quickSort(arr, indicePivo + 1, high);
        }
    }

    public static int particao(int[] arr, int low, int high) {
        int pivo = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivo) {
                i++;
                trocar(arr, i, j);
            }
        }

        trocar(arr, i + 1, high);

        System.out.print("Iteração: ");
        printArrayMudado(arr, i + 1, high);
        try {
            Thread.sleep(700); // Pausa de 0,7 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return i + 1;
    }

    public static void trocar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr, int comeco, int fim) {
        for (int i = 0; i < arr.length; i++) {
            if ((i == comeco || i == fim) && i != arr.length - 1) {
                System.out.print("\u001B[32m" + arr[i] + " " + "\u001B[0m"); // Texto verde
            } else if (i == arr.length - 1) {
                System.out.println(arr[i]); // Para o último número, imprima em uma nova linha
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void printArrayMudado(int[] arr, int comeco, int fim) {
        for (int i = 0; i < arr.length; i++) {
            if (i >= comeco && i <= fim) {
                System.out.print("\u001B[32m" + arr[i] + " " + "\u001B[0m"); // Texto verde
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
