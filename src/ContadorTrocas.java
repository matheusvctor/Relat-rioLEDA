public class ContadorTrocas {

    public static long trocasInsertionSort(int[] arr) {
        int n = arr.length;
        long trocas = 0;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                trocas++;
            }
            arr[j + 1] = key;
        }
        return trocas;
    }

    public static long trocasSelectionSort(int[] arr) {
        int n = arr.length;
        long trocas = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            trocas++;
        }
        return trocas;
    }

    public static long trocasBubbleSort(int[] arr) {
        int n = arr.length;
        long trocas = 0;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    trocas++;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return trocas;
    }
}
