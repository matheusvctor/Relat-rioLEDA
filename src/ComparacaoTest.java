import static org.junit.Assert.*;

import org.junit.Test;

public class ComparacaoTest {

    @Test
    public void testInsertionSort() {
        int[] arr = Comparacao.gerarArrayAleatorio(1000);
        int[] arrCopia = arr.clone();

        long trocas = ContadorTrocas.trocasInsertionSort(arr);
        long comparacoes = ContadorComparacoes.comparacoesInsertionSort(arrCopia);
        long tempoInicial = System.currentTimeMillis();
        Comparacao.insertionSort(arr);
        long tempoFinal = System.currentTimeMillis();
        long tempoExecucao = tempoFinal - tempoInicial;

        assertTrue(isSorted(arr));
        System.out.println("Insertion Sort:");
        System.out.println("Trocas: " + trocas);
        System.out.println("Comparacoes: " + comparacoes);
        System.out.println("Tempo de execucao: " + tempoExecucao + " milissegundos\n");
    }

    @Test
    public void testSelectionSort() {
        int[] arr = Comparacao.gerarArrayAleatorio(1000);
        int[] arrCopia = arr.clone();

        long trocas = ContadorTrocas.trocasSelectionSort(arr);
        long comparacoes = ContadorComparacoes.comparacoesSelectionSort(arrCopia);
        long tempoInicial = System.currentTimeMillis();
        Comparacao.selectionSort(arr);
        long tempoFinal = System.currentTimeMillis();
        long tempoExecucao = tempoFinal - tempoInicial;

        assertTrue(isSorted(arr));
        System.out.println("Selection Sort:");
        System.out.println("Trocas: " + trocas);
        System.out.println("Comparacoes: " + comparacoes);
        System.out.println("Tempo de execucao " + tempoExecucao + " milissegundos\n");
    }

    @Test
    public void testBubbleSort() {
        int[] arr = Comparacao.gerarArrayAleatorio(1000);
        int[] arrCopia = arr.clone();

        long trocas = ContadorTrocas.trocasBubbleSort(arr);
        long comparacoes = ContadorComparacoes.comparacoesBubbleSort(arrCopia);
        long tempoInicial = System.currentTimeMillis();
        Comparacao.bubbleSort(arr);
        long tempoFinal = System.currentTimeMillis();
        long tempoExecucao = tempoFinal - tempoInicial;

        assertTrue(isSorted(arr));
        System.out.println("Bubble Sort:");
        System.out.println("Trocas: " + trocas);
        System.out.println("Comparacoes: " + comparacoes);
        System.out.println("Tempo de execucao: " + tempoExecucao + " milissegundos\n");
    }

    // Método auxiliar para verificar se o array está ordenado
    private boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
