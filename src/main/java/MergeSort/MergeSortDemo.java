package MergeSort;

public class MergeSortDemo {
    public static void main(String[] args) {
        int[] v = {30, 20, 50, 60, 80, 40, 70, 10, 90, 100};
        int n = v.length;

        System.out.print("Lista Inicial: ");
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();

        int[] c = new int[n];
        MergeSortMethod.mergesort(v, c, 0, n - 1);

        System.out.print("Lista Ordenada: ");
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
