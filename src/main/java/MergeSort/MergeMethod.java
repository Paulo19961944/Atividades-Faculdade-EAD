package MergeSort;

public class MergeMethod {
    public static void merge(int[] v, int[] c, int i, int m, int f) {
        int z, iv, ic;

        for (iv = i, ic = m + 1, z = i; iv <= m && ic <= f; z++) {
            if (v[iv] <= v[ic])
                c[z] = v[iv++];
            else
                c[z] = v[ic++];
        }

        while (iv <= m)
            c[z++] = v[iv++];

        while (ic <= f)
            c[z++] = v[ic++];

        for (z = i; z <= f; z++)
            v[z] = c[z];

        System.out.print("Merge: ");
        for (z = i; z <= f; z++) {
            System.out.print(v[z] + " ");
        }
        System.out.println();
    }
}
