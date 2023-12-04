package QuickSort;

public class QuickSortMethod {
    public static void trocar(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int particionar(int[] arr, int baixo, int alto) {
        int pivo = arr[alto];
        int i = baixo - 1;

        System.out.print("Divisão: ");
        for (int j = baixo; j <= alto - 1; j++) {
            if (arr[j] < pivo) {
                i++;
                trocar(arr, i, j);
            }
        }
        trocar(arr, i + 1, alto);

        for (int k = baixo; k <= alto; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

        return i + 1;
    }

    public static void quickSort(int[] arr, int baixo, int alto) {
        if (baixo < alto) {
            int indicePivo = particionar(arr, baixo, alto);

            quickSort(arr, baixo, indicePivo - 1);
            quickSort(arr, indicePivo + 1, alto);
        }
    }
}
