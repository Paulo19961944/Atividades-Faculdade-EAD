package MergeSort;

public class MergeSortMethod {
    public static void mergesort(int[] v, int[] c, int i, int f) {
        if (f <= i)
            return;

        int m = (f + i) / 2;

        System.out.print("Dividir: ");
        for (int z = i; z <= f; z++) {
            System.out.print(v[z] + " ");
        }
        System.out.println();

        mergesort(v, c, i, m);
        mergesort(v, c, m + 1, f);

        MergeMethod.merge(v, c, i, m, f);
    }
}
