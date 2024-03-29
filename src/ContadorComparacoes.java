public class ContadorComparacoes {

    public static long comparacoesInsertionSort(int[] arr) {
        int n = arr.length;
        long comparacoes = 0;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                comparacoes++;
            }
            arr[j + 1] = key;
        }
        return comparacoes;
    }

    public static long comparacoesSelectionSort(int[] arr) {
        int n = arr.length;
        long comparacoes = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                comparacoes++;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return comparacoes;
    }

    public static long comparacoesBubbleSort(int[] arr) {
        int n = arr.length;
        long comparacoes = 0;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                comparacoes++;
            }
            if (!swapped) {
                break;
            }
        }
        return comparacoes;
    }
}
